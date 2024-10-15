package Controller;

import Model.connect;
import Model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductController extends connect {

    // Phương thức lấy danh sách sản phẩm từ cơ sở dữ liệu
    public List<Product> GetProduct() throws SQLException {
        List<Product> result = new ArrayList<>();
        String query = "SELECT * FROM Product";

        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String productName = rs.getString("product_name");
                String productType = rs.getString("product_type");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                float price = rs.getFloat("price");
                int quantityInStock = rs.getInt("quantity_in_stock");
                String description = rs.getString("description");
                String condition = rs.getString("condition");
                int categoryId = rs.getInt("category_id");

                Product product = new Product(id, productName, productType, brand, model, price, quantityInStock, description, condition, categoryId);
                result.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    // Phương thức để lấy tổng số sản phẩm
    public int getTotalProducts() throws SQLException {
        String query = "SELECT COUNT(*) FROM Product";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    // Phương thức thêm sản phẩm mới
    public boolean addProduct(Product product) {

        String query = "INSERT INTO Product (product_name, product_type, brand, model, price, quantity_in_stock, description, condition, category_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, product.getProductName());
            pstmt.setString(2, product.getProductType());
            pstmt.setString(3, product.getBrand());
            pstmt.setString(4, product.getModel());
            pstmt.setFloat(5, (float) product.getPrice());
            pstmt.setInt(6, product.getQuantityInStock());
            pstmt.setString(7, product.getDescription());
            pstmt.setString(8, product.getCondition());
            pstmt.setInt(9, product.getCategoryId());

            int rowsInserted = pstmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException ex) {

            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, "SQL error occurred", ex);
            return false;
        }
    }

    // Phương thức sửa thông tin sản phẩm theo ID
    public boolean updateProduct(Product product) {
        String query = "UPDATE Product SET product_name = ?, product_type = ?, brand = ?, model = ?, price = ?, quantity_in_stock = ?, description = ?, condition = ?, category_id = ? WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, product.getProductName());
            pstmt.setString(2, product.getProductType());
            pstmt.setString(3, product.getBrand());
            pstmt.setString(4, product.getModel());
            pstmt.setFloat(5, (float) product.getPrice());
            pstmt.setInt(6, product.getQuantityInStock());
            pstmt.setString(7, product.getDescription());
            pstmt.setString(8, product.getCondition());
            pstmt.setInt(9, product.getCategoryId());
            pstmt.setInt(10, product.getId());

            int rowsUpdated = pstmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    // Phương thức xóa sản phẩm theo ID
    public boolean deleteProduct(int id) {
        String query = "DELETE FROM Product WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);

            int rowsDeleted = pstmt.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    // Phương thức tìm kiếm sản phẩm theo tên
    public List<Product> searchProductByName(String name) {
        List<Product> result = new ArrayList<>();
        String query = "SELECT * FROM Product WHERE product_name LIKE ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, "%" + name + "%");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String productName = rs.getString("product_name");
                String productType = rs.getString("product_type");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                float price = rs.getFloat("price");
                int quantityInStock = rs.getInt("quantity_in_stock");
                String description = rs.getString("description");
                String condition = rs.getString("condition");
                int categoryId = rs.getInt("category_id");

                Product product = new Product(id, productName, productType, brand, model, price, quantityInStock, description, condition, categoryId);
                result.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }
}

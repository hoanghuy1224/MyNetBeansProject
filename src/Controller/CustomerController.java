package Controller;

import Model.Customer;
import Model.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerController extends connect {

    // lấy tất cả danh sách khách hàng
    public List<Customer> getAllCustomers() {
        List<Customer> result = new ArrayList<>();
        String sql = "SELECT * FROM Customer";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Customer cu = new Customer();
                cu.setId(rs.getInt("id"));
                cu.setFull_name(rs.getString("full_name"));
                cu.setEmail(rs.getString("email"));
                cu.setPhone_number(rs.getInt("phone_number"));
                cu.setAddress(rs.getString("address"));
                result.add(cu);
            }
        } catch (SQLException e) {
        }
        return result;
    }

    // phương thức thêm khách hàng
    public void addCustomer(Customer customer) {
        String sql = "INSERT INTO Customer (full_name, email, phone_number, address) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, customer.getFull_name());
            pstmt.setString(2, customer.getEmail());
            pstmt.setInt(3, customer.getPhone_number());
            pstmt.setString(4, customer.getAddress());
            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    // phương thức lấy khahcs hàng theo id
    public Customer getCustomerById(int id) {
        String sql = "SELECT * FROM Customer WHERE id = ?";
        Customer customer = null;
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setFull_name(rs.getString("full_name"));
                customer.setEmail(rs.getString("email"));
                customer.setPhone_number(rs.getInt("phone_number"));
                customer.setAddress(rs.getString("address"));
            }
        } catch (SQLException e) {
        }
        return customer;
    }

    // phương thức sửa khách hàng
    public void updateCustomer(Customer customer) {
        String sql = "UPDATE Customer SET full_name = ?, email = ?, phone_number = ?, address = ? WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, customer.getFull_name());
            pstmt.setString(2, customer.getEmail());
            pstmt.setInt(3, customer.getPhone_number());
            pstmt.setString(4, customer.getAddress());
            pstmt.setInt(5, customer.getId());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Cập nhật thành công.");
            } else {
                System.out.println("Không tìm thấy khách hàng với ID: " + customer.getId());
            }
        } catch (SQLException e) {
            System.err.println("Lỗi cập nhật khách hàng: " + e.getMessage()); // Xử lý lỗi
        }
    }

    // phương thức xóa khách hàng
    public void deleteCustomer(int id) {
        String sql = "DELETE FROM Customer WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    // phương thức tìm kiếm khách hàng
    public List<Customer> searchCustomers(String keyword) {
        List<Customer> result = new ArrayList<>();
        String sql = "SELECT * FROM Customer WHERE full_name LIKE ? OR email LIKE ? OR phone_number LIKE ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            String searchValue = "%" + keyword + "%";
            pstmt.setString(1, searchValue);
            pstmt.setString(2, searchValue);
            pstmt.setString(3, searchValue);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setFull_name(rs.getString("full_name"));
                customer.setEmail(rs.getString("email"));
                customer.setPhone_number(rs.getInt("phone_number"));
                customer.setAddress(rs.getString("address"));
                result.add(customer);
            }
        } catch (SQLException e) {
        }
        return result;
    }

    // Lấy tổng số lượng khách hàng
    public int getTotalCustomers() {
        String sql = "SELECT COUNT(*) FROM Customer";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {

        }
        return 0;
    }
}

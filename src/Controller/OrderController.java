package Controller;

import Model.Order;
import Model.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderController extends connect {

    // Lấy tất cả đơn hàng
    public List<Order> getAlltOder() {
        List<Order> result = new ArrayList<>();
        String sql = "SELECT * FROM [Order]";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Order order = new Order();
                order.setId(rs.getInt("id"));
                order.setCustomerId(rs.getInt("customer_id"));
                order.setOrderDate(rs.getDate("order_date"));
                order.setTotalAmount(rs.getFloat("total_amount"));
                order.setStatus(rs.getString("status"));
                result.add(order);
            }
        } catch (Exception e) {
        }
        return result;
    }

    // Thêm đơn hàng mới
    public void addOrder(Order order) {
        String sql = "INSERT INTO [Order] (customer_id, order_date, total_amount, status) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, order.getCustomerId());
            pstmt.setDate(2, new java.sql.Date(order.getOrderDate().getTime()));
            pstmt.setFloat(3, order.getTotalAmount());
            pstmt.setString(4, order.getStatus());
            pstmt.executeUpdate();
        } catch (Exception e) {
        }
    }

    // Cập nhật đơn hàng
    public void updateOrder(Order order) {
        String sql = "UPDATE [Order] SET customer_id = ?, order_date = ?, total_amount = ?, status = ? WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, order.getCustomerId());
            pstmt.setDate(2, new java.sql.Date(order.getOrderDate().getTime()));
            pstmt.setFloat(3, order.getTotalAmount());
            pstmt.setString(4, order.getStatus());
            pstmt.setInt(5, order.getId());
            pstmt.executeUpdate();
        } catch (Exception e) {
        }
    }

    // Xóa đơn hàng theo ID
    public void deleteOrder(int id) {
        String sql = "DELETE FROM [Order] WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }
    }

    // Tìm kiếm đơn hàng theo ID 
    public List<Order> findOrderById(int id) {
        List<Order> orders = new ArrayList<>();
        String sql = "SELECT * FROM [Order] WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Order order = new Order();
                order.setId(rs.getInt("id"));
                order.setCustomerId(rs.getInt("customer_id"));
                order.setOrderDate(rs.getDate("order_date"));
                order.setTotalAmount(rs.getFloat("total_amount"));
                order.setStatus(rs.getString("status"));
                orders.add(order);
            }
        } catch (Exception e) {
        }
        return orders;
    }

    // Phương thức để lấy tổng số lượng đơn hàng
    public int getTotalOrders() {
        String sql = "SELECT COUNT(*) FROM [Order]";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

}

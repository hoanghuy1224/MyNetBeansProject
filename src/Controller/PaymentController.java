package Controller;

import Model.Payment;
import Model.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PaymentController extends connect {

    public List<Payment> getAllPayment() {
        List<Payment> result = new ArrayList<>();
        String sql = "select * from Payment";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Payment pay = new Payment();
                pay.setId(rs.getInt("id"));
                pay.setOrder_id(rs.getInt("order_id"));
                pay.setPayment_date(rs.getDate("payment_date"));
                pay.setPayment_method(rs.getString("payment_method"));
                pay.setAmount_paid(rs.getFloat("amount_paid"));
                result.add(pay);
            }
        } catch (Exception e) {

        }
        return result;
    }

    public void addPayment(Payment payment) {
        String sql = "INSERT INTO Payment (order_id, payment_date, payment_method, amount_paid) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, payment.getOrder_id());
            pstmt.setDate(2, new java.sql.Date(payment.getPayment_date().getTime()));
            pstmt.setString(3, payment.getPayment_method());
            pstmt.setFloat(4, payment.getAmount_paid());
            pstmt.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updatePayment(Payment payment) {
        String sql = "UPDATE Payment SET order_id = ?, payment_date = ?, payment_method = ?, amount_paid = ? WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, payment.getOrder_id());
            pstmt.setDate(2, new java.sql.Date(payment.getPayment_date().getTime()));
            pstmt.setString(3, payment.getPayment_method());
            pstmt.setFloat(4, payment.getAmount_paid());
            pstmt.setInt(5, payment.getId());
            pstmt.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deletePayment(int id) {
        String sql = "DELETE FROM Payment WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Payment> findPaymentById(int id) {
        List<Payment> result = new ArrayList<>();
        String sql = "SELECT * FROM Payment WHERE id LIKE ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + id + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Payment pay = new Payment();
                pay.setId(rs.getInt("id"));
                pay.setOrder_id(rs.getInt("order_id"));
                pay.setPayment_date(rs.getDate("payment_date"));
                pay.setPayment_method(rs.getString("payment_method"));
                pay.setAmount_paid(rs.getFloat("amount_paid"));
                result.add(pay);
            }
        } catch (Exception e) {
        }
        return result;
    }

    // Thống kê tổng số tiền đã thanh toán
    public float getTotalAmountPaid() {
        String sql = "SELECT COUNT(*) FROM Payment";
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

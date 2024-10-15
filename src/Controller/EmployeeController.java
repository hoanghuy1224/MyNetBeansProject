package Controller;

import Model.Employee;
import Model.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class EmployeeController extends connect {

    // Lấy tất cả nhân viên
    public List<Employee> GetAllEmployee() {
        List<Employee> result = new ArrayList<>();
        String sql = "select * from Employee";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setFull_name(rs.getString("full_name"));
                emp.setEmail(rs.getString("email"));
                emp.setPhone_number(rs.getInt("phone_number"));
                emp.setPosition(rs.getString("position"));
                emp.setHire_date(rs.getDate("hire_date"));

                result.add(emp);
            }
        } catch (SQLException e) {
        }
        return result;
    }

    // Thêm nhân viên mới
    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO Employee (full_name, email, phone_number, position, hire_date) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, emp.getFull_name());
            pstmt.setString(2, emp.getEmail());
            pstmt.setInt(3, emp.getPhone_number());
            pstmt.setString(4, emp.getPosition());

            java.sql.Date sqlDate = new java.sql.Date(emp.getHire_date().getTime());
            pstmt.setDate(5, sqlDate);

            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    // Sửa thông tin nhân viên
    public void updateEmployee(Employee emp) {
        String sql = "UPDATE Employee SET full_name = ?, email = ?, phone_number = ?, position = ?, hire_date = ? WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, emp.getFull_name());
            pstmt.setString(2, emp.getEmail());
            pstmt.setInt(3, emp.getPhone_number());
            pstmt.setString(4, emp.getPosition());

            java.sql.Date sqlDate = new java.sql.Date(emp.getHire_date().getTime());
            pstmt.setDate(5, sqlDate);

            pstmt.setInt(6, emp.getId());
            pstmt.executeUpdate();

        } catch (SQLException e) {

        }
    }

    // Xóa nhân viên theo ID
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM Employee WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    // Tìm kiếm nhân viên 
    public List<Employee> findEmployee(String condition) {
        List<Employee> result = new ArrayList<>();
        String sql = "SELECT * FROM Employee WHERE full_name LIKE ? OR email LIKE ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + condition + "%");
            pstmt.setString(2, "%" + condition + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setFull_name(rs.getString("full_name"));
                emp.setEmail(rs.getString("email"));
                emp.setPhone_number(rs.getInt("phone_number"));
                emp.setPosition(rs.getString("position"));

                emp.setHire_date(rs.getDate("hire_date"));

                result.add(emp);
            }
        } catch (SQLException e) {
        }
        return result;
    }

    // Lấy tổng số lượng nhân viên
    public int getTotalEmployee() {
        String sql = "SELECT COUNT(*) FROM Employee";
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

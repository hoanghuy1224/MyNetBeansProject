
package Controller;

import Model.connect;
import Model.Acount;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountController extends connect {
    
    public void addAccount(Acount acount){
        String sql = "INSERT INTO Account (Username, PasswordHash, Email) VALUES (?, ?, ?)";
        try (Connection conn = connect();  PreparedStatement prepare =conn.prepareStatement(sql)){
            prepare.setString(1, acount.getUsername());
            prepare.setString(2, acount.getPasswordHash());
            prepare.setString(3, acount.getEmail());
            prepare.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List <Acount> GetAccount(){
        List<Acount> result = new ArrayList<>();
        String sql = "select * from Account";
        try(Connection conn =connect(); PreparedStatement prepare =conn.prepareStatement(sql);) {                      
            try (ResultSet rs = prepare.executeQuery()) {
                while (rs.next()) {
                    Acount c = new Acount();
                    c.setUsername(rs.getString("Username"));
                    c.setPasswordHash(rs.getString("PasswordHash"));
                    c.setEmail(rs.getString("Email"));
                    result.add(c);
                }
            }
             prepare.close();
             
        } catch (Exception e) {
        }
        return result;
    }
}

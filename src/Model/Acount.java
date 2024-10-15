package Model;

public class Acount extends Enity {
    
   private String Username;
   private String PasswordHash;
   private String Email;

    public Acount() {
    }

    public Acount(int id, String Username, String PasswordHash, String Email) {
        super(id);
        this.Username = Username;
        this.PasswordHash = PasswordHash;
        this.Email = Email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPasswordHash() {
        return PasswordHash;
    }

    public void setPasswordHash(String PasswordHash) {
        this.PasswordHash = PasswordHash;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}

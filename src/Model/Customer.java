package Model;

public class Customer extends Enity{
    String full_name;
    String email;
    int phone_number;
    private String address;

    public Customer() {
    }

    public Customer(int id, String full_name, String email, int phone_number, String address) {
        super(id);
        this.full_name = full_name;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}

package Model;

import java.util.Date;

public class Employee extends Customer {
    private String position;
    private Date hire_date;  

    public Employee() {
    }

    public Employee(int id, String full_name, String email, int phone_number, String position, Date hire_date) {
        super(id, full_name, email, phone_number, email);
        this.full_name = full_name;
        this.email = email;
        this.phone_number = phone_number;
        this.position = position;
        this.hire_date = hire_date;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }
}

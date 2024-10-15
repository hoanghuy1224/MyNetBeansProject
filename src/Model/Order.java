package Model;

import java.util.Date;

public class Order extends Enity{

    private int CustomerId;
    private Date OrderDate;
    private float TotalAmount;
    private String Status;

    public Order() {
    }
    
    public Order(int CustomerId, Date OrderDate, float TotalAmount, String Status, int id) {
        super(id);
        this.CustomerId = CustomerId;
        this.OrderDate = OrderDate;
        this.TotalAmount = TotalAmount;
        this.Status = Status;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}

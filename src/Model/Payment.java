package Model;

import java.util.Date;

public class Payment extends Enity{
    private int order_id;
    private Date payment_date;
    private String payment_method;
    private Float amount_paid;

    public Payment() {
    }

    public Payment(int id, int order_id, Date payment_date, String payment_method, Float amount_paid) {
        super(id);
        this.order_id = order_id;
        this.payment_date = payment_date;
        this.payment_method = payment_method;
        this.amount_paid = amount_paid;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public Float getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(Float amount_paid) {
        this.amount_paid = amount_paid;
    }
    
    
}

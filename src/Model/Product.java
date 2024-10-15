package Model;

public class Product extends Enity {
    private String productName;
    private String productType;
    private String brand;
    private String model;
    private double price;
    private int quantityInStock;
    private String description;
    private String condition;
    private int categoryId;

    public Product(int id, String productName, String productType, String brand, String model, double price, int quantityInStock, String description, String condition, int categoryId) {
        super(id);  
        this.productName = productName;
        this.productType = productType;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.description = description;
        this.condition = condition;
        this.categoryId = categoryId;
    }

    public Product(int id, String productName, String productType) {
        super(id);
        this.productName = productName;
        this.productType = productType;
        this.brand = "";  
        this.model = "";
        this.price = 0.0;
        this.quantityInStock = 0;
        this.description = "";
        this.condition = "";
        this.categoryId = 0;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}

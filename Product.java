public class Product {
    private String name;
    private String productId;
    private double price;
    private int stock;

    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public void purchase(int qty) {
        if (qty <= stock)
            stock -= qty;
    }

    public void restock(int qty) {
        stock += qty;
    }
}
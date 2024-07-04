import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productId;
    private String name;
    private Date expiryDate;
    private double price;

    public Product(String productId, String name, Date expiryDate, double price) {
        this.productId = productId;
        this.name = name;
        this.expiryDate = expiryDate;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static List<Product> prefill() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("P001", "WonderCake", new Date(), 200.0));
        products.add(new Product("P002", "Refined Oil", new Date(), 150.0));
        products.add(new Product("P003", "Jamun Mix", new Date(), 100.0));
        products.add(new Product("P004", "Sugar", new Date(), 50.0));
        products.add(new Product("P005", "Luvit", new Date(), 50.0));
        products.add(new Product("P006", "Lifebuoy", new Date(), 30.0));
        products.add(new Product("P007", "Frooti", new Date(), 20.0));
        products.add(new Product("P008", "Maggi", new Date(), 30.0));
        return products;
    }
}

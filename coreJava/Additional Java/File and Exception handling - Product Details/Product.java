
public class Product{
    String productName;
    String brand;
    String color;
    Integer price;
    String ownerName;
    String ownerEmail;

    public Product() {
        super();
	}

	public Product(String productName, String brand, String color,
			Integer price, String ownerName, String ownerEmail) {
		this.productName = productName;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

}
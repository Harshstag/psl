public class Item {
	private String name;
	private String type;
	private	int cost;
	private int availableQuantity;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(String name, String type, int cost, int availableQuantity) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.availableQuantity = availableQuantity;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	public void getData() {
		if(availableQuantity > 0) {
			System.out.println(name + "," + type + "," + cost + "," + "Available");
		}else {
			System.out.println(name + "," + type + "," + cost + "," + "Not Available");
		}
		
	}

	
	
}

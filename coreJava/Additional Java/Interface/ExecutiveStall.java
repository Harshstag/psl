public class ExecutiveStall implements Stall{
	
	private String stallName;
	private int cost;
	private String ownerName;
	private int screen;

	public ExecutiveStall() {
		super();
	}


	public ExecutiveStall(String stallName, int cost, String ownerName, int screen) {
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.screen = screen;
	}


	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}
	

	@Override
	public void display() {
		System.out.println("Stall Name:"+ 	this.stallName );				
		System.out.println("Cost:" + this.cost + ".Rs");
		System.out.println("Owner Name:"+this.ownerName);
		System.out.println("Number of Screens:"+this.screen);
	}


}

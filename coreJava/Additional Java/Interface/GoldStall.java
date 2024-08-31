public class GoldStall implements Stall {
	
	private String stallName;
	private int cost;
	private String ownerName;
	private int tvSet;

	
	public GoldStall() {
		super();
	}


	public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
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
	public int getTvSet() {
		return tvSet;
	}

	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}


	@Override
	public void display() {
		System.out.println("Stall Name:"+ 	this.stallName );				
		System.out.println("Cost:" + this.cost + ".Rs");
		System.out.println("Owner Name:"+this.ownerName);
		System.out.println("Number of TV sets:"+this.tvSet);
	}

}


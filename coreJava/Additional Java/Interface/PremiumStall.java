public class PremiumStall implements Stall{
	
	private String stallName;
	private int cost;
	private String ownerName;
	private int projector;


	public PremiumStall() {
		super();
	}

	public PremiumStall(String stallName, int cost, String ownerName, int projector) {
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
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
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}


	@Override
	public void display() {
		System.out.println("Stall Name:"+ 	this.stallName );				
		System.out.println("Cost:"+ this.cost+".Rs");
		System.out.println("Owner Name:"+this.ownerName);
		System.out.println("Number of Projectors:"+this.projector);
	}



}

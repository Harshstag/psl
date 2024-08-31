public class ExecutiveStall implements Stall{
	private String stallName;
	private Integer cost;
	private String ownerName;
	private Integer screen;
	ExecutiveStall(){
		
	}
	ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen){
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.screen = screen;
	}
	@Override
	public void display() {
		System.out.println("Stall Name:" + stallName);
		System.out.println("Cost:" + cost + ".Rs");
		System.out.println("Owner Name:" + ownerName);
		System.out.println("Number of Screens:" + screen);
		
	}
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Integer getScreen() {
		return screen;
	}
	public void setScreen(Integer screen) {
		this.screen = screen;
	}
	
}

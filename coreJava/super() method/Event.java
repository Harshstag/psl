import java.time.LocalDate;

public class Event {
	String name;
	String detail;
	String type;
	String ownerName;
	double costPerDay;

	public Event(String name, String detail, String type, String ownerName, double costPerDay) {
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
	}
	
	public double totalCost(LocalDate startDate, LocalDate endDate) {
		
		int days = endDate.getDayOfMonth() - startDate.getDayOfMonth() ;
		return  days * costPerDay;
		
	}
	
	
}

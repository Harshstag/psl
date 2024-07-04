public class StageEvent extends Event{
	 int noOfSeats;

	    public StageEvent(String name, String detail, String type, String ownerName, double costPerDay, int noOfSeats) {
	        super(name, detail, type, ownerName, costPerDay);
	        this.noOfSeats = noOfSeats;
	    }
	    
	    public static double totalGST( double totalCost) {
	    	if(0.15 * totalCost > 0) {
	    		return 0.15 * totalCost;
	    	}else {
	    		return 0.0;
	    	}
		}
}

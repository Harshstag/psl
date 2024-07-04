public class Exhibition extends Event {
	  int noOfStall;

	    public Exhibition(String name, String detail, String type, String ownerName, double costPerDay, int noOfStall) {
	        super(name, detail, type, ownerName, costPerDay);
	        this.noOfStall = noOfStall;
	    }
	    public static double totalGST(double totalCost) {
	    	if(0.05 * totalCost > 0) {
	    		return 0.05 * totalCost;
	    	}else {
	    		return 0.0;
	    	}
			
		}
}
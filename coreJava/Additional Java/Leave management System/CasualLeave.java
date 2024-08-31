
public class CasualLeave extends Leave {
    
    String reason;
	
	public CasualLeave() {
		super();
	}

	public CasualLeave(Integer employeeId, String date, Integer noOfDays, String reason) {
		
		super.employeeId = employeeId;
		super.noOfDays = noOfDays;
		super.date = date;
		this.reason = reason;

	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public void calculateLeave(){
		
		super.availableCasualLeaves -= noOfDays;
		System.out.println("Casual Leave:" + employeeId + "," + date + "," + reason + "," + noOfDays + ","
				+ availableCasualLeaves + " casual leaves available" );
	
	}
 

}
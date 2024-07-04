
public abstract class Leave {
    Integer employeeId;
    Integer noOfDays;
    String date;
    Integer availableSickLeaves = 15;
    Integer availableCasualLeaves = 10;
    
    public abstract void calculateLeave();
    public Leave() {

    }
    public Leave(Integer employeeId, String date, Integer noOfDays) {
    	super();
		this.employeeId = employeeId;
		this.noOfDays = noOfDays;
		this.date = date;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getAvailablesickleaves() {
		return availableSickLeaves;
	}
	public Integer getAvailablecasualleaves() {
		return availableCasualLeaves;
	}
	

}

public class SickLeave extends Leave{
    
    String aboutIllness;
	
	public SickLeave() {
		super();
	}

	public SickLeave(Integer employeeId, String date, Integer noOfDays, String aboutIllness) {
		
		super.employeeId = employeeId;
		super.noOfDays = noOfDays;
		super.date = date;
		this.aboutIllness = aboutIllness;

	}

	public String getAboutIllness() {
		return aboutIllness;
	}

	public void setAboutIllness(String aboutIllness) {
		this.aboutIllness = aboutIllness;
	}
	@Override
	public void calculateLeave(){
		super.availableSickLeaves -= noOfDays;
		System.out.println("Sick Leave:"+employeeId+","+date+","+aboutIllness+","+noOfDays+","+availableSickLeaves+" sick leaves available");
	}
 

}
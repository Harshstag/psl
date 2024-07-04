public class User {
	
	private String name;
	private String mobileNumber;
	private String city;
	private String state;
	
	public User() {
		super();
	}
	
	public User(String name, String mobileNumber, String city, String state) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.state = state;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
}

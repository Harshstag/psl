public class Event {
	private String eventName;
	private int attendeesCount;
	private String ownerName;
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(String eventName, int attendeesCount, String ownerName) {
		super();
		this.eventName = eventName;
		this.attendeesCount = attendeesCount;
		this.ownerName = ownerName;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getAttendeesCount() {
		return attendeesCount;
	}
	public void setAttendeesCount(int attendeesCount) {
		this.attendeesCount = attendeesCount;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
}

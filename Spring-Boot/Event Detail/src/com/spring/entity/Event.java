package com.spring.entity;


public class Event {

    private int id;
    private String eventName;
    private String organiser;
    private String organiserNumber;
    private String hallName;
    private String location;
    
    public int getId() {
    	return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getOrganiser() {
		return organiser;
	}
	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}
	public String getOrganiserNumber() {
		return organiserNumber;
	}
	public void setOrganiserNumber(String organiserNumber) {
		this.organiserNumber = organiserNumber;
	}
	public String getHallName() {
		return hallName;
	}
	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	public Event() {}
	
	public Event(int id,String eventName,String organiser,String organiserNumber,String hallName, String location) {
	   this.id = id;
	   this.eventName = eventName;
        this.organiser = organiser;
        this.organiserNumber = organiserNumber;
        this.hallName = hallName;
	   this.location = location;
		
	}

}

import java.io.*;
import java.util.*;

class Event {
    private String eventName;
    private String organiserName;
    private Double eventCost;

    // Default constructor
    public Event() {}

    // Parameterized constructor
    public Event(String eventName, String organiserName, Double eventCost) {
        this.eventName = eventName;
        this.organiserName = organiserName;
        this.eventCost = eventCost;
    }

    // Getters and setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOrganiserName() {
        return organiserName;
    }

    public void setOrganiserName(String organiserName) {
        this.organiserName = organiserName;
    }

    public Double getEventCost() {
        return eventCost;
    }

    public void setEventCost(Double eventCost) {
        this.eventCost = eventCost;
    }

    // Display method
    public void display(List<Event> eventList) {
        eventList.forEach(event -> {
            System.out.println(event.getEventName() + "|" + event.getOrganiserName() + "|" + event.getEventCost());
        });
    }
}
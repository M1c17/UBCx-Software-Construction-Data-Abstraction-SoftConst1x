package model;

public class Event {

    private String name;
    private String date;
    private String location;
    private EventType type;

    public Event(String name, String date, String locn, EventType type) {
        this.name = name;
        this.date = date;
        location = locn;
        this.type = type;
    }
    //TODO: complete the implementation of this constructor

    // getters
    public String getName() { return name; }
    //TODO: complete the implementation and specifications of this method
    public String getDate() { return date; }
        //TODO: complete the implementation and specifications of this method
    public String getLocation() { return location; }
        //TODO: complete the implementation and specifications of this method
    public EventType getEventType() { return type; }
        //TODO: complete the implementation and specifications of this method
}

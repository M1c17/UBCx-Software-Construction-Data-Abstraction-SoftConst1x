package model;

import java.util.LinkedList;
import java.util.List;

public class MyProfile {

    private String name;
    private int age;
    private String currentLocation;
    private String workPlace;
    private List<MyProfile> friendsList;
    private List<Event> upcomingEvents;

    public MyProfile(String nm, int age, String locn, String work) {
        // TODO: complete the implementation of this method
        name = nm;
        this.age = age;
        currentLocation = locn;
        workPlace = work;
        friendsList = new LinkedList<>();
        upcomingEvents = new LinkedList<>();
    }

    // getters
    public String getName() {return name; }
    // TODO: complete the implementation of this method
    public int getAge() { return age; }
    // TODO: complete the implementation of this method
    public String getCurrentLocation() { return currentLocation; }
    // TODO: complete the implementation of this method
    public String getWorkPlace() { return workPlace; }
    // TODO: complete the implementation of this method
    public int upcomingEventNum() { return upcomingEvents.size(); } ///////////////////
    // TODO: complete the implementation of this method
    public List<MyProfile> getFriendsList() { return friendsList; }
    // TODO: complete the implementation of this method
    public List<Event> getEventList() { return upcomingEvents; }
    // TODO: complete the implementation of this method


    // REQUIRES: f is not already in friendsList
    // MODIFIES: this
    // EFFECTS: consumes a MyProfile object, a friend f, and adds it to the friendsList
    public void addFriend(MyProfile f) {
        getFriendsList().add(f);
    }
    // TODO: complete the implementation of this method

    // MODIFIES: this
    // EFFECTS: removes a friend with the given name from this. If removal is successful, return true, else
    //          return false
    public boolean unFriend(String nm) {
        for (MyProfile f : friendsList) {
            if (f.getName().equals(nm)) {
                friendsList.remove(f);
                return true;
            }
        }
        return false;
    }
    // TODO: complete the implementation of this method

    // REQUIRES: ev is not in upcomingEvents
    // MODIFIES: this
    // EFFECTS: adds the given event to the list of upcoming events
    public void addEvent(Event ev) {
        getEventList().add(ev);
    }
    // TODO: complete the implementation of this method

    // MODIFIES: this
    // EFFECTS: removes an event with the given name. If removal is successful, return true, else return false
    public boolean removeEvent(String nm) {
        for (Event e : upcomingEvents) {
            if (e.getName().equals(nm)) {
                upcomingEvents.remove(e);
                return true;
            }
        }
        return false;
    }

    // TODO: complete the implementation of this method

    // EFFECTS: returns the number of events that are at the current location of this person
    public int eventNumNearMe() {
        int count = 0;
        for (Event e : upcomingEvents) {
            if (e.getLocation().equals(getCurrentLocation())) {
                count += 1;
            }
        }
        return count;
    }
    // TODO: complete the implementation of this method

    // EFFECTS: returns the number of events of the given type et
    public int specificEventType(EventType et) {
        int count = 0;

        for (Event e : upcomingEvents) {
            if (e.getEventType().equals(et)) {
                count += 1;
            }
        }
        System.out.println(count);
        return count;
    }
    // TODO: complete the implementation of this method

    // EFFECTS: prints events of  type et to the console
    //          Hint: is there a method you have already written that you can use?
    public void printEventSchedule(EventType et) {
        for (Event e : upcomingEvents) {
            if (e.getEventType().equals(et)) {
                System.out.println(e.getName() + '@' + e.getLocation());
            }
        }
    }
    // TODO: complete the implementation of this method

    // EFFECTS: prints out the list of friends that this MyProfile has
    public void printFriendNames() {
        System.out.println("Your friensList: ");
        for (MyProfile f : friendsList) {
            System.out.println(f.getName());
        }
    }
    // TODO: complete the implementation of this method

    // EFFECTS: prints out the names of friends who live at the same location associated with this profile
    public void printFriendsNearMe() {
        System.out.println("Your friensList Near your location: ");
        for (MyProfile f : friendsList) {
            if (f.getCurrentLocation().equals(getCurrentLocation())) {
                System.out.println(f.getName());
            }
        }
    }
    // TODO: complete the implementation of this method

    // EFFECTS: produces true if this profile has a friend with the given name,
    //          OR if any of this profile's friends has a friend with the given name
    //          Hint: use recursion!
    public boolean canFindPerson(String name) {
        if (this.friendsList.isEmpty()) return false;

        for (MyProfile p : friendsList) {
            if (p.getName().equals(name)) {
                return true;
            }
        }

        for (MyProfile p : friendsList) {
            if (p.canFindPerson(name)) {
                return true;
            }
        }
        return false;
    }
    // TODO: complete the implementation of this method
}

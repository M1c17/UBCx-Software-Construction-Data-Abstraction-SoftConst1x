package model;

import java.util.LinkedList;
import java.util.List;


public class Contact {

  private String name;
  private int number;
  private ContactType type;
  private List<String> callLog;


  public Contact(String name, int number, ContactType type) {
    this.name = name;
    this.number = number;
    this.type = type;
    callLog = new LinkedList<>();
  }


  //getters
  public String getName() { return name; }
  public int getNumber() { return number; }
  public ContactType getContactType() { return type; }
  public List<String> getCallLog() { return callLog; }

  //setters
  public void setName(String name) { this.name = name; }
  public void setNumber(int number) { this.number = number; }

  //MODIFIES: this
  //EFFECTS: sets contact type to one of: WORK, FRIEND, FAMILY,
  public void setContactType(ContactType contactType) { type = contactType; }
  public void setCallLog(List<String> callLog) { this.callLog = callLog; }


  // REQUIRE: a date as string MM/DD/YY
  // MODIFIES: this
  // EFFECTS: consumes the date in which the call was made and adds it to the call
  public void call(String date) {
    callLog.add(date);
  }


  //EFFECTS: return a message for each contact type
  public String automateResponse() {
    ContactType cType = getContactType();

    switch (cType) {
      case WORK: return "I'll get back to you at work.";
      case FAMILY: return "See you at home.";
      case FRIEND: return "Meet you at the cafe.";
      default: return "Sorry, I can't talk right now.";
    }
  }
}



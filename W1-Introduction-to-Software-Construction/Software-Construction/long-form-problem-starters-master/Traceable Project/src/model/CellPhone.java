package model;

import java.util.ArrayList;

//is associated with a collection of calls
//is associated with one person
public class CellPhone implements Traceable {

  private String location;
  private Person owner;
  private ArrayList<Call> calls;

  public CellPhone(Person owner, String location){
    this.owner = owner;
    this.location = location;
    calls = new ArrayList<>();

  }
  //getters
  public Person getOwner() { return owner;}
  public ArrayList<Call> getCalls() { return calls;}
  @Override
  public String getLocation() { return location;}

  @Override
  public Object getTrace() { return this; }

  @Override
  public void track() {
    System.out.println("The current location of " + getOwner() + " is " + getLocation());
  }

  // EFFECTS: add a given call to calls
  public void addCall(Call c) {
    calls.add(c);
  }

}

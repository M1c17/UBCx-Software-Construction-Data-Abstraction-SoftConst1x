package model;

// is associated with one cell phone (outgoing caller)
public class Call implements Traceable {

  private CellPhone outgoingCaller;
  private String location;

  public Call(CellPhone outgoingCaller, String location) {
    this.outgoingCaller = outgoingCaller;
    this.location = location;

  }
  //getters
  public CellPhone getOutgoingCaller() { return outgoingCaller;}

  @Override
  public String getLocation() { return location; }

  @Override
  public Object getTrace() { return outgoingCaller; }

  @Override
  public void track() { System.out.println("This call is coming from " + getLocation()); }
}

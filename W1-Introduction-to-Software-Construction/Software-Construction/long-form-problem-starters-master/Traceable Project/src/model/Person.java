package model;

// is associated with at most one Fingerprint
public class Person implements Traceable{

  private String name;
  private String location;
  private Fingerprint figerPrint;

  public Person(String name, String location) {
    this.name = name;
    this.location = location;
    figerPrint = null;
  }
  //getters
  public String getName() { return name; }
  public Fingerprint getFigerPrint() { return figerPrint; }

  @Override
  public String getLocation() { return location; }

  @Override
  public Object getTrace() { return this; }

  @Override
  public void track() { System.out.println("This person is locates at: " + location); }

  //EFFECTS: sets fingerprint to f
  public void setFingerprint(Fingerprint f) {figerPrint = f;}
}


package model;

//is associated with one person
public class Fingerprint implements Traceable{

  private Person owner;
  private String precint;

  public Fingerprint(Person owner, String precint) {
    this.owner = owner;
    this.precint = precint;
    owner.setFingerprint(this);
  }

  public Person getPerson() { return owner; }

  @Override
  public String getLocation() { return precint; }

  @Override
  public Object getTrace() { return this; }

  @Override
  public void track() {
    System.out.println(" This fingerprint was taken in: " + getLocation());

  }
}

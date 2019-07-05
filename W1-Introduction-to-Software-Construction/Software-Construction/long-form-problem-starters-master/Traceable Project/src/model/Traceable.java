package model;

public interface Traceable {

  // EFFECTS: returns the location of the CellPhone, or the police
  // precinct where the fingerprints were collected.
  String getLocation();

  // EFFECTS: returns the object of interest (e.g. the CellPhone of the
  //outgoing caller, the CellPhone itself, or the person)
  Object getTrace();

  //EFFECTS: print out "Tracking... " and an identifying property of the object.
  void track();




}

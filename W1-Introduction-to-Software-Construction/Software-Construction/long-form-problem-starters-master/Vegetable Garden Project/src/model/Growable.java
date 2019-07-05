package model;

public interface Growable {

  //EFFECTS: print out the Nutrients and Fertilizes on which you feed your plant.
  void feed();

  //EFFECTS: print out the times of your gives water to your plant.
  void water();

  // EFFECTS: return the specific instruction on which you harvest your plant.
  String getInstructions();

  //EFFECTS: print out the specification for harvesting your plant.
  void harvest();

}

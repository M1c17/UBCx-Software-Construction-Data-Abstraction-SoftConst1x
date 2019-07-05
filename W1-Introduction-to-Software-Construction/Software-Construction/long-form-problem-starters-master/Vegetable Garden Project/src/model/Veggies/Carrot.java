package model.Veggies;

import model.VegType;
import model.Vegetable;

public class Carrot extends Vegetable {

  public Carrot(){
    super("Carrot", VegType.ROOT);
    setInstruction("Mature carrots usually ready in about 75 days.");
  }


  @Override
  public void feed() {
    System.out.println("need rich fertile potting soil with added compost ");

  }

  @Override
  public void water() { System.out.println("three times week "); }


  @Override
  public void harvest() { System.out.println("Carrots need loose, light, airy soil. Most of us need to add sand."); }
}

package model.Veggies;


import model.VegType;
import model.Vegetable;

public class Lettuce extends Vegetable {

  public Lettuce(){
    super("Lettuce", VegType.LEAF);
    setInstruction("Harvest the romaine heads about 65–70 days");
  }

  @Override
  public void feed() { System.out.println("Fertilize lettuce"); }

  @Override
  public void water() { System.out.println("Twice per week"); }


  @Override
  public void harvest() { System.out.println("4 inches long, you can begin harvesting leaf lettuce"); }
}

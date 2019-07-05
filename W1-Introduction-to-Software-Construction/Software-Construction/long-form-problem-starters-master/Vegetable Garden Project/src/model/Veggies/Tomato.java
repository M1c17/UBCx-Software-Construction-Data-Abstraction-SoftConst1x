package model.Veggies;

import model.VegType;
import model.Vegetable;

public class Tomato extends Vegetable{

  public Tomato(){
    super("Tomato", VegType.SEED);
    setInstruction("Standard-sized tomatoes take 20 to 30 days from blossom");
  }

  @Override
  public void feed() {
    System.out.println("add light fertilizer once every one to two weeks");
  }

  @Override
  public void water() { System.out.println("twice a day"); }


  @Override
  public void harvest() { System.out.println("Never place tomatoes on a sunny windowsill to ripen; they may rot before they are ripe!"); }
}

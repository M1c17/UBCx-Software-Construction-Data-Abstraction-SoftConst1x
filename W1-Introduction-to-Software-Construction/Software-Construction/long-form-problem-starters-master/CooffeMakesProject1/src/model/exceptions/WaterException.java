package model.exceptions;

//This exception will be thrown when there is not enough supplied to the machine.
public class WaterException extends Exception {

  private double amtWater;

  public WaterException(double amtWater) {
    super(amtWater + " needs more water ");
    this.amtWater = amtWater;
  }

  public double getAmtWater() { return amtWater; }
}

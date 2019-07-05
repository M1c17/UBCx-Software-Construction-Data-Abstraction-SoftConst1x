package model;

import model.exceptions.*;

public class CoffeMaker {

  private int timeSinceLastBrew;
  private int cupsRemaining;

  public CoffeMaker() {

    timeSinceLastBrew = 0;
    cupsRemaining = 0;

  }

  //getters
  public int getTimeSinceLastBrew() { return timeSinceLastBrew; }
  public int getCupsRemaining() {return cupsRemaining; }
  //setters
  public void setCupsRemaining(int cupsRemaining) {
    this.cupsRemaining = cupsRemaining;
  }

  // EFFECTS: return true if there are coffee cups remaining
  public boolean areCupsRemaining() {
    if (cupsRemaining > 0) {
      System.out.println("Yes there are.");
      return true;
    }
    System.out.println("No, You need do some more.");
    return false;
  }

  //REQUIRES: a non-negative integer
  //EFFECTS: sets time since last brew
  public void setTimeSinceLastBrew(int time) {
    timeSinceLastBrew = time;
  }

  //EFFECTS: sets cups remaining to full (20 cups) and time since last brew to 0
  // when water < 14.75 cups thrown a exception error: WaterException
  // when beans > 2.60 cups thrown a exception error:
  // when beans < 2.40 cups thrown a exception error:
  public void brew(double beans, double water) throws WaterException, BeansAmountException {

    if(water < 14.75) {
      throw new WaterException(water);

    }

    if(beans > 2.60) {
      throw new TooManyBeansException(beans);

    }

    if(beans < 2.40) {
      throw new NotEnoughBeansException(beans);

    }
    //setCupsRemaining(water);
    cupsRemaining = 20;
    timeSinceLastBrew = 0;

  }

  // EFFECTS: subtracts one cup from cups remaining
  // when cups 0 throw a exception error: NoCupsRemainingException
  // when time since last brew > 60 throw a StaleCoffeException
  // MODIFIES: this
  public void pourCoffee() throws NoCupsRemainingException, StaleCoffeException {
    if (getCupsRemaining() == 0) {
      throw new NoCupsRemainingException();

    } else if (timeSinceLastBrew > 60) {
      throw new StaleCoffeException(getTimeSinceLastBrew());

    } else {
      cupsRemaining -= 1;
    }
  }
}


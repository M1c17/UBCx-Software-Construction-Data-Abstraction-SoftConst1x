package model.exceptions;

// This exception will be thrown when someone tries to pour the coffee,
// but it has been sitting for too long and is now stale.
public class StaleCoffeException extends Exception {

  private int timeSinceLastBrew;

  public StaleCoffeException(int timeSinceLastBrew) {
    super("Time since last brew " + timeSinceLastBrew + "Make a new brew");
    this.timeSinceLastBrew = timeSinceLastBrew;
  }

  public int getTimeSinceLastBrew() {
    return timeSinceLastBrew;
  }
}

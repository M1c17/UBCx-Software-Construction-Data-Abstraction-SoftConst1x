package model.exceptions;

// it will only thrown when the barista tries to pour coffee,
// but there are no cups remaining.
public class NoCupsRemainingException extends Exception {

  public NoCupsRemainingException() {
    super("There are no cups remaining.");
  }
}

package model.exceptions;

public class BeansAmountException extends Exception{

  private double beans;

  public BeansAmountException(double beans, String message) {
    super(beans + message);
    this.beans = beans;
  }

  //getters
  public Double getBeans() {return beans;}

}

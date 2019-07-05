package main;

import model.CoffeMaker;

public class Main {

  public static void main(String[] args) {

    CoffeMaker coffebar = new CoffeMaker();

    try {
      coffebar.brew(2.50, 15);
      coffebar.pourCoffee();
      coffebar.setTimeSinceLastBrew(15);
      coffebar.pourCoffee();
      System.out.println(60 - coffebar.getTimeSinceLastBrew() + " minutes remaining to pour " +
      coffebar.getCupsRemaining() + " cups.");
    } catch (Exception e) {
      System.out.println("Exceptions should not been caught here");
    }

    try {
      coffebar.brew(2.20, 16);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      coffebar.brew(2.90, 15);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      coffebar.pourCoffee();
      coffebar.setTimeSinceLastBrew(90);
      coffebar.pourCoffee();
      coffebar.pourCoffee();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      coffebar.brew(2.5, 15);
      for (int i = 0; i < 20; i++) {
        coffebar.pourCoffee();
      }
      coffebar.pourCoffee();
    }catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Turn off the  coffee Maker.");
  }
}

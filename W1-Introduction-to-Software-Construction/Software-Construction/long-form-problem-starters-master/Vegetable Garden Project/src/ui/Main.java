package ui;

import model.VegType;
import model.Veggies.Carrot;
import model.Veggies.Lettuce;
import model.Veggies.Tomato;
import model.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Vegetable> garden = new ArrayList<>();
    garden.add(new Carrot());
    garden.add(new Tomato());
    garden.add(new Lettuce());

    for (Vegetable vegetable : garden) {
      System.out.println(vegetable.getName() + ", " + vegetable.getInstructions());
    }

    for (Vegetable vegetable : garden) {
      System.out.println(vegetable.getName() + ", " + vegetable.getType());
    }

    for (Vegetable vegetable : garden) {
      System.out.println(vegetable.getName() + ":");
      vegetable.feed();
      vegetable.water();
    }

    for (Vegetable vegetable : garden) {
      if (vegetable.getType().equals(VegType.ROOT)) {
        vegetable.harvest();
      }
    }
  }
}

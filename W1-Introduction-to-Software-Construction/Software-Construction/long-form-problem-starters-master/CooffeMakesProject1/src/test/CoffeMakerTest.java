package test;

import model.CoffeMaker;
import model.exceptions.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeMakerTest {

  CoffeMaker cafe;

  @Before
  public void setUp() {
    cafe = new CoffeMaker();
  }


  @Test
  public void gettersTest() {
    cafe.setTimeSinceLastBrew(15);
    assertEquals(0, cafe.getCupsRemaining());
    assertEquals(15, cafe.getTimeSinceLastBrew());
  }

  @Test
  public void CorrectlyBrewing() {
    try {
      cafe.brew(2.50, 15);
    } catch (BeansAmountException e) {
      fail("Got beans when shouldn't have");
    } catch (WaterException e) {
      fail("Got water when shouldn't have");
    }

    assertEquals(cafe.getTimeSinceLastBrew(), 0 );
  }

  @Test
  public void brewMoreWater() {
    try {
      cafe.brew(2.50, 11);
    } catch (BeansAmountException e) {
      fail("Got beans when shouldn't have");
    } catch (WaterException e) {
      //Dont fail.
    }
    assertEquals(0, cafe.getCupsRemaining());
  }

  @Test
  public void brewMoreBeans() {
    try {
      cafe.brew(2.20, 15);
    } catch (BeansAmountException e) {
      //Dont fail
    } catch (WaterException e) {
      fail("Got water when shouldn't have");
    }

    assertEquals(0, cafe.getCupsRemaining());
  }

  @Test
  public void brewLessBeans() {
    try {
      cafe.brew(2.90, 15);
    } catch (BeansAmountException e) {
      //Dont fail
    } catch (WaterException e) {
      fail("Got water when shouldn't have");
    }

    assertEquals(0, cafe.getCupsRemaining());
  }


  @Test
  public void existCups() {

    CorrectlyBrewing();
    cafe.setTimeSinceLastBrew(15);
    try{
      cafe.pourCoffee();
      cafe.pourCoffee();
    } catch (NoCupsRemainingException e) {
      fail("Should have cups remainig");
    } catch (StaleCoffeException e) {
      fail("Got stale coffe when shoudn't have");
    }

    assertEquals(cafe.getCupsRemaining(), 5);
  }

  @Test
  public void noRemainingCups() {

    CorrectlyBrewing();
    cafe.setTimeSinceLastBrew(15);
    try{
      for(int i= 0; i < 15; i++) {
        cafe.pourCoffee();
      }
    } catch (NoCupsRemainingException e) {
      //dont fail
    } catch (StaleCoffeException e) {
      fail("Got stale coffe when shoudn't have");
    }

    assertEquals(cafe.getCupsRemaining(), 0);
  }

  @Test
  public void staleCoffe() {

    CorrectlyBrewing();
    cafe.setTimeSinceLastBrew(90);
    try{
      cafe.pourCoffee();
    } catch (NoCupsRemainingException e) {
      fail("Got cups remaining when shoudn't have");
    } catch (StaleCoffeException e) {
      //dont fail
    }
  }

  @Test
  public void noCupsStaleCoffee() {

    CorrectlyBrewing();
    cafe.setTimeSinceLastBrew(90);
    try{
      for(int i=0; i < 15; i++){
        cafe.pourCoffee();
      }
    } catch (NoCupsRemainingException e) {
      fail("Stale Exception should catch the exception");
    } catch (StaleCoffeException e) {
      //dont fail
    }

    assertEquals(cafe.getCupsRemaining(), 15 );
  }








}

package test;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AnimalTest {

  private Zookeeper testZookeeper;
  private Elephant testElephant;
  private Horse testHorse;
  private Snake testSnake;
  private Whale testWhale;


  @Before
  public void setUp() {
    testZookeeper = new Zookeeper("Carry",37);
    testElephant = new Elephant("Mana", "Africa", 47,testZookeeper,6000.00);
    testHorse = new Horse("Rey","India",12, testZookeeper, 900.00, 15.4);
    testSnake = new Snake("largo",45, testZookeeper, 9000.90, 12.8, false);
    testWhale = new Whale("Whali", 76, testZookeeper, 100000.90, true, 10000.98);

    testZookeeper.setFavourite(testWhale);
    testZookeeper.addAnimal(testWhale);
    testZookeeper.addAnimal(testElephant);
    testZookeeper.addAnimal(testHorse);
    testZookeeper.addAnimal(testSnake);

  }

  @Test
  public void testgetName() { assertEquals("Carry", testZookeeper.getName()); }
  public void testgetAge() { assertEquals(37, testZookeeper.getAge());}

  @Test
  public void testgetAnimalList() {
    assertEquals(4, testZookeeper.getAnimalList().size());
    assertTrue(testZookeeper.getAnimalList().contains(testElephant));
    assertTrue(testZookeeper.getAnimalList().contains(testSnake));
    assertTrue(testZookeeper.getAnimalList().contains(testWhale));
    assertTrue(testZookeeper.getAnimalList().contains(testHorse));
  }

  @Test
  public void testremoveFromList() {
    assertTrue(testZookeeper.removeAnimal(testElephant));
    assertEquals(3, testZookeeper.getAnimalList().size());
    assertFalse(testZookeeper.removeAnimal(testElephant));

    assertTrue(testZookeeper.removeAnimal(testSnake));
    assertEquals(2, testZookeeper.getAnimalList().size());
    assertFalse(testZookeeper.removeAnimal(testSnake));

    assertTrue(testZookeeper.removeAnimal(testWhale));
    assertEquals(1, testZookeeper.getAnimalList().size());
    assertFalse(testZookeeper.removeAnimal(testWhale));
  }

}





package test;

import model.VegType;
import model.Veggies.Carrot;
import model.Veggies.Lettuce;
import model.Veggies.Tomato;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VegetablesTest {

  private Carrot testCarrot;
  private Tomato tesTomato;
  private Lettuce testLettuce;

  @Before
  public void setUp() {
    testCarrot = new Carrot();
    tesTomato = new Tomato();
    testLettuce = new Lettuce();
  }

  @Test
  public void testCarrot() {
    assertEquals(testCarrot.getName(), "Carrot");
    assertEquals(testCarrot.getType(), VegType.ROOT);
    assertEquals(testCarrot.getInstructions(), "Mature carrots usually ready in about 75 days.");

  }

}

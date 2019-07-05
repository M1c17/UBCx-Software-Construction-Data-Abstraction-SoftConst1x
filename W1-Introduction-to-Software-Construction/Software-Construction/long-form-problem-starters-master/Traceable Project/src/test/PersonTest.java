package test;

import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

  private Person person;
  private Fingerprint figerPrint;

  @Before
  public void setUp() {
    person = new Person("mica", "Reston");
    figerPrint = new Fingerprint(person, "Herdon");
  }

  @Test
  public void gettersTest() {
    assertEquals(person.getLocation(), "Reston");
    assertEquals(person.getFigerPrint(), figerPrint);
    assertEquals(person.getName(), "mica");
    assertEquals(person.getTrace(), person);
  }

  @Test
  public void trackTest() {person.track();}


}

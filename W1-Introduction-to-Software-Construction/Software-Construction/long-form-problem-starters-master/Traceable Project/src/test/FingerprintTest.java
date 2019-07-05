package test;

import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FingerprintTest {

  private Person owner;
  private Fingerprint fp;

  @Before
  public void setUp() {
    owner = new Person("Anthony Estey", "Victoria");
    fp = new Fingerprint(owner, "Reston");
  }

  @Test
  public void gettersTest(){
    assertEquals(fp.getLocation(),"Reston" );
    assertEquals(fp.getPerson(), owner );
    assertEquals(fp.getTrace(), fp );
  }

  @Test
  public void trackTest() {fp.track();}
}

package test;

import model.Contact;
import model.ContactType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ContactTest {

  private Contact contactTest;
  private List<String> callLog;

  @Before
  private void setUp() {
    contactTest = new Contact("Mica", 124, ContactType.WORK);
    callLog = new ArrayList<>();
  }

  @Test
  public void testgetter() {
    assertEquals(contactTest.getName(), "Mica");
    assertEquals(contactTest.getNumber(), 124);
    assertEquals(contactTest.getContactType(), ContactType.WORK);
    assertEquals(contactTest.getCallLog(), callLog);
  }

  @Test
  public void testcall() {
    contactTest.call("04/05/19");
    callLog.add("04/05/19");

    assertEquals(contactTest.getCallLog(), callLog);

    loadCalls();
    assertEquals(contactTest.getCallLog().size(), callLog.size());
    assertTrue(contactTest.getCallLog().contains("04/05/19"));
  }

  @Test
  public void automateResponseTest() {
    contactTest.setContactType(ContactType.FAMILY);
    assertEquals(contactTest.automateResponse(), "See you at home.");

    contactTest.setContactType(ContactType.WORK);
    assertEquals(contactTest.automateResponse(), "I'll get back to you at work.");

    contactTest.setContactType(ContactType.FRIEND);
    assertEquals(contactTest.automateResponse(), "Meet you at the cafe.");


  }

  public void loadCalls() {
    contactTest.call("02/01/19");
    contactTest.call("03/02/19");
    contactTest.call("05/06/19");
    contactTest.call("07/01/19");

    callLog.add("02/01/19");
    callLog.add("03/02/19");
    callLog.add("05/06/19");
    callLog.add("07/01/19");
  }

}

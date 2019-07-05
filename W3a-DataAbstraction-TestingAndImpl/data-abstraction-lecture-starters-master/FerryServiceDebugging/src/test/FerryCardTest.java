package test;

import model.Ferry;
import model.FerryCard;
import model.Passenger;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FerryCardTest {

    private FerryCard testFerryCard;
    private Passenger testPassenger;

    @Before
    public void setUp() {
        testPassenger = new Passenger("Bruce Wayne");
        testFerryCard = testPassenger.getFerryCard();
    }

    @Test
    public void testFerryCardConstructor() {
        assertEquals(testFerryCard.getOwner(), testPassenger);
        assertEquals(testFerryCard.getBalance(), 0);
    }

    @Test
    public void testTopUp() {
        testFerryCard.topUp(20);
        assertEquals(testFerryCard.getBalance(), 20);
        testFerryCard.topUp(20);
        assertEquals(testFerryCard.getBalance(), 40);
    }

    @Test
    public void testBuyTicketNoBalance() {
        int testPrice = 15;
        Date testDate = new Date();
        Ferry testFerry = new Ferry("Nanaimo", testDate, testPrice);
        assertFalse(testFerryCard.buyTicket(testFerry));
    }

    @Test
    public void testBuyTicketNotEnoughBalance() {
        //set up for the test. checking initial values
        int testPrice = 20;
        Date testDate = new Date();
        Ferry testFerry = new Ferry("Nanaimo", testDate, testPrice);
        //invoke the tested behaviour
        testFerryCard.topUp(19);
        //checking outputs
        assertFalse(testFerryCard.buyTicket(testFerry));
    }

    @Test
    public void testBuyTicket() {
        //set up for the test. checking initial values
        int testPrice = 15;
        Date testDate = new Date();
        Ferry testFerry = new Ferry("Nanaimo", testDate, testPrice);
        //invoke the tested behaviour
        testFerryCard.topUp(20);
        assertTrue(testFerryCard.buyTicket(testFerry));
        //checking the outputs
        assertEquals(testFerryCard.getBalance(), 5);
        assertFalse(testFerry.getTicketSet().isEmpty());
    }


}

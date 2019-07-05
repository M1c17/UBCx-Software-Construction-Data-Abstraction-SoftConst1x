package test;

import model.Customer;
import model.HairSalon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HairSalonTest {

    private HairSalon laBelleSalon;
    private Customer elisa;

    @Before
    public void setUp(){
        laBelleSalon = new HairSalon();
        elisa = new Customer("Elisa");
    }


    @Test
    public void testMakeBookingAtAvailableTime(){

        //set up checking for initial values is already done

        //invoke the tested behaviour
        assertTrue(laBelleSalon.makeNewBooking(elisa, 15));

        //check the outputs
        assertTrue(laBelleSalon.verifyBooking(elisa, 15));
        elisa.setBookedTime(15);
    }

    @Test
    public void testgetters() {
        Customer bill11 = new Customer("Bill 11");
        laBelleSalon.makeNewBooking(bill11, 11);
        assertTrue(laBelleSalon.getBookings().contains(bill11));
    }

    @Test
    public void makeMultipleBookingsOutOfOrder(){

        //setting up the testing. checking initial values
        Customer bill11 = new Customer("Bill 11");
        Customer bob10 = new Customer("Bob 10");
        Customer sara9 = new Customer("Sara 9");
        Customer jim15 = new Customer("Jim 15");
        Customer sven16 = new Customer("sven 16");

        //invoke the tested behaviour
        boolean bill11Booked = laBelleSalon.makeNewBooking(bill11, 11);
        boolean bob10Booked = laBelleSalon.makeNewBooking(bob10, 10);
        boolean sara9Booked = laBelleSalon.makeNewBooking(sara9, 9);
        boolean jim15Booked = laBelleSalon.makeNewBooking(jim15, 15);
        boolean sven16Booked = laBelleSalon.makeNewBooking(sven16, 16);
        assertTrue(bill11Booked);
        assertTrue(bob10Booked);
        assertTrue(sara9Booked);
        assertTrue(jim15Booked);
        assertTrue(sven16Booked);

        //check the outputs
        boolean bill11Verified = laBelleSalon.verifyBooking(bill11, 11);
        boolean bob10Verified = laBelleSalon.verifyBooking(bob10, 10);
        boolean sara9Verified = laBelleSalon.verifyBooking(sara9, 9);
        boolean jim15Verified = laBelleSalon.verifyBooking(jim15, 15);
        boolean sven16Verified = laBelleSalon.verifyBooking(sven16, 16);
        assertTrue(bill11Verified);
        assertTrue(bob10Verified);
        assertTrue(sara9Verified);
        assertTrue(jim15Verified);
        assertTrue(sven16Verified);
    }

    @Test
    public void makeMultipleBookingsOutOfOrderRefactored(){
        Customer bill11 = new Customer("Bill 11");
        boolean bill11Booked = laBelleSalon.makeNewBooking(bill11, 11);
        Customer bob10 = new Customer("Bob 10");
        boolean bob10Booked = laBelleSalon.makeNewBooking(bob10, 10);
        Customer sara9 = new Customer("Sara 9");
        boolean sara9Booked = laBelleSalon.makeNewBooking(sara9, 9);
        Customer jim15 = new Customer("Jim 15");
        boolean jim15Booked = laBelleSalon.makeNewBooking(jim15, 15);
        Customer sven16 = new Customer("sven 16 ");
        boolean sven16Booked = laBelleSalon.makeNewBooking(sven16, 16);
        Customer mica8 = new Customer("mica 8 ");
        boolean mica8Booked = laBelleSalon.makeNewBooking(mica8, 8);
        Customer mica19 = new Customer("mica 19 ");
        boolean mica19Booked = laBelleSalon.makeNewBooking(mica19, 19);
        Customer mica18 = new Customer("mica 18 ");
        boolean mica18Booked = laBelleSalon.makeNewBooking(mica18, 18);
        Customer mica17 = new Customer("mica 17 ");
        boolean mica17Booked = laBelleSalon.makeNewBooking(mica17, 17);
        assertTrue(bill11Booked);
        assertTrue(bob10Booked);
        assertTrue(sara9Booked);
        assertTrue(jim15Booked);
        assertTrue(sven16Booked);
        assertTrue(mica8Booked);
        assertFalse(mica19Booked);
        assertFalse(mica18Booked);
        assertTrue(mica17Booked);


        boolean bill11Verified = laBelleSalon.verifyBooking(bill11, 11);
        boolean bob10Verified = laBelleSalon.verifyBooking(bob10, 10);
        boolean sara9Verified = laBelleSalon.verifyBooking(sara9, 9);
        boolean jim15Verified = laBelleSalon.verifyBooking(jim15, 15);
        boolean sven16Verified = laBelleSalon.verifyBooking(sven16, 16);
        assertTrue(bill11Verified);
        assertTrue(bob10Verified);
        assertTrue(sara9Verified);
        assertTrue(jim15Verified);
        assertTrue(sven16Verified);
    }

    @Test
    public void testPrintBookingsList() {
        Customer bill11 = new Customer("Bill 11");
        boolean bill11Booked = laBelleSalon.makeNewBooking(bill11, 11);
        assertTrue(bill11Booked);
        boolean bill11Verified = laBelleSalon.verifyBooking(bill11, 11);
        assertTrue(bill11Verified);
        Customer mica9 = new Customer("Mica 9 ");
        boolean mica9Booked = laBelleSalon.makeNewBooking(mica9, 9);
        assertTrue(mica9Booked);
        boolean mica9Verified = laBelleSalon.verifyBooking(mica9, 9);
        assertTrue(mica9Verified);
        laBelleSalon.printBookingsList();
    }

    @Test
    public void confirmUnbookedTimeByName(){
        assertTrue(laBelleSalon.makeNewBooking(elisa, 15));
        assertTrue(laBelleSalon.verifyBooking(elisa, 15));
        // TODO: assertFalse(laBelleSalon.confirmBookedName("Elisa", 15));
    }

    @Test
    public void testMakeBookingAtTakenTime(){
        //set up for the test. Checking initial values.
        boolean madeBooking = laBelleSalon.makeNewBooking(elisa, 15);
        assertTrue(madeBooking);
        assertTrue(laBelleSalon.verifyBooking(elisa, 15));

        //invoke the tested behaviour
        Customer c = new Customer ("Standin Customer");
        assertTrue(laBelleSalon.makeNewBooking(c, 15));

        //check the outputs
        assertTrue(laBelleSalon.verifyBooking(c, 15));
        assertFalse(laBelleSalon.verifyBooking(elisa, 15));
    }

    @Test
    public void testMakeEarliestBooking(){
        assertTrue(laBelleSalon.makeNewBooking(elisa, 9));
        assertTrue(laBelleSalon.verifyBooking(elisa, 9));
    }

    @Test
    public void testMakeLatestBooking(){
        assertTrue(laBelleSalon.makeNewBooking(elisa, 17));
        assertTrue(laBelleSalon.verifyBooking(elisa, 17));
    }

//    @Test
//    public void testMakeBookingEqual() {
//        assertTrue(laBelleSalon.makeNewBooking(elisa, 18));
//        assertTrue(laBelleSalon.verifyBooking(elisa, 18));
//    }
//
//    @Test
//    public void testMakeBookingMore() {
//        assertFalse(laBelleSalon.makeNewBooking(elisa, 19));
//        assertFalse(laBelleSalon.verifyBooking(elisa, 19));
//    }

}

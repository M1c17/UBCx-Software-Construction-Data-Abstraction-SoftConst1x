package model;

import java.util.ArrayList;
import java.util.Objects;

public class HairSalon {

    private ArrayList<Customer> bookings;
    private int maxTime;
    private int openTime;

    public HairSalon(){
        maxTime = 17;
        openTime = 9;
        bookings = new ArrayList<>();
        //Customer c = new Customer("");
        for (int i = 0; i <= maxTime; i++) {
            // note to students: this is a for-loop
            // it will repeatedly run the statements in this code block
            // incrementing i each time
            // until i is equal to 18
            bookings.add(i, null);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HairSalon hairSalon = (HairSalon) o;
        return bookings.equals(hairSalon.bookings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookings);
    }

    public ArrayList<Customer> getBookings() { return bookings; }
    public void setBookings(ArrayList<Customer> bookings) { this.bookings = bookings; }

    // MODIFIES: this and Customer
    // EFFECTS:  books the customer into the requested timeslot if it is a valid timeslot, and let's the Customer know the booking time.
    public boolean makeNewBooking(Customer c, int bookingTime) {
        if(bookingTime < openTime) {
            System.out.println("Sorry the hairsalon its close that time");
        }else if (bookingTime >= bookings.size()) {
                System.out.println("We can't process that booking time");
                return false;
            }else {
            System.out.println("Customer " + c.getName() + " has been booked at " + bookingTime);
            bookings.set(bookingTime, c);
            c.setBookedTime(bookingTime);
            return true;
        }
        return false;
    }

    // EFFECTS: prints out all the bookings. If the time has not been booked, prints "available"
    public void printBookingsList() {
        for (int i = 9; i <= bookings.size(); i++) { // change this to be the wrong end value
            Customer c = bookings.get(i);
            if (c == null){  //This causes a bug because you can't access methods on a null value!
                System.out.print(i + "hrs: ");
                System.out.println(" available ");
            }
            else {
                System.out.print(i+"hrs:");
                c.printName();
            }
        }
    }

    // EFFECTS: returns true if the customer is found at the booking time.
    public boolean verifyBooking(Customer c, int bookingTime) {
        Customer bookedCustomer = bookings.get(bookingTime);
        if (bookedCustomer == null) {
            System.out.println("There is no customer booked at that time");
            return false;
        }
        if (bookedCustomer.getName().equals(c.getName())) {
            System.out.println("Yes the customer is booked at that time");
            return true;
        }
        return false;
    }

    // EFFECTS: returns true if the customer is booked at the booking time
    public boolean confirmBookedName(String cName, int bookingTime) {
        if (bookings.get(bookingTime) != null) {
            Customer bookedCustomer = bookings.get(bookingTime);
            String bookedCustomerName = bookedCustomer.getName();
            boolean isPersonBooked = bookedCustomerName.equals(cName);
            return isPersonBooked;
        }
        return false;
    }

    // MODIFIES: this and Customer
    // EFFECTS:  changes the customer booked in the bookings, and let's the Customer know the new booking time.
    public void changeBooking(Customer customer, int newTime) {
        int bookedTime = customer.getBookingTime();
        System.out.print(customer.getName() + "'s time is changing from " + bookedTime);
        System.out.println(" to "+ newTime);
        bookings.set(bookedTime, null);
        bookings.set(newTime, customer);
        customer.setBookedTime(newTime);
    }


}

package test;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BurgerByteTest {

    private BurgerByte restaurant;
    private Manager manager;
    private FryCook frycook;
    private Cashier cashier;

    @Before
    public void setUp() {
        manager = new Manager("Mr.Krabs", 30);
        restaurant = new BurgerByte("Bikini Bottom", manager);
        manager.setManagingBranch(restaurant);
        frycook = new FryCook("SpongeBob SquarePants", 20, restaurant);
        cashier = new Cashier("SquidWard Tentacles", 21, restaurant);
    }

    @Test
    public void testGetters() {
        assertEquals(restaurant.getLocation(), "Bikini Bottom");
        assertEquals(restaurant.getManager(), manager);
        assertEquals(restaurant.getEmployee().size(), 2);
        assertTrue(restaurant.getEmployee().contains(frycook));
        assertTrue(restaurant.getEmployee().contains(cashier));
        assertFalse(restaurant.isOpen());
    }

    @Test
    public void testopenRestaurant() {
        assertFalse(restaurant.isOpen());
        restaurant.openRestaurant();
        assertTrue(restaurant.isOpen());
    }

    @Test
    public void testcloseRestaurant() {
        assertFalse(frycook.isAtWork());
        assertFalse(cashier.isAtWork());
        frycook.startWork(10.00);
        cashier.startWork(5.00);
        assertTrue(frycook.isAtWork() && cashier.isAtWork());
        restaurant.closeRestaurant();
        assertFalse(frycook.isAtWork());
        assertFalse(cashier.isAtWork());
    }

    @Test
    public void testremoveStaff() {
        assertEquals(restaurant.getEmployee().size(), 2);
        assertTrue(restaurant.getEmployee().contains(frycook));
        assertTrue(restaurant.getEmployee().contains(cashier));
        restaurant.removeEmployee(frycook);
        assertEquals(restaurant.getEmployee().size(), 1);
        assertFalse(restaurant.getEmployee().contains(frycook));
    }

    @Test
    public void testaddStaff() {
        restaurant.removeEmployee(frycook);
        restaurant.removeEmployee(cashier);
        assertEquals(restaurant.getEmployee().size(), 0);
        assertFalse(restaurant.getEmployee().contains(frycook));
        assertFalse(restaurant.getEmployee().contains(cashier));
        restaurant.addEmployee(frycook);
        assertEquals(restaurant.getEmployee().size(), 1);
        assertTrue(restaurant.getEmployee().contains(frycook));
    }

    @Test
    public void testcomputeStaffWages() {
        frycook.startWork(10.00);
        cashier.startWork(4.50);
        restaurant.computeStaffWages();
    }


}
// Starting point for exeting a program 
public class Truck {
    public void drive() {...}
    public void park() {...}
    ...
    public static void main(...){...}
}

//Testing Framework JUNIT:

public class TruckTest {
    Truck t;
    @Before
    public void setup() {
        t = new Truck();
    @Test
    public void driveTest() {...}
    @Test
    public void parkTest() {...}
    ...
}

//
Truck t = new Truck();
t.drive();

Truck t = new Truck();
t.park();

}

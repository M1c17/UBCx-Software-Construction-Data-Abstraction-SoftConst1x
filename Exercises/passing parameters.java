public void whatever() {
    int x = 3;  // int is a primitive
    notMuch(x); // x's value (3) is copied into num
    int y = x;  // y gets x's value from line 1 (3)
}

public void notMuch(int num) {
    num = 5;    // num changes to 5;
                // num goes away because it's out of scope
}

public void whatever() {
    Dog d;
    d = new Dog();      // d is an object reference to a Dog object
    d.name = "elisa";   // d's object's name is set to "elisa"
    bitMore(d);         // we copy d's reference into myDog
    print(d.name);      // d's name has now changed to "norm"
}

// Version 1
public void bitMore(Dog myDog) {    // d's reference is copied into myDog
    myDog.name = "norm";            // d's and myDog's object's name is set to "norm"
                                    // myDog goes away because it's out of scope
}
// Version 2
public void bitMore(Dog myDog) {    // d's reference is copied into myDog
    myDog = new Dog();              // myDog's reference is overwritten equally
    myDog.name = "norm";            // myDog's name is changed, d's name is not changed
                                    // myDog goes away because it's out of scope
}

public void whatever() {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    useList(nums);  // nums reference is copied into myList
    nums.add(6);    // nums gets an additional Integer (6) in its list,
                    // so now the ArrayList looks like [ 5 | 6 | |... | ]
}
public void useList(ArrayList<Integer> myList) { // nums' reference is copied into myList
    myList.add(5);          // 5 is added into myList also referenced by nums
                            // so the ArrayList looks like [5 | | ... | ]
                   // myList goes away because it's out of scope, but nums lives on
}

//We can imagine the print method above looks something like this:

public static void print(Object x) {
    System.out.println(x);
}
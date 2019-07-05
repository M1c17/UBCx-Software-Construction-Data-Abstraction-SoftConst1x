package ui;

/**
 * Created by MASTER on 4/30/19.
 */

import java.util.ArrayList;
public class test {

    int x;
    Dog d;
    Dog fido;
    ArrayList<Dog> dogs;

    public test(){
        x = 3;
        d = new Dog();
        fido  = d;
        d.name = "Jim";
        fido.bark();
        fido.name = "Fido";
        fido.bark();
        dogs = new ArrayList<Dog>();
        dogs.add(d);
        System.out.println(dogs);
    }

}

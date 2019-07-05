Dog Class

package ui;

import static java.lang.System.out;

public class Dog {

    String name;

    void bark(){
        out.println(name);
    }
}

Test file

package ui;
import java.util.ArrayList;
import ui.Dog.*;
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
package ui;

import model.IntegerSet;

/**
 * Created by MASTER on 5/2/19.
 */
public class IntegerSetUsage {

    public static void main(String[] args) {
        IntegerSet mySet = new IntegerSet();
        mySet.insert(3);
        System.out.println("Is the number in the set? " +  mySet.contains(3));
        System.out.println("The size of the set is  " +  mySet.size());
        mySet.insert(5);
        mySet.remove(3);
        System.out.println("Is the number in the set? " +  mySet.contains(3));
        System.out.println("The size of the set is  " +  mySet.size());

    }
}

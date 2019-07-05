package ui;

import model.LowVolumenIntegerSet;

public class IntegerSetUsage {
    public static void main(String[] args) {
        LowVolumenIntegerSet mySet = new LowVolumenIntegerSet();
        mySet.insert(3);
        System.out.println("Does the set contain number 3? "+ mySet.contains(3));
        System.out.println("The size of the set is: "+ mySet.size());
        mySet.remove(3);
        System.out.println("Does the set contain number 3? "+ mySet.contains(3));
        System.out.println("The size of the set is: "+ mySet.size());

        LowVolumenIntegerSet is = new LowVolumenIntegerSet();
        is.insert(5);
    }


}
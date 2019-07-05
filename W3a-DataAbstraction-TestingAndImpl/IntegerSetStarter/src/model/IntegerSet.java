package model;

import java.util.ArrayList;

public class IntegerSet {

    private ArrayList<Integer> internalArray;

    public IntegerSet() {
        internalArray = new ArrayList<Integer>();
    }

    //getters
    public ArrayList<Integer> getinternalArray() {return internalArray;}
    //setters
    public void setInternalArray(ArrayList<Integer> internalArray) {this.internalArray = internalArray;}


    // MODIFIES: this
    // EFFECTS: inserts integer into set unless it's already there, in which case do nothing.
    public void insert(Integer num) {

        if(!internalArray.contains(num)) {
            internalArray.add(num);
        }
//        if(internalArray.contains(num)) {
//            System.out.println("The num is Already in the set");


    }

    // MODIFIES: this
    // EFFECTS: if the integer is in the integer set, then remove it from the integer set.
    //          otherwise, do nothing.
    public void remove(Integer num) {

        if (internalArray.contains(num)) {
            internalArray.remove(num);
        }

    }

    // MODIFIES: this
    // EFFECTS: return true or false if the set contains the num
    public boolean contains(Integer num) {
        return internalArray.contains(num);
    }

    // MODIFIES: this
    //EFFECTS: return the size of the set
    public int size(){
        return internalArray.size();
    }

}

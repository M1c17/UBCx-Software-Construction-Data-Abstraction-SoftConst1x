package model;

public interface IntegerSet {
    // MODIFIES: this
    // EFFECTS: inserts integer into set unless it's already there, in which case do nothing
    void insert(Integer num);

    // MODIFIES: this
    // EFFECTS: if the integer is in the integer set, them remove it from the integer set.
    //          Otherwise, do nothing
    void remove(Integer num);

    // EFFECTS: if the integer is contained within the set, return true. Otherwise return false
    boolean contains(Integer num);

    // EFFECTS: returns the size of the set
    int size();
}

package model;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerSetTest {

    IntegerSet testSet;

    @Before
    public void setup() {
        testSet = new IntegerSet();
    }

    // TODO: Test insert # not there: Insert # that's not in the set
    // TODO: outcome: # appears in the set once

    @Test
    public void testInsertNotThere() {
        //check that the number is not already in the set
        CheckSetEmptyDoesntContain(3);

        //insert the number into the set
        testSet.insert(3);

        //check that the number is already in the set once
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
    }

    @Test
    public void testInsertAlreadyThere(){
        //check that the number is not already in the set
        CheckSetEmptyDoesntContain(3);

        //insert the number into the set
        testSet.insert(3);

        //check that the number is already in the set once
        CheckSetonceContains(3);

        //insert the number again
        testSet.insert(3);

        //check that the number is in the set once
        CheckSetonceContains(3);
    }

    private void CheckSetonceContains(int num) {
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(num));
    }

    private void CheckSetEmptyDoesntContain(int num) {
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(num));
    }

    @Test
    public void testRemoveIsThere() {

        testSet.insert(3);
        assertTrue(testSet.contains(3));
        testSet.remove(3);
        assertFalse(testSet.contains(3));
    }

    @Test
    public void testRemoveIsNotThere() {
        assertFalse(testSet.contains(5));
        testSet.remove(5);
        assertFalse(testSet.contains(5));

    }
}

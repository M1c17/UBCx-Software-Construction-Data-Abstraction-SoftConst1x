package test;

import model.IntegerSet;
import model.LowVolumenIntegerSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LowVolumeIntegerSetTest {
    IntegerSet testSet;

    @Before
    public void setUp() { testSet = new LowVolumenIntegerSet(); }

    @Test
    public void testInsertNotThere() {
        checkSetEmptyDoesntContain(3);
        testSet.insert(3);
        checkSetContainsOnce(3);
    }

    @Test
    public void testInsertAlreadyThere() {
        checkSetEmptyDoesntContain(3);
        testSet.insert(3);
        checkSetContainsOnce(3);
        testSet.insert(3);
        checkSetContainsOnce(3);
    }

    @Test
    public void testHighVolumenIntegerSet() {
        for(int i = 0; i < 5000; i++) {
            testSet.insert(i);
            assertTrue(testSet.contains(i));
            assertEquals(testSet.size(), i+1);
        }
    }

    private void checkSetContainsOnce(int num) {
        assertEquals(testSet.size(),1);
        assertTrue(testSet.contains(num));
    }

    private void checkSetEmptyDoesntContain(int num) {
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(num));
    }


}
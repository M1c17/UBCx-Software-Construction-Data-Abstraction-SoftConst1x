package test;

import model.HighVolumeIntegerSet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class HighVolumeIntegerSetTest extends IntegerSetTest{

    // NOTE: this project accompanies the Abstract IntegerSetTest video

    @Before
    public void setup(){
        testSet = new HighVolumeIntegerSet();
    }

    @Test
    public void testInsertHighVolume(){
        for (int i=0; i<50000; i++){
            testSet.insert(i);
            assertTrue(testSet.contains(i));
            assertEquals(testSet.size(), i+1);
        }
    }
}
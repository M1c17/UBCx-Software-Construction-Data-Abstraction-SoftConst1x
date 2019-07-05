package test;

import model.LowVolumeIntegerSet;
import org.junit.Before;

public class LowVolumeIntegerSetTest extends IntegerSetTest {

    @Before
    public void setUp() {
        testSet = new LowVolumeIntegerSet();
    }
}

package test;

import model.IntegerSet;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public abstract class IntegerSetTest {
  IntegerSet testSet;

  @Test
  public void testInsertNotThere(){
      checkSetEmptyDoesntContain(3);
      testSet.insert(3);
      checkSetContainsOnce(3);
  }

  @Test
  public void testInsertAlreadyThere(){
      checkSetEmptyDoesntContain(3);
      testSet.insert(3);
      checkSetContainsOnce(3);
      testSet.insert(3);
      checkSetContainsOnce(3);
  }

  @Test
  public void testInsertHighVolume(){
      for (int i=0; i<5000; i++){
          testSet.insert(i);
          assertTrue(testSet.contains(i));
          assertEquals(testSet.size(), i+1);
      }
  }

  private void checkSetEmptyDoesntContain(int num) {
      assertEquals(testSet.size(), 0);
      assertFalse(testSet.contains(num));
  }

  private void checkSetContainsOnce(int num) {
      assertEquals(testSet.size(), 1);
      assertTrue(testSet.contains(num));
  }
}

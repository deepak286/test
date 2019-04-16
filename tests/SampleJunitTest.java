package tests;

import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.runners.Parameterized;

public class SampleJunitTest{
  @Test
  public void test1()
  {
      Assertions.assertTrue(true);
  }
  @Test
  public void test2(){
    Assertions.assertTrue(false);
  }
}

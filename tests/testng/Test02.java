package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test02 {
  @Test
  public void f() {
	  Assert.assertEquals(false, false);
  }
}

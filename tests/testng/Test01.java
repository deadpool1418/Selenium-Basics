package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Test01 {
  @Test
  public void f() {
	  Assert.assertEquals(false, false);
	  
  }
}

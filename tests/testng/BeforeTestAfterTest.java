package testng;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class BeforeTestAfterTest {
	WebDriver driver;
	
	  @DataProvider(name = "data")
	  public Object[] sendData() {
   		  Object[] dataObject = {
				"Google",
				"Wikipedia"
		  };
		  return dataObject;
	  }
	
	  //@Parameters({"suite-param"})
	
	  @Test(description = "Google Title Test", dataProvider = "data")
	  public void f(String title) throws FileNotFoundException, IOException, InterruptedException {
		  driver.get(getProperty("baseUrl"));
		  Assert.assertEquals(driver.getTitle(), title);
	  }
	  @BeforeTest
	  public void beforeTest() throws FileNotFoundException, IOException {
		  driver = setup("CH");
	  }
	
	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

}

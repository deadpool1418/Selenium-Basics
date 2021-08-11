package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class BeforeClassAfterClass {
	WebDriver driver;
  @Test
  public void testGoogle() throws InterruptedException, FileNotFoundException, IOException {
	  	driver.get(getProperty("baseUrl"));
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
  }
  @Test
  public void testWikipedia() throws InterruptedException, FileNotFoundException, IOException {
	  	driver.get(getProperty("baseUrl"));
		driver.findElement(By.name("q")).sendKeys("Wikipedia");
		Thread.sleep(2000);
		
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.linkText("Wikipedia")).click();
		driver.findElement(By.name("search")).sendKeys("Selenium");
		driver.findElement(By.id("searchButton")).click();
		
		String expectedTitle = getProperty("expectedTitle");
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
  }
  @BeforeClass
  public void beforeClass() throws FileNotFoundException, IOException {
	  driver = setup("CH");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}

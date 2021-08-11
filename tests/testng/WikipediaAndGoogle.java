package testng;

import org.testng.annotations.Test;
import static scripts.PropertyReader.getProperty;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WikipediaAndGoogle {
	  
	WebDriver driver;
	
	@Test
	public void TestWikipedia() throws FileNotFoundException, IOException, InterruptedException {
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
		  
	@Test
	public void TestGoogle() throws InterruptedException, FileNotFoundException, IOException {
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
	}
		  
	@BeforeMethod
	public void beforeMethod() throws FileNotFoundException, IOException {
		driver = setup("CH");
		driver.get(getProperty("baseUrl"));
	}
		
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}

package scripts;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserCommands {
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = setup("FF");
		String baseUrl = getProperty("baseUrl");
		String googleUrl = "https://www.google.com";
		
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		driver.get(googleUrl);
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Dimension dimension = driver.manage().window().getSize();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.manage().window().setSize(dimension);
		Thread.sleep(1000);

		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL, "t");
		Thread.sleep(2000);
//		System.out.println(driver.getCurrentUrl());
//
//		System.out.println(driver.getPageSource());
		driver.quit();
	}
}

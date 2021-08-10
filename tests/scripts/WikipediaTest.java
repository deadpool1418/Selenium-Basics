package scripts;

import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		WebDriver driver = setup("CH");
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("wikipedia");
		element = driver.findElement(By.name("btnK"));
		element.submit();
		driver.findElement(By.linkText("Wikipedia")).click();
		
		driver.findElement(By.name("search")).sendKeys("Selenium");
		driver.findElement(By.id("searchButton")).click();

		if (driver.getTitle().equals("Selenium - Wikipedia")) {
			System.out.println("TC-1 Passed");
		}
		else {
			System.out.println("TC-1 Failed");
		}
		if (driver.findElement(By.id("firstHeading")).getText().equals("Selenium")) {
			System.out.println("TC-2 Passed");
		}
		else {
			System.out.print("TC-2 Failed");
		}
//		driver.findElement(By.linkText("English")).click();
		driver.quit();
	}
}

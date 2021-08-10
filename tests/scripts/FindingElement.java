package scripts;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindingElement {
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = setup("CH");
		String urlString = getProperty("baseUrl");
		driver.get(urlString);
		
		//Finding input for searching google
		WebElement element = driver.findElement(By.name("q"));
//		element.click();
		element.sendKeys("selenium");
		Thread.sleep(2000);
		//Finding search button by name
		element = driver.findElement(By.name("btnK"));
		element.click();
		Thread.sleep(2000);
		driver.quit();
	}

}

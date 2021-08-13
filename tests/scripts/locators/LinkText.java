package scripts.locators;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkText {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		WebDriver driver = setup("CH");
		String baseUrl = "https://www.google.com";
		driver.get(baseUrl);
		
		WebElement element = driver.findElement(By.linkText("About"));
		System.out.println("Link Text: " + element.getAttribute("href"));
		
		element = driver.findElement(By.partialLinkText("Search"));
		System.out.println("Partial Link Text: " + element.getAttribute("href"));
		driver.quit();
	}

}

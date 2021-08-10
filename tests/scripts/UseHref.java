package scripts;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UseHref {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		WebDriver driver = setup("CH");
		String urlString = getProperty("baseUrl");
		driver.get(urlString);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement element: list) { 
			if (element.isDisplayed()) 
				System.out.println(element.getText() + " " + element.getAttribute("href"));
		}
	}

}

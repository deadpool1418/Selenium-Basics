package actions;


import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = setup("FF");
		String baseUrl = "https://jqueryui.com/button/";
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("//input[@type='submit'][@role]"));
		
		Actions action = new Actions(driver);
		action.click(element).click().build().perform();
		Thread.sleep(1000);
		
		action.clickAndHold(element).build().perform();
		Thread.sleep(1000);
		
		action.contextClick().build().perform();
		Thread.sleep(1000);
		driver.quit();
		
	}

}

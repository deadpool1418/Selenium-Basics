package actions;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoradActions {
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = setup("FF");
		String baseUrl = getProperty("dragUrl");
		driver.get(baseUrl);
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.UP).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}

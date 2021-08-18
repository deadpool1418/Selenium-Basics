package actions.robot;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyboardEvent {
	public static void main(String[] args) throws FileNotFoundException, IOException, AWTException {
		WebDriver driver = setup("FF");
		String baseUrl = "https://www.google.com";
		driver.get(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		
		driver.quit();
	}

}

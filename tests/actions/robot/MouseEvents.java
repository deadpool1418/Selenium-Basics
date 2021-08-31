package actions.robot;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseEvents {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException, IOException, AWTException, InterruptedException {
		WebDriver driver;
		Robot robot = new Robot();
		System.setProperty("webdriver.chrome.driver", getProperty("chromeDriverPath"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//url for drag and drop actions
		String baseUrl = "https://jqueryui.com/droppable/";
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		WebElement frameElement = driver.findElement(By.tagName("iframe"));
		int x = frameElement.getLocation().getX();
		int y = frameElement.getLocation().getY();
		
		driver.switchTo().frame(0);
		//Source element which we need to drag
		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
				
		//target element where we need to drop the element
		WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		int x1 = sourceElement.getLocation().getX() + x;
		int y1 = sourceElement.getLocation().getY() + y;
	
		int x2 = targetElement.getLocation().getX() + x;
		int y2 = targetElement.getLocation().getY() + y;
		
		System.out.println(x + " " + y + x1 + " " + y1);
		
		robot.mouseMove(x, y);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		robot.mouseMove(x2 + 10, y2 + 200);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		driver.quit();
		
	}

}

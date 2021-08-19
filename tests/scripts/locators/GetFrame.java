package scripts.locators;
import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetFrame {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		WebDriver driver = setup("CH");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://www.cookbook.seleniumacademy.com/Frames.html");
		
		driver.switchTo().frame("left");
		WebElement leftFrame = driver.findElement(By.tagName("p"));
		System.out.println(leftFrame.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		leftFrame = driver.findElement(By.tagName("p"));
		System.out.println(leftFrame.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("right");
		leftFrame = driver.findElement(By.tagName("p"));
		System.out.println(leftFrame.getText());
		
		driver.close();
	}

}

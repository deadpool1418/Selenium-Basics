package scripts;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooLoginTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = setup("CH");
		String username = getProperty("email");
		String password = getProperty("pass");
		
		driver.get(getProperty("emailUrl"));
		
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-passwd")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		
		if(driver.findElement(By.id("ybarAccountMenuOpener")).isDisplayed()) {
			System.out.print("Login Successful");
		}
		else {
			System.out.print("Login Not Successful");
		}
		
		driver.quit();
	}

}

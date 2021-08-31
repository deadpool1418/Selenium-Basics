package scripts;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CakeShop {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		WebDriver driver = setup("CH");
		String urlString = "http://localhost:3000/";
		driver.get(urlString);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//button[@class=\"btn btn-light\"][@type=\"button\"]"));
		element.click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vachaudhari26@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//button[@type='submit'][@class='btn btn-primary']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//button[@type='button'][@class='btn btn-danger']")).getText(), "Logout");
		System.out.println(driver.findElement(By.xpath("//button[@type='button'][@class='btn btn-danger']")).getText());
		driver.quit();
	}
}

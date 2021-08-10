package scripts;

import static scripts.PropertyReader.getProperty;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static utilities.Driver.setup;
public class FirstSeleniumTest {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		System.out.println("Hello");
//		WebDriver driver = null;
//		if(getProperty("browser").equals("FF")) {
//			System.setProperty("webdriver.gecko.driver", getProperty("firefoxDriverPath"));
//			driver = new FirefoxDriver();
//		}
//		else if(getProperty("browser").equals("CH")) {
//			System.setProperty("webdriver.chrome.driver", getProperty("chromeDriverPath"));
//			driver = new ChromeDriver();
//		}
		
		WebDriver driver = setup("FF");
		String urlString = getProperty("baseUrl");
		driver.get(urlString);
		System.out.print(driver.getTitle().equals(getProperty("expectedTitle")));
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}

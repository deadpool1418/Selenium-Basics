package scripts;

import static scripts.PropertyReader.getProperty;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver", getProperty("chromeDriverPath"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver  = new ChromeDriver(options);
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}

package scripts;

import static scripts.PropertyReader.getProperty;
import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxProfile {
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		ProfilesIni profilesIni = new ProfilesIni();
		org.openqa.selenium.firefox.FirefoxProfile profile = profilesIni.getProfile("cypher");
		
		FirefoxOptions opt = new FirefoxOptions();
		opt.setCapability(FirefoxDriver.PROFILE, profile);
		
		System.setProperty("webdriver.gecko.driver", getProperty("firefoxDriverPath"));
		WebDriver driver  = new FirefoxDriver(opt);
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
}

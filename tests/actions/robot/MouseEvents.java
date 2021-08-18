package actions.robot;

import static utilities.Driver.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class MouseEvents {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		WebDriver driver = setup("FF");
		String baseUrl = "https://www.google.com";
		driver.get(baseUrl);
	}

}

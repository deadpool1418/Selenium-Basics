package scripts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public static Properties properties = new Properties();
	public static String getProperty(String propertyName) throws FileNotFoundException, IOException {
		properties.load(new FileReader("files/application.properties"));
		return properties.getProperty(propertyName);
	}

}

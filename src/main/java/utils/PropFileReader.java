package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropFileReader {
	
	static Properties properties = new Properties();

	public PropFileReader() {
		try {
			InputStream inputStream = new FileInputStream(
					System.getProperty("user.dir") + "/object.properties");
			properties.load(inputStream);
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException while loading the appium-testing properties file");
		} catch (IOException e) {
			System.out.println("IOException while loading the appium-testing properties file");
		}
	}

	public Properties getInstance() {
		return properties;
	}

}

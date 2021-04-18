package utils;

import org.openqa.selenium.WebDriver;

public class DriverContext {
	
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DriverContext.driver = driver;
	}


}

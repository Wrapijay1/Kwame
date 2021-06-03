package com.aman.selenium.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aman.selenium.enums.ConfigProperties;
import com.aman.selenium.utils.PropertyUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverOperations {
	private DriverOperations() {
	}


	public static void initDriver() throws Exception {
		if (Objects.isNull(DriverManager.getDriver())) {
			WebDriverManager.chromedriver().setup();
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
		}
	}

	public static void quitDriver() throws Exception {
		if (Objects.nonNull(DriverManager.getDriver())) {
			Thread.sleep(3000);
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}

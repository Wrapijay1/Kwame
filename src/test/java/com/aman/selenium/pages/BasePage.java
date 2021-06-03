package com.aman.selenium.pages;

import org.openqa.selenium.By;
import com.aman.selenium.driver.DriverManager;
import com.aman.selenium.enums.WaitStrategy;
import com.aman.selenium.factories.ExplicitWaitFactory;

public class BasePage {
	
	protected BasePage() {}
	
	protected void click(By by, WaitStrategy waitStrategy) {
		ExplicitWaitFactory.performWaitStrategy(waitStrategy, by).click();
	}
	
	protected static void sendKeys(By by, String value, WaitStrategy waitStrategy) {
		ExplicitWaitFactory.performWaitStrategy(waitStrategy, by).sendKeys(value);
	}
	
	protected static String getPageTitle() {
		return DriverManager.getDriver().getTitle() ;
	}

}

package com.aman.selenium.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aman.selenium.constants.Constants;
import com.aman.selenium.driver.DriverManager;
import com.aman.selenium.enums.WaitStrategy;

public class ExplicitWaitFactory {
	
	private ExplicitWaitFactory() {}
	
	public static WebElement  performWaitStrategy(WaitStrategy waitStrategy, By by) {
		WebElement element = null ;
		if(waitStrategy == WaitStrategy.CLICKABLE) {
			element = new WebDriverWait(DriverManager.getDriver(),Constants.getExplicitWait())
			.until(ExpectedConditions.elementToBeClickable(by));
			 // wait.until(d->d.findElement(linkLogout).isEnabled()); // Java 8 way
		}else if(waitStrategy == WaitStrategy.PRESENT ) {
			element = new WebDriverWait(DriverManager.getDriver(),Constants.getExplicitWait())
					.until(ExpectedConditions.presenceOfElementLocated(by));
		} else if (waitStrategy == WaitStrategy.VISIBLE ) {
			element = new WebDriverWait(DriverManager.getDriver(),Constants.getExplicitWait())
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		}else if (waitStrategy == WaitStrategy.NONE) {
			element = DriverManager.getDriver().findElement(by);
		}
		
		return element ;
	}

}

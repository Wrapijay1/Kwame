package com.aman.selenium.pages;

import org.openqa.selenium.By;

import com.aman.selenium.enums.WaitStrategy;

public class OrangeHRMHomePage extends BasePage{

	private final static By linkLogout = By.xpath("//a[text()='Logout']");
	private final static By linkWelcome=By.id("welcome") ;


	public String getTitle() {
		return getPageTitle();
	}

	public OrangeHRMHomePage clickWelcome() {
		click(linkWelcome,WaitStrategy.VISIBLE);
		return this ;
	}

	public OrangeHRMLoginPage clickLogout() {
		click(linkLogout, WaitStrategy.CLICKABLE );
		return new OrangeHRMLoginPage()  ;
	}
	
	


}

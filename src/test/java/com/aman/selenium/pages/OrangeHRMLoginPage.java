package com.aman.selenium.pages;

import org.openqa.selenium.By;

import com.aman.selenium.enums.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage {
	protected OrangeHRMLoginPage() {}

	private final static By textboxUsername=By.id("txtUsername");
	private final static By textboxPassword=By.xpath("//input[@id='txtPassword' and @type='password']");
	private final static By btnLogin=By.id("btnLogin");

	public static OrangeHRMLoginPage enterUser(String user) throws Exception {
		sendKeys(textboxUsername, user, WaitStrategy.CLICKABLE);
		return new OrangeHRMLoginPage();
	}

	public  OrangeHRMLoginPage enterPassword(String password) throws Exception {
		sendKeys(textboxPassword, password, WaitStrategy.CLICKABLE) ;
		return new OrangeHRMLoginPage();
	}

	public  OrangeHRMHomePage clickLogin() throws Exception {
		click(btnLogin, WaitStrategy.NONE) ;
		return new OrangeHRMHomePage();
	}

	public  String getTitle() {
		return getPageTitle();
	}
}

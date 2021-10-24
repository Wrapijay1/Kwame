package com.aman.selenium.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aman.selenium.enums.ConfigProperties;
import com.aman.selenium.pages.OrangeHRMLoginPage;
import com.aman.selenium.utils.PropertyUtils;

public class OrangeHRMTest extends BaseTest{
	
	@Parameters("Browser")
	@Test
	public  void loginLogout(String browserName) throws Exception {
		System.out.println("Parameter value is "+browserName);
		String title =OrangeHRMLoginPage
		.enterUser(PropertyUtils.get(ConfigProperties.USER)).enterPassword(PropertyUtils.get(ConfigProperties.PASSWORD)).clickLogin()
		.clickWelcome().clickLogout()
		.getTitle();
		
		assertThat(title)
		.isEqualTo("OrangeHRM");
		
		boolean value = title.toLowerCase().matches("\\w.*"+"hrm"); // \\w means any of these [a-zA-Z0-9] , * means any count >=0 
		assertThat(value).isTrue();
	}	
}

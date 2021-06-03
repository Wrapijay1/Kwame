package com.aman.selenium.tests;

import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;

import com.aman.selenium.enums.ConfigProperties;
import com.aman.selenium.pages.OrangeHRMLoginPage;
import com.aman.selenium.utils.PropertyUtils;

public class OrangeHRMTest extends BaseTest{
	
	@Test
	public  void loginLogout() throws Exception {
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

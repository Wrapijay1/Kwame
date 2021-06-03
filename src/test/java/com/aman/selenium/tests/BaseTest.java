package com.aman.selenium.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.aman.selenium.driver.DriverOperations;


public class BaseTest {
	
	protected BaseTest() {
		
	}

	@BeforeMethod
	protected void setup() throws Exception {	
		DriverOperations.initDriver();
	}
	
	@AfterMethod
	protected void teardown() throws Exception {
		DriverOperations.quitDriver();
	}
}

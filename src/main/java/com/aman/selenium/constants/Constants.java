package com.aman.selenium.constants;

public final class Constants {

	private Constants() {}
	
	private static final  String CONFIGPATH="./src/main/resources/config/config.properties";
	private static final  int EXPLICITWAIT= 10 ;
	private static final  String TESTDATAEXCELPATH= "./src/test/resources/testData.xlsx";
	
	public static int getExplicitWait() {
		return EXPLICITWAIT;
	}

	public static String getTestDataExcelPath() {
		return TESTDATAEXCELPATH;
	}

	public static String getConfigPath() {
		return CONFIGPATH;
	}
}

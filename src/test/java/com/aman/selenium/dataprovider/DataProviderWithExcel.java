package com.aman.selenium.dataprovider;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aman.selenium.constants.Constants;

public class DataProviderWithExcel {

	@Test(dataProvider="getData")
	public void test2(Map<String, String> map) {
		
		System.out.println("Enter User" +" "+map.get("userName"));
		System.out.println("Enter password"+" "+map.get("password"));
	}

	@DataProvider
	public Object[] getData() throws Exception {

		FileInputStream fis = new FileInputStream(Constants.getTestDataExcelPath());
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("testing");

		int rnum = sheet.getLastRowNum();
		int cnum= sheet.getRow(0).getLastCellNum();
		Map<String, String> map ;
		Object[] data = new Object[rnum] ;

		for (int i=1; i<=rnum; i++) {
			map = new HashMap<>();
			for (int j=0; j<cnum;j++) {
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value= sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
			}
			data[i-1]=map;
		}
		workbook.close();
	return data;
	}

}

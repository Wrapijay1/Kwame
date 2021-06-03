package com.aman.selenium.utils;

public class Practice {

	public static void main(String[] args) {
		String title ="orangehrm" ;
		boolean value = title.toLowerCase().matches("\\w.*"+"hrm");
		System.out.println(value);

	}

}

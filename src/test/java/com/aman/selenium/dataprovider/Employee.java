package com.aman.selenium.dataprovider;

public class Employee {
	
	int id;
	String userName ;
	
	public Employee(int id, String userName) {
		this.id=id ;
		this.userName=userName;
	}

	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}
	
	@org.testng.annotations.DataProvider
	public static Object[][] getData1() {
		return new Object[][] {
				{"Aman"}, {"Sawda"} , {"Vodafone"}};
	}

}

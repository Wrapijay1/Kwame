package com.aman.selenium.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider="getDataMultipleTests")
	public void test1(Employee userName) {
		System.out.println(userName.getId());
		System.out.println("Enter User");
		System.out.println("Enter password");
		System.out.println("Login");
	}
	
	@Test(dataProvider="getDataMultipleTests")
	public void test2(Object userName) {
//		System.out.println(userName.getId());
		System.out.println("Enter User2");
		System.out.println("Enter password2");
		System.out.println("Login2");
	}

	@org.testng.annotations.DataProvider
	public String[] getData() {
		return new String[]  {"Aman", "Sawda" , "Vodafone"};
		// return a;
	}
	
	@org.testng.annotations.DataProvider
	public Employee[] getData2() {
		return new Employee[] {
				new Employee(1,"Aman"),
				new Employee(2, "Sawda")
		} ;
		};
		
		@org.testng.annotations.DataProvider
		public Object[] getDataMultipleTests(Method m) {
			if(m.getName().equalsIgnoreCase("test1")) {
				return new Employee[] {
						new Employee(1,"Aman"),
						new Employee(2, "Sawda")
				} ;
			}else if(m.getName().equalsIgnoreCase("test2")) {
				return new String[]  {"Aman", "Sawda" , "Vodafone"};
			}
			return null ;
		}
		
	//	Object[][] -- 1st dimension - how many iteration you want to run this test 
		//2nd dimension - how many parameters you want to feed to your test method
		
	/*	2D Object array is not always the return type of data provider
	 * example - String[] , Employee[] , Object[] - everything is possible
	 * Test Methods will search data providers in the same class. If they exist in different class then 
	 * we need to give the class name explicitly in the form of dataProviderClass parameter.
	 * The class in which dataProvider method exists should have a default constructor and if not then data provider method should be static			
			*/
		
		
				
	}





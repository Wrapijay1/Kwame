package com.aman.selenium.enumsPractice;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class EnumRunner {

	public static void main(String[] args) {
		
		System.out.println(Severity.CRITICAL); // Java Compiler By default adds a toString 
		
		Severity sev = Severity.CRITICAL ;
		
		if(Severity.valueOf("CRITICAL")== Severity.CRITICAL)
		{
			System.out.println("critical");
		}
		else if (sev==Severity.HIGH) {
			System.out.println("high");
		}
		
		Severity[] a =Severity.values();
		for(Severity sevv : a) {
			System.out.println(sevv);
		}
		
		// alternative way to achieve line 21-24
//		Arrays.asList(Severity.values()).forEach(System.out::println);
//		
//		Map<Severity , String> map = new EnumMap<>(Severity.class) ;
//		map.put(Severity.HIGH, "high");
//		map.put(Severity.CRITICAL, "critical");
//		
//		map.forEach((k,v) -> System.out.println(k));
	}

}

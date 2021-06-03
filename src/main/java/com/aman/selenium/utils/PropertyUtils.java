package com.aman.selenium.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Properties;

import com.aman.selenium.constants.Constants;
import com.aman.selenium.enums.ConfigProperties;

public final class PropertyUtils {

	private PropertyUtils() {}
	
//	private static final Map<String, String> CONFIGMAP ;
//	
//	static {
//		File src = new File(Constants.getConfigPath());
//		FileInputStream fis;
//		try {
//			fis = new FileInputStream(src);
//			prop.load(fis);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		 CONFIGMAP = new HashMap<String, String>();
//		for (Map.Entry<Object, Object> entry : prop.entrySet()) {
//			CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())) ;
//		}
//	}
	static Properties prop = new Properties();
	static {

		File src = new File(Constants.getConfigPath());
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}


	public static String get(ConfigProperties key) throws NullPointerException {
		String value = prop.getProperty(key.toString().toLowerCase()) ;
		if (Objects.isNull(key) || Objects.isNull(value)) {
			throw new NullPointerException("Either key with name "+key+" or its value "+value+ " is null") ;
		}
		return value.trim() ;
	}
	
//	public static String getMap(String key) throws NullPointerException {
//		String value = CONFIGMAP.get(key);
//		if (Objects.isNull(key) || Objects.isNull(value)) {
//			throw new NullPointerException("Either key with name "+key+" or its value "+value+ " is null") ;
//		}
//		return value ;
//	}
	



}

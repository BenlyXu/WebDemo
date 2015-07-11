package com.demo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Properties;

import lombok.extern.log4j.Log4j;

/**
 * Tool for reading and writing properties file
 * @author xubenling
 * @date Jun 19, 2015 10:36:03 AM
 */
@Log4j
public final class PropertiesUtil {

	private static Properties prop = new Properties();	
	
	/**
	 * Loading properties file
	 * @param propFilePath
	 * @return
	 */
	public static Properties loadProp(String propFilePath) {
		InputStream inStream = ClassLoader.getSystemResourceAsStream(propFilePath);
		try {
			prop.load(inStream);
			log.info("Successfully loading properties from [" + propFilePath + "]");
		} catch (IOException e) {
			log.error("Throwing exception when loading properties.", e);
		} finally {
			if (inStream != null) {
				try {
					inStream.close();
				} catch (IOException e) {
					log.error("Throwing exception when closing input stream.", e);
				}
			}
		}
		return prop;
	}
	
	
//	public static String getString(String key, String defaultVal) {
//		String str = prop.getProperty(key);
//		return str != null ? str : defaultVal;
//	}
//	
//	
//	public static Integer getInteger(String key, Integer defaultVal) {		
//		String str = prop.getProperty(key);
//		try {
//			return Integer.parseInt(str);
//		} catch (Exception e) {}
//		return defaultVal;
//	}
//	
//	
//	public static Boolean getBoolean(String key, Boolean defaultVal) {
//		String str = prop.getProperty(key);
//		try {
//			return Boolean.parseBoolean(str);
//		} catch (Exception e) {}
//		return defaultVal;
//	}
	
	
	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		Properties dbProp = PropertiesUtil.loadProp("db.properties");
		for (Entry<Object, Object> entry : dbProp.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
	
}

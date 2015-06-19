package com.changyou.demo;

import java.util.Properties;

import com.changyou.demo.util.PropertiesUtil;

/**
 * 常量类
 * @author xubenling
 * @date 2014年4月3日 上午10:41:38
 */
public final class Constants {

	public static final String DEFAULT_ENCODING = "UTF-8";
	
	
	public static final Properties DB_PROP = PropertiesUtil.loadProp("db.properties");
	
	public static final String DB_DRIVER = Constants.DB_PROP.getProperty("db.mysql.driver");
	
	public static final String DB_URL = Constants.DB_PROP.getProperty("db.mysql.url");
	
	public static final String DB_USERNAME = Constants.DB_PROP.getProperty("db.mysql.username");
	
	public static final String DB_PASSWORD = Constants.DB_PROP.getProperty("db.mysql.password");
	
	
	
}

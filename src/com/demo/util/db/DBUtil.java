package com.demo.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.demo.Constants;

import lombok.extern.log4j.Log4j;

/**
 * DB连接工具类
 * @author xubenling
 * @date 2014年4月9日 上午11:23:10
 */
@Log4j
public final class DBUtil extends DataBaseUtil {
	
	private static DBUtil instance = null;
	
	public static  DBUtil getInstance() {
		if (null == instance) {
			instance = new DBUtil();
		}
		return instance;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(Constants.DB_DRIVER);
			conn = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USERNAME, Constants.DB_PASSWORD);
			if (log.isDebugEnabled()) {
				log.debug("Database connection: " + conn);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}

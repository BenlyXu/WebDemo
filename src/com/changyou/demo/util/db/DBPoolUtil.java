package com.changyou.demo.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.changyou.demo.Constants;

import lombok.extern.log4j.Log4j;

/**
 * 连接池proxool
 * @author xubenling
 * @date 2014年4月9日 上午11:22:56
 */
@Log4j
public final class DBPoolUtil extends DataBaseUtil {
	
	private static DBPoolUtil instance = null;
	
	public static DBPoolUtil getInstance() {
		if (null == instance) {
			instance = new DBPoolUtil();
		}
		return instance;
	}
	
	public Connection getConnection() {
		return getConnection(Constants.DEFAULT_POOL_NAME);
	}
	
	public Connection getConnection(String poolName) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(poolName);
			if (log.isDebugEnabled()) {
				log.debug("Database pool[" + poolName +"] connection: " + conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}

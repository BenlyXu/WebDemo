package com.changyou.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.log4j.Log4j;

/**
 * 连接池proxool
 * @author xubenling
 * @date 2014年4月9日 上午11:22:56
 */
@Log4j
public class DBPoolUtil {
	
	private static final String DEFAULT_POOL_NAME = "proxool.mysql";
	
	public static Connection getConnection(String poolName) {
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
	
	public static Connection getDefaultPoolConnection() {
		return getConnection(DEFAULT_POOL_NAME);
	}
	
	public static void close(ResultSet rs, PreparedStatement ps, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

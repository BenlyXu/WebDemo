package com.changyou.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.log4j.Log4j;

/**
 * DB连接工具类
 * @author xubenling
 * @date 2014年4月9日 上午11:23:10
 */
@Log4j
public final class DBUtil {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/mysql";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
	
	/**
	 * 获得db连接
	 * @author xubenling
	 * @date 2014年4月9日 上午11:35:43
	 * @return Connection
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
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
	
	/**
	 * 关闭数据库资源
	 * @author xubenling
	 * @date 2014年4月9日 上午11:36:19
	 * @param rs - ResultSet
	 * @param ps - PreparedStatement
	 * @param conn - Connection
	 */
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

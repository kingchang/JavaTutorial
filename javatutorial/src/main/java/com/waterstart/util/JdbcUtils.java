package com.waterstart.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	
	
	public final static Connection open() throws Exception{
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/test", "skyuser","test");
		return conn;
	}
	
	
	public final static void close(Connection conn) throws Exception{
		conn.close();
	}
	
	
}

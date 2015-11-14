package com.waterstart.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.waterstart.util.JdbcUtils;

public class Tutorial4 {

	public static void main(String[] args) throws Exception {
		Connection conn = JdbcUtils.open();
		Statement statement = conn.createStatement();
//		ResultSet rs = statement.executeQuery("");
		statement.close();
		JdbcUtils.close(conn);
	}

}

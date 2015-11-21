package com.waterstart.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.waterstart.vo.WorkingType;

public class Tutorial5 {

	private final static Logger log = LoggerFactory.getLogger("JDBC Tutorial");

	public static void main(String[] args) {

		// ======= mysql =============
		// com.mysql.jdbc.Driver
		// jdbc:mysql://127.0.0.1/test

		// ======= mssql =============
		// net.sourceforge.jtds.jdbc.Driver
		// jdbc:jtds:sqlserver://127.0.0.1:1433/test

		// ====== oracle =============
		// com.oracle.Driver
		// jdbc:oracle:thin://xxxxxxx/xxxx

		// mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc14
		// -Dversion=10.2.0.3.0 -Dpackaging=jar -Dfile=ojdbc.jar
		// -DgeneratePom=true
		java.util.Date date = new java.util.Date();
		Date sqlDate1 = new Date(System.currentTimeMillis());
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		try {
			Class.forName("org.postgresql.Driver");

			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/test", "test", "test");
			connection.setAutoCommit(false);
			statement = connection
					.prepareStatement("SELECT * FROM workOrder where orderNumber = ? and orderStatus = ? ");
			statement.setString(1, "20151121000002");
			statement.setString(2, WorkingType.Pending.toString());
			rs = statement.executeQuery();
			while (rs.next()) {
				Long id = rs.getLong("id");
				String orderNumber = rs.getString("orderNumber");
				WorkingType orderStatus = WorkingType.valueOf(rs.getString("orderStatus"));
				String installationAddress = rs.getString("installationAddress");
				String enginner = rs.getString("engineer");
				log.info("id==>{},orderNumber==>{},orderStatus==>{},installationAddress==>{},engineer==>{}",
						new Object[] { id, orderNumber, orderStatus, installationAddress, enginner });
			}
			statement.close();
			statement = connection.prepareStatement("UPDATE workOrder set orderStatus = ? where orderNumber = ?");
			statement.setString(1, WorkingType.PendingInstalltion.toString());
			statement.setString(2, "20151121000002");
			int rows =  statement.executeUpdate();
			log.info("update rows:{}",rows);
			connection.setAutoCommit(true);
		} catch (ClassNotFoundException cnfe) {
			log.error("找不到 JDBC DRIVER");
		} catch (SQLException sqle) {
			log.error("執行SQL錯誤，訊息：{}",sqle.getMessage());
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			sqle.printStackTrace();
		} finally {
			try {
				rs.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}

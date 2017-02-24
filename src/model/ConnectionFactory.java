package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

	private  ConnectionFactory() {

	}

	public static Connection getConnection() {
		Connection conn = null;
	
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/school", "root", "123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}

	public static Connection close(ResultSet rs,Statement stmt,Connection conn) {
		if(rs!=null)
		if(stmt!=null)
		if (conn != null)
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return conn;

	}
	

}

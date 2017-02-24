package model;

import java.sql.*;

public class UserCl {
	private Statement stmt=null;
	private ResultSet rs=null;
	private Connection conn=null;
	
	public boolean check(String username,String passwd){
	       boolean b=false;
		try {
			conn=ConnectionFactory.getConnection();
			stmt=conn.createStatement();
			rs = stmt.executeQuery("select passwd from users where username='"+username+"'");
			} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if(rs.next()){
				if(rs.getString(1).equals(passwd)){
				//瀵�
					b=true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn=ConnectionFactory.close(rs, stmt, conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return b;

}
	public boolean insert(String username,String passwd){
		boolean b=false;
		String sql = "insert into users(username,passwd) values(?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		conn = ConnectionFactory.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, passwd);
			ps.executeUpdate();
			b=true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn=ConnectionFactory.close(rs, stmt, conn);
		}
		return b;
		}
	
	public boolean checkname(String username){
	       boolean b=false;
		try {
			conn=ConnectionFactory.getConnection();
			stmt=conn.createStatement();
			rs = stmt.executeQuery("select * from users where username='"+username+"'");
			} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if(rs.next()){
				if(rs.getString(1).equals(username)){
				//瀵�
					b=true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn=ConnectionFactory.close(rs, stmt, conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return b;

}
	

}


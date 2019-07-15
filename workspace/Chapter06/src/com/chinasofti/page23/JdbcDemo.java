package com.chinasofti.page23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo {
	public static void main(String[] args) {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("无法找到驱动类");
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining?useSSL=false&serverTimezone=UTC", "root", "123456");

			Statement stmt = con.createStatement();

			String username = "Michael111";
			String password = "123 or 1=1";
			
			//查询
//			String queryStr = "SELECT id, username, password FROM profileinfo";
			String queryStr = "SELECT id, username, password FROM profileinfo where"
					+ " username= '" + username +"' and password=" + password;
			List<UserInfo> userList = JdbcDemo.executeQUery(stmt, queryStr);
			
			for(UserInfo userInfo : userList)
			{
				System.out.println(userInfo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (null != con) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static List<UserInfo> executeQUery(Statement stmt, String queryStr) throws SQLException
	{
		ResultSet rs = stmt.executeQuery(queryStr);
		List<UserInfo> userInfoList = new ArrayList<UserInfo>();

		while (rs.next()) 
		{
			int id = rs.getInt("id");
			String name = rs.getString("username");
			String password = rs.getString("password");
			
			UserInfo userInfo = new UserInfo(id, name, password);
			userInfoList.add(userInfo);
		}
		
		return userInfoList;
	}
	
	public static boolean executeInsert(Statement stmt, UserInfo user) throws SQLException
	{
		//(name, age, sex, high)
		return stmt.execute("insert into profileinfo(username, password) value('"+user.getUsername()+"', '"+
		user.getPassWord() + "')");
	}
	
}

package com.chinasofti.page12;

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

			//查询
			String queryStr = "SELECT id, name, age, sex, high FROM user";
			List<User> userList = JdbcDemo.executeQUery(stmt, queryStr);
			
			for(User user : userList)
			{
				System.out.println(user);
			}
			
			//插入
			User user = new User("Michael111", 33, 0, 19.22f);
			JdbcDemo.executeInsert(stmt, user);
			
			//更新 (id=0000000004)
			/*User user1 = new User("LangeHi", 26, 1, 16.66f);
			JdbcDemo.executeUpdate(stmt, 0000000004,user1);*/
			
			//删除
			//JdbcDemo.executeDelete(stmt, "Michael111");
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
	
	public static List<User> executeQUery(Statement stmt, String queryStr) throws SQLException
	{
		ResultSet rs = stmt.executeQuery("SELECT id, name, age, sex, high FROM user");
		List<User> userList = new ArrayList<User>();

		while (rs.next()) 
		{
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			float high = rs.getFloat("high");
			
			User user = new User(id, name, age, high);
			userList.add(user);
		}
		
		return userList;
	}
	
	public static boolean executeInsert(Statement stmt, User user) throws SQLException
	{
		//(name, age, sex, high)
		return stmt.execute("insert into user(name, age, sex, high) value('"+user.getName()+"', "+
		user.getAge() + "," +  user.getSex() + ", " +user.getHigh() + ")");
	}
	
	public static int executeUpdate(Statement stmt, int id, User user) throws SQLException
	{
		//(name, age, sex, high)
		return stmt.executeUpdate("update user set name = '"+user.getName()+"', age="+
				user.getAge() + ", sex=" +  user.getSex() + ", high=" +user.getHigh() + " where id=" + id);
	}
	
	public static boolean executeDelete(Statement stmt, String name) throws SQLException
	{
		return stmt.execute("delete from user where name = '" + name + "'");
	}
}

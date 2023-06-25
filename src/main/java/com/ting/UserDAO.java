package com.ting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class UserDAO {
	
	
	public static User getUser(String username) {
		
		
		User user = new User();
		
//		user.setUsername("Ting_Test");
//		user.setPassword("PASSWORD_TEST");
//		user.setInfo("INFO_TEST");
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_jsp_demo", "root", "zhengting001");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from user where username=" + "\'" + username + "\'");
			if (rs.next()) {
				
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setInfo(rs.getString("info"));
				
			}
			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		} 
		
		
		
		
		return user;
	
		
		
	}

}

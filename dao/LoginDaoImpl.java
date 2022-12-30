package com.training.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.servlet.model.User;

public class LoginDaoImpl implements LoginDao{
@Override
	public List<User> getUsers() {
		 List<User> userList = new ArrayList<>();
		 Connection con = null;
		
		try {
			 	Class.forName("com.mysql.cj.jdbc.Driver");
		        String url = "jdbc:mysql://localhost:3306/demo_1";
		        String user = "root";
		        String password = "india@123";
		        con = DriverManager.getConnection(url, user, password);
		        Statement stmt = con.createStatement();
		        ResultSet rs = stmt.executeQuery("select * from Product_");
	        while(rs.next()) {
	          	userList.add(new User(rs.getString(2), rs.getString(3)));
	        	
	        }
	       
		 }  
	        catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return userList;
	}

}
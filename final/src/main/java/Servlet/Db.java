package Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException {
	       
	        String dbDriver = "com.mysql.cj.jdbc.Driver";
	        String dbURL = "jdbc:mysql://localhost:3306/";
	       
	        String Name = "demo_1";
	        String Username = "root";
	        String Password = "india@123";
	  
	        Class.forName(dbDriver);
	        Connection cn = DriverManager.getConnection(dbURL + Name,Username,Password);
	        return cn;
	    }
}

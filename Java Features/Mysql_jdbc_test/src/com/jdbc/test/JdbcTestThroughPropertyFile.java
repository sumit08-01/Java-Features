package com.jdbc.test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JdbcTestThroughPropertyFile {

	public static void main(String[] args) {

		Connection myconn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			// Load the Properties file 
			Properties properties = new Properties();
			properties.load(new FileInputStream("demo.properties")); // name of properties file
			
			//Read the props
			String theUser = properties.getProperty("username");
			String thePassword = properties.getProperty("password");
			String theUrl = properties.getProperty("url");
			
			
			
			// 1. Get a connection to database
			myconn = DriverManager.getConnection(theUrl, theUser,thePassword);
			System.out.println("DataBase connection successfully");
		
			System.out.println("data base url " + theUrl);
			System.out.println("data base user " + theUser);
			
			
			//2. Create a statement 
			myStmt = myconn.createStatement();
			
			
			//3. Execute SQL query
			myRs = myStmt.executeQuery("select * from employees");
			
			//4.Process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name")+ ", "+ myRs.getString("first_name"));
			}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

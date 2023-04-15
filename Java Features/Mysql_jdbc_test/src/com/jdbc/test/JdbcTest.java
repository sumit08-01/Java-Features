package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) {

		Connection myconn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			// 1. Get a connection to database
			myconn = DriverManager.getConnection("jdbc:mysql://localhost:2000/demo", "student","Sumit@123");
			System.out.println("DataBase connection successfully");
		
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

package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteQuery {

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
			
			int executeUpdate = myStmt.executeUpdate(
					" delete from employees where first_name = 'sumit' ");
//					System.out.println(executeUpdate); --> 1 
			//it's return the int value Number of rows to effective
			
			//4. Verify to get the list of Employee
			myRs = myStmt.executeQuery("select * from employees order by last_name");
			
			//5.Process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name")+ ", "+ myRs.getString("email"));
			}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

}

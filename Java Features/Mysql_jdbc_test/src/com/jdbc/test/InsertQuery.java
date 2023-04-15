package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertQuery {

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
			
			
			//3. Inserting a new employee
			System.out.println("Inserting a new Employee to db");
			
			
			int executeUpdate = myStmt.executeUpdate("insert into employees" + "(last_name, first_name, email, department, salary)" + "values" +
					"('gond', 'sumit', 'sumitgond9999@gmail.com', 'SDE', '20.0')");
			//it's return the int value Number of rows to effective
			
			//4. Verify to get the list of Employee
			myRs = myStmt.executeQuery("select * from employees order by last_name");
			
			//5.Process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name")+ ", "+ myRs.getString("first_name"));
			}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

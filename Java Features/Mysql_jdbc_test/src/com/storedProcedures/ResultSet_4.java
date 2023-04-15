package com.storedProcedures;

import java.sql.*;

import com.mysql.cj.jdbc.CallableStatement;

public class ResultSet_4 {

	public static void main(String[] args) {

		Connection myconn = null;
		CallableStatement myStmt = null;
		
		try {
			// 1. Get a connection to database
			myconn = DriverManager.getConnection("jdbc:mysql://localhost:2000/demo", "student","Sumit@123");
			System.out.println("DataBase connection successfully");
		
			String theDepartment = "Engineering";
			
			//Prepare the stored Procedure call 
			myStmt = (CallableStatement) myconn.prepareCall("{call get_employees_for_department(?)}");

			
			//Set the Parameters
			myStmt.setString(1, theDepartment);
			
			//call stored procedure
			System.out.println("Calling stored procedure. get_employees_for_department('"+ theDepartment + "')");
			myStmt.execute();
			System.out.println("Finished calling stored procedure");
			
			
			//Get the value of the resultSet parameter
			ResultSet resultSet = myStmt.getResultSet();
				
			
			
			System.out.println(resultSet);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

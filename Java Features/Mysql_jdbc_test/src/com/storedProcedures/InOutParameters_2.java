package com.storedProcedures;

import java.sql.*;

import com.mysql.cj.jdbc.CallableStatement;

public class InOutParameters_2 {

	public static void main(String[] args) {

		Connection myconn = null;
		CallableStatement myStmt = null;
		
		try {
			// 1. Get a connection to database
			myconn = DriverManager.getConnection("jdbc:mysql://localhost:2000/demo", "student","Sumit@123");
			System.out.println("DataBase connection successfully");
		
			String theDepartment = "Engineering";
			
			//Prepare the stored Procedure call 
			myStmt = (CallableStatement) myconn.prepareCall("{call greet_the_department(?)}");

			
			//Set the Parameters
			myStmt.registerOutParameter(1, Types.VARCHAR );
			myStmt.setString(1, theDepartment);
			
			//call stored procedure
			System.out.println("Calling stored procedure. greet_the_department('"+ theDepartment + "', )");
			myStmt.execute();
			System.out.println("Finished calling stored procedure");
			
			
			//Get the value of the INOUT parameter
			String theResult = myStmt.getString(1);
			
			System.out.println("\nThe result = " + theResult);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

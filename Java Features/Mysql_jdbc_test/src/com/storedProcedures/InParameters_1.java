package com.storedProcedures;

import java.sql.*;

import com.mysql.cj.jdbc.CallableStatement;

public class InParameters_1 {

	public static void main(String[] args) {

		Connection myconn = null;
		CallableStatement myStmt = null;
		
		try {
			// 1. Get a connection to database
			myconn = DriverManager.getConnection("jdbc:mysql://localhost:2000/demo", "student","Sumit@123");
			System.out.println("DataBase connection successfully");
		
			String theDepartment = "Engineering";
			int theIncreaseAmount = 5000;
			
			//Showing salary Before
			System.out.println("Salaries Before\n");
//			showSalaries(myconn, theDepartment);
			
			//Prepare the stored Procedure call 
			myStmt = (CallableStatement) myconn.prepareCall("{call increase_salaries_for_department(?, ? )}");

			
			//Set the Parameters
			myStmt.setString(1, theDepartment);
			myStmt.setDouble(2, theIncreaseAmount);
			
			//call stored procedure
			System.out.println("\n\nCalling stored procedure. increase_salaries_for_department('"+ theDepartment + "', )");
			myStmt.execute();
			System.out.println("Finished calling stored procedure");
			
			
			//Showing salary After
			System.out.println("Salaries Before\n");
//			showSalaries(myconn, theDepartment);
			
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void showSalaries(Connection myconn, String theDepartment) {
		try {
			while(((ResultSet) myconn).next()) {
				System.out.println(((ResultSet) myconn).getString("last_name")+ ", "+ ((ResultSet) myconn).getString("first_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

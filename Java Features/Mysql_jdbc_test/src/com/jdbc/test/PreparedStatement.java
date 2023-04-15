package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.Statement;


public class PreparedStatement {

	public static void main(String[] args) {

		Connection myconn = null;
//		Statement myStmt = null; //yaha pr satement na ho ke prepared statement hota hai
		java.sql.PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		try {
			//1.Get the connection to database
			myconn = DriverManager.getConnection("jdbc:mysql://localhost:2000/demo", "student", "Sumit@123");
			System.out.println("Connection established");
			
			//2. Prepared Statement
			myStmt = myconn.prepareStatement("select * from employees where salary > ? and department=? ");
			
			//3. Set the parameters
			myStmt.setDouble(1, 8000);
			myStmt.setString(2, "Legal");
			
			//4. Execute Sql query
			myRs = myStmt.executeQuery();
			
			//5. Display the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name")+ ", "+ myRs.getString("first_name"));
			}
			
//			reuse the Prepared Statement : salary> 25000 , department = "HR"
			
			
			System.out.println("\n\nReuse the Prepared Statement : salary> 25000 , department = HR");
			//6. Set the parameters
			myStmt.setDouble(1, 25000);
			myStmt.setString(2, "HR");
			
			//7. Execute Sql query
			myRs = myStmt.executeQuery();
			
			//8. Display the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name")+ ", "+ myRs.getString("first_name"));
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

}

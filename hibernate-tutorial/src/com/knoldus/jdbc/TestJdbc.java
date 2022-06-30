package com.knoldus.jdbc;

import java.sql.*;

import com.sun.jdi.connect.spi.Connection;

public class TestJdbc {


	public static void main(String[] args) {
		
         String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		
		 String user= "hbstudent";
		
		 String pass= "hbstudent";
		
		
		
		try {
			
			System.out.println("Connecting to database: "+ jdbcUrl);
			

			java.sql.Connection  myConn = 
						
					   DriverManager.getConnection(jdbcUrl, user, pass);
			
		                    
			  System.out.println("Connection successful!!1");

			
		}
         
		
		catch(Exception exc) {
			
			exc.printStackTrace();
			
			
		}
	}
}




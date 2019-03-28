package com.capgemini.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args)  {
		
		String dburl="jdbc:mysql://localhost:3306/bankappdb";
		String username="root";
		String password="root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection connection;
			try {
				connection = DriverManager.getConnection(dburl,username,password);
				if(connection!=null)
				{
					System.out.println("Connected ");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Failed to connect");
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to load Driver class. Make sure that .class file is available");
			e.printStackTrace();
		}
		
		
	}
}

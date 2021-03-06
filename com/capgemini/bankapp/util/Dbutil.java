package com.capgemini.bankapp.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Dbutil {

	private static String dburl;
	private static String username;
	private static String password;
	

	static Connection connection;
	static final Logger logger=Logger.getLogger(Dbutil.class);

	public static Connection getConnection()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if(connection==null)
			{
			connection=DriverManager.getConnection(dburl, username, password);
			
			//connection setautocommit.....
			connection.setAutoCommit(false);
			
			}
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("Driver class not found");
			e1.printStackTrace();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void commit()
	{
		try
		{
			if(connection!=null)
				connection.commit();
		}catch(SQLException e)
		{
			logger.error("SQLException " ,e);
		}
		
	}
	

	public static void rollback()
	{
		try
		{
			if(connection!=null)
				connection.rollback();
		}catch(SQLException e)
		{
			logger.error("SQLException " ,e);
		}
		
	}
	
	static
	{
		try {
		File file=new File("dbConfig.properties");
		FileReader fileReader=new FileReader(file);

		Properties p=new Properties();
		//System.out.println(p.size());
		p.load(fileReader);
		//System.out.println(p.size());
		fileReader.close();
		
		dburl=p.getProperty("dburl");
		username=p.getProperty("username");
		password=p.getProperty("password");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

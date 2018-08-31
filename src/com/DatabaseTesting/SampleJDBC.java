package com.DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleJDBC
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String url = "jdbc:postgresql://localhost:5432/Sree";
		String username = "postgres";
		String password = "admin";
		String query = "select * categories";
		
		Class.forName("org.postgresql.Driver");
		System.out.println("Connecting to Database....");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) 
		{
			String name = rs.getString(1);
			System.out.println(name);

		}
		con.close();

	}

}

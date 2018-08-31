package com.mysql.databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sample {

	public static void main(String[] args) {
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sree";
		String username = "root";
		String password = "123456";
		String Query = "select * from employee";

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(Query);
			while (rs.next())
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
			con.close();
		} catch (Exception e) {
			System.out.println("Catch block Executing..!!");
			System.out.println("\n");
			System.out.println("EXCEPTION MESSAGE: "+e.getMessage());
			System.out.println("\n");
			System.out.println("Catch block Executed..!!");
		}
	}
}

package com.dbeg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTable {
	public static void main(String arg[]) {
		Connection connection = null;
		try {
			//Database Connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sept2", "root", "pass@word1");

			int nrecs = 0;
			PreparedStatement ps = connection.prepareStatement("update  messages set ptype=? where ptype=?");

			// Updating External to E

			ps.setString(1, "E");
			ps.setString(2, "External");

			nrecs = ps.executeUpdate();

			System.out.println("Updated " + nrecs + " records successfully");

			// Updating Internal to I

			ps.setString(1, "I");
			ps.setString(2, "Internal");

			nrecs = ps.executeUpdate();

			System.out.println("Updated " + nrecs + " records successfully");

			ps.close();
			connection.close();
		} catch (Exception exception) {
			System.out.println(exception);
		}
	} 

}

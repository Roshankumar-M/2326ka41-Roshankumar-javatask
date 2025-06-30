package codejava;

import java.sql.*;

public class MYSQLconnect {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root",
					"bhava123");

			System.out.println("Connection successful!");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
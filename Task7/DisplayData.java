package codejava;

import java.sql.*;

public class DisplayData {

	static final String URL = "jdbc:mysql://localhost:3306/studentdb";
	static final String USER = "root";
	static final String PASSWORD = "bhava123";

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.println("Connected to studentdb!");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM students");
			System.out.println("Student Records:");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getInt("age"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

package codejava;

import java.sql.*;

public class StudentDB {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/inventory_db";
		String user = "root";
		String password = "bhava123";

		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			String insertSQL = "INSERT INTO students (name, grade) VALUES (?, ?)";
			try (PreparedStatement stmt = conn.prepareStatement(insertSQL)) {
				stmt.setString(1, "Alice");
				stmt.setInt(2, 90);
				stmt.executeUpdate();
				System.out.println("Student inserted.");
			}

			String querySQL = "SELECT * FROM students";
			try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(querySQL)) {
				while (rs.next()) {
					System.out.println(
							rs.getInt("id") + " - " + rs.getString("name") + " - Grade: " + rs.getInt("grade"));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
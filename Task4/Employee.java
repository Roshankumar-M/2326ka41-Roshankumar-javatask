package codejava;

import java.io.*;
import java.util.*;

public class Employee {
	static final String FILE = "employees.txt";

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n1. Add Employee");
			System.out.println("2. View Employees");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Exit");
			System.out.print("Choose option: ");
			choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
			case 1 -> add(sc);
			case 2 -> view();
			case 3 -> update(sc);
			case 4 -> delete(sc);
			case 5 -> System.out.println("Exiting...");
			default -> System.out.println("Invalid option.");
			}
		} while (choice != 5);
	}

	// 1. Add employee
	static void add(Scanner sc) throws IOException {
		FileWriter fw = new FileWriter(FILE, true);
		System.out.print("ID: ");
		String id = sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Dept: ");
		String dept = sc.nextLine();
		System.out.print("Salary: ");
		String salary = sc.nextLine();

		fw.write(id + " " + name + " " + dept + " " + salary + "\n");
		fw.close();
		System.out.println("Added successfully.");
	}

	// 2. View employees
	static void view() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(FILE));
		String line;
		System.out.println("\nID Name Dept Salary");
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

	// 3. Update employee
	static void update(Scanner sc) throws IOException {
		File input = new File(FILE);
		File temp = new File("temp.txt");

		BufferedReader br = new BufferedReader(new FileReader(input));
		BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

		System.out.print("Enter ID to update: ");
		String id = sc.nextLine();
		String line;
		boolean found = false;

		while ((line = br.readLine()) != null) {
			String[] parts = line.split(" ");
			if (parts[0].equals(id)) {
				System.out.print("New Name: ");
				String name = sc.nextLine();
				System.out.print("New Dept: ");
				String dept = sc.nextLine();
				System.out.print("New Salary: ");
				String salary = sc.nextLine();
				bw.write(id + " " + name + " " + dept + " " + salary + "\n");
				found = true;
			} else {
				bw.write(line + "\n");
			}
		}

		br.close();
		bw.close();
		input.delete();
		temp.renameTo(input);

		if (found)
			System.out.println("Updated.");
		else
			System.out.println("ID not found.");
	}

	// 4. Delete employee
	static void delete(Scanner sc) throws IOException {
		File input = new File(FILE);
		File temp = new File("temp.txt");

		BufferedReader br = new BufferedReader(new FileReader(input));
		BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

		System.out.print("Enter ID to delete: ");
		String id = sc.nextLine();
		String line;
		boolean deleted = false;

		while ((line = br.readLine()) != null) {
			String[] parts = line.split(" ");
			if (!parts[0].equals(id)) {
				bw.write(line + "\n");
			} else {
				deleted = true;
			}
		}

		br.close();
		bw.close();
		input.delete();
		temp.renameTo(input);

		if (deleted)
			System.out.println("Deleted.");
		else
			System.out.println("ID not found.");
	}
}

package codejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CourseEnrollment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> students = new ArrayList<>();
		HashMap<String, ArrayList<String>> enrollments = new HashMap<>();

		int choice;

		do {
			System.out.println("\n--- Student Course Enrollment System ---");
			System.out.println("1. Add Student");
			System.out.println("2. Enroll Course for Student");
			System.out.println("3. Remove Student");
			System.out.println("4. Display All Students & Courses");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter student name to add: ");
				String student = sc.nextLine();
				if (!students.contains(student)) {
					students.add(student);
					enrollments.put(student, new ArrayList<>());
					System.out.println("Student added.");
				} else {
					System.out.println("Student already exists.");
				}
				break;

			case 2:
				System.out.print("Enter student name: ");
				String sName = sc.nextLine();
				if (students.contains(sName)) {
					System.out.print("Enter course to enroll: ");
					String course = sc.nextLine();
					enrollments.get(sName).add(course);
					System.out.println("Course enrolled.");
				} else {
					System.out.println("Student not found.");
				}
				break;

			case 3:
				System.out.print("Enter student name to remove: ");
				String removeName = sc.nextLine();
				if (students.remove(removeName)) {
					enrollments.remove(removeName);
					System.out.println("Student removed.");
				} else {
					System.out.println("Student not found.");
				}
				break;

			case 4:
				System.out.println("\n--- Student Enrollments ---");
				Iterator<String> stuIt = students.iterator();
				while (stuIt.hasNext()) {
					String name = stuIt.next();
					System.out.println("Student: " + name);
					ArrayList<String> courses = enrollments.get(name);
					Iterator<String> courseIt = courses.iterator();
					while (courseIt.hasNext()) {
						System.out.println("  - " + courseIt.next());
					}
				}
				break;

			case 5:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 5);

		sc.close();
	}

}

package codejava;

import java.util.HashMap;
import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		HashMap<String, Integer> studentMarks = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		sc.nextLine(); 
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter name of student " + i + ": ");
			String name = sc.nextLine();

			System.out.print("Enter marks for " + name + ": ");
			int marks = sc.nextInt();
			sc.nextLine(); 

			studentMarks.put(name, marks);
		}
		System.out.println("\nStudent Marks:");
		int total = 0;
		for (String name : studentMarks.keySet()) {
			int marks = studentMarks.get(name);
			System.out.println(name + " : " + marks);
			total += marks;
		}
		double average = (double) total / studentMarks.size();
		System.out.println("\nAverage Marks: " + average);

		sc.close();
	}

}

package codejava;

import java.util.Scanner;

public class MarkValidation {
	public static void calculateGrade(double average) {
		System.out.print("Grade: ");
		if (average >= 90) {
			System.out.println("A");
		} else if (average >= 75) {
			System.out.println("B");
		} else if (average >= 60) {
			System.out.println("C");
		} else if (average >= 50) {
			System.out.println("D");
		} else {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int marks;

		// Get marks for 5 subjects
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter marks for subject " + i + ": ");
			marks = sc.nextInt();
			total += marks;
		}

		double average = total / 5.0;

		System.out.println("\nTotal Marks: " + total);
		System.out.println("Average: " + average);

		// invoking method
		calculateGrade(average);

		sc.close();
	}
}

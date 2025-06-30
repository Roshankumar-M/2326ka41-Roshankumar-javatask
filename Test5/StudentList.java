package codejava;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {
	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<>();
        students.add("Ishu");
		students.add("Arjun");
		students.add("Charlie");
		students.add("Deiveek");
		Iterator<String> it = students.iterator();
        System.out.println("List of Students:");
		while (it.hasNext()) {
			String student = it.next();
			System.out.println("- " + student);
		}
	}
}

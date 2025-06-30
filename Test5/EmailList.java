package codejava;

import java.util.HashSet;

public class EmailList {
	public static void main(String[] args) {
		HashSet<String> emails = new HashSet<>();
		emails.add("Dharani@example.com");
		emails.add("Deiveek@example.com");
		emails.add("charlie@example.com");
		emails.add("Dharani@example.com");
		System.out.println("Unique Email Addresses:");
		for (String email : emails) {
			System.out.println("- " + email);
		}
	}
}

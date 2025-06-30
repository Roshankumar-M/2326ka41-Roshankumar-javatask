package codejava;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {

		// get number of contacts to be added

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of contacts: ");
		int n = scn.nextInt();
		scn.nextLine(); // consume newline

		// Define arrays to store contact information

		String[] names = new String[n];
		String[] phoneNumbers = new String[n];
		String[] Email = new String[n];
		String[] city = new String[n];
		int index = 0;

		while (true) {
			System.out.println("======= Address Book ======");
			System.out.println("Options:");
			System.out.println("1) Add contact");
			System.out.println("2) Display all contacts");
			System.out.println("3) Search by name");
			System.out.println("4) Exit");
			System.out.print("Enter your choice: ");
			int choice = scn.nextInt();
			scn.nextLine(); // consume newline

			switch (choice) {
			// Add contact
			case 1:
				if (index < n) {
					System.out.print("Enter the name: ");
					names[index] = scn.nextLine();

					System.out.print("Enter phone number: ");
					phoneNumbers[index] = scn.nextLine();

					System.out.println("Enter email address:");
					Email[index] = scn.nextLine();

					System.out.print("Enter city: ");
					city[index] = scn.nextLine();

					System.out.println("Contact Added Successfully.\n");
					index++;
				} else {
					System.out.println("Address Book is full.\n");
				}
				break;

			// Display contact

			case 2:
				System.out.println("\nAll Contacts:");
				for (int i = 0; i < index; i++) {
					System.out.println("Contact " + (i + 1));
					System.out.println("Name: " + names[i]);
					System.out.println("Phone Number: " + phoneNumbers[i]);
					System.out.println("Email address: " + Email[i]);
					System.out.println("City: " + city[i] + "\n");
				}
				break;

			// search contact by name

			case 3:
				System.out.print("Enter the name to search: ");
				String searchName = scn.nextLine();
				boolean found = false;
				for (int i = 0; i < index; i++) {
					if (names[i].equals(searchName))
					// equlsIgnoreCase is used to avoid case-sensitive errors
					{
						System.out.println("Contact Found:");
						System.out.println("Name: " + names[i]);
						System.out.println("Phone Number: " + phoneNumbers[i]);
						System.out.println("Email address: " + Email[i]);
						System.out.println("City: " + city[i] + "\n");
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("Contact not found.\n");
				}
				break;

			case 4:
				System.out.println("Exiting Address Book!");
				scn.close();
				// System.exit(0);
				return;

			default:
				System.out.println("Invalid choice. Try again.\n");

			}
		}
	}
}
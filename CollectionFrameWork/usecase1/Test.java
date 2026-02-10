package com.usecase1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		ContactBook book = new ContactBook();
		int choice;

		while (true) {

			System.out.println("\n******* Contact Book *************");
			System.out.println("1. Add Contact");
			System.out.println("2. Search Contact");
			System.out.println("3. Update Contact");
			System.out.println("4. Remove Contact");
			System.out.println("5. Show Contacts");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");

			choice = obj.nextInt();
			obj.nextLine(); // consume newline

			switch (choice) {

			case 1:
				System.out.print("Enter Email: ");
				String email = obj.nextLine();

				System.out.print("Enter Name: ");
				String name = obj.nextLine();

				System.out.print("Enter Phone: ");
				String phone = obj.nextLine();

				book.addContact(new Contact(email, name, phone));
				break;

			case 2:
				System.out.print("Enter phone to search: ");
				book.searchContact(obj.nextLine());
				break;

			case 3:
				System.out.print("Enter phone to update: ");
				String upPhone = obj.nextLine();

				System.out.print("New Email: ");
				String upEmail = obj.nextLine();

				System.out.print("New Name: ");
				String upName = obj.nextLine();

				book.updateContact(new Contact(upEmail, upName, upPhone));
				break;

			case 4:
				System.out.print("Enter phone to remove: ");
				book.removeContact(obj.nextLine());
				break;

			case 5:
				book.showContacts();
				break;

			case 6:
				System.out.println("Exiting...");
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}

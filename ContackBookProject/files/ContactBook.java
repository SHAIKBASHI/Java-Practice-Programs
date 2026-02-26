package com.usecase1;

import java.util.ArrayList;

public class ContactBook {

	ArrayList<Contact> contacts;

	public ContactBook() {
		contacts = new ArrayList<>();
	}

	public void addContact(Contact contact) {
		contacts.add(contact);
		System.out.println("Contact Added Successfully");
	}

	public void removeContact(String phone) {

		for (Contact c : contacts) {
			if (c.getPhone().equals(phone)) {
				contacts.remove(c);
				System.out.println("Contact Removed");
				return;
			}
		}
		System.out.println("Contact Not Found");
	}

	public void searchContact(String phone) {

		for (Contact c : contacts) {
			if (c.getPhone().equals(phone)) {
				System.out.println(c);
				return;
			}
		}
		System.out.println("Contact Not Found");
	}

	public void updateContact(Contact contact) {

		for (Contact c : contacts) {
			if (c.getPhone().equals(contact.getPhone())) {

				c.setEmail(contact.getEmail());
				c.setName(contact.getName());

				System.out.println("Contact Updated");
				return;
			}
		}
		System.out.println("Contact Not Found");
	}

	public void showContacts() {

		if (contacts.isEmpty()) {
			System.out.println("No Contacts Available");
			return;
		}

		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}
}

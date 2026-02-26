package com.usecase2;

import java.util.Collection;
import java.util.HashMap;

public class ContactBook {

	HashMap<String, Contact> contacts;

	public ContactBook() {
		contacts = new HashMap<String,Contact>();
	}

	public void addContact(Contact contact) {
		if(contacts.containsKey(contact.getPhone())) {
			System.out.println("Contact already exist");
		}
		else {
			if(!contact.getEmail().contains("@")) {
				System.out.println("Invalid Email");
				
			}else if(!(contact.getPhone().length()==10)) {
				System.out.println("Invalid Mobile Number");
			}else if(contact.getName().equals("")|| contact.getName()==null) {
				System.out.println("Invalid name");
			}else {
		contacts.put(contact.getPhone(),contact);
		System.out.println("Contact Added Successfully");
		}
		}
	}

	public void removeContact(String phone) {
		if(phone.length()==10) {

		if(contacts.containsKey(phone)) {
			contacts.remove(phone);
			System.out.println("Contact deleted Successfully");
		}
		else {
			System.out.println("Contact Not Found");
			}
		}
		else {
			System.out.println("Invalid mobile number");
			}
	}

	public void searchContact(String phone) {
		if(phone.length()==10) {
			if(contacts.containsKey(phone)) {
				Contact contact = contacts.get(phone);
			}
			else {
				System.out.println("Contact Not Found");
				}
			
		}
		else {
			System.out.println("Invalid Contact Number");
		}

		
			
	}

	public void updateContact(Contact contact) {
		

		if(contacts.containsKey(contact.getPhone())) {
			contacts.replace(contact.getPhone(),contact);
			System.out.println("Contact updated sucefully");
			
		}
		else {
		
		System.out.println("Contact not exist");
		}
		
			
	}

	public void showContacts() {
      
		
		for (Contact contact : contacts.values()) {
			System.out.println(contact);
		}
	}

	public void showPhonenumbers() {
		
		for (String Phone : contacts.keySet()) {
			System.out.println(Phone);
		}
		
		
	}
}

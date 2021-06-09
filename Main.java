package com.addressBook;

import java.util.Scanner;

public class Main {
	static int numberOfContacts;
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of contacts:");
		numberOfContacts = scanner.nextInt();
		
		AddressBook book = new AddressBook();
		for(int i = 1; i<=numberOfContacts; i++) {
		book.addContact();
		}
		System.out.println(book.editDetails());
		System.out.println(book.deleteContact());
	}

}

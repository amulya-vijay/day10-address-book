package com.addressBook;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		AddressBook book = new AddressBook();
		
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter first Name");
		String fName = sc.nextLine();
		System.out.println("Enter last name");
		String lName = sc.nextLine();
		System.out.println("Enter area:");
		String area =sc.nextLine();
		System.out.println("Enter City:");
		String city = sc.nextLine();
		System.out.println("Enter state:");
		String state= sc.nextLine();
		System.out.println("Enter zip code");
		int zip = sc.nextInt();
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter Mobile number");
		long phoneNum = sc.nextLong();
		
		Address contact1 = new Address(area,city,state,zip);
		book.addContact(fName, lName,contact1, phoneNum, email);
		book.getContact();
		
	}

}

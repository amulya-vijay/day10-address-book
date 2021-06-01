package com.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
interface ContactDetails{
	public void addContact(String firstName, String lastName, Address address, long phoneNum, String email);

	void addContact();
}
public class AddressBook implements ContactDetails{
	
	static int numOfContacts =0;
	static  List<ContactInfo> contactsList = new ArrayList<ContactInfo>();
	 
	 Scanner sc =  new Scanner(System.in);
	
	@Override
	public void addContact() {
	
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
		ContactInfo contactInfo =  new ContactInfo(fName, lName,contact1, phoneNum, email);
		contactsList.add(contactInfo);
		numOfContacts++;
		getContact();
	}
	
	public String editDetails() {
		
		String inputName;
		System.out.println("Enter first name:");
		inputName = sc.nextLine();
		String area = null;
		String city = null;
		String state = null;
		int zip = 0;
		Address newAddress = new Address(area,city,state,zip);
		if(inputName.equals(contactsList.get(0).getFirstName())) {
			
			System.out.println("Enter FirstName");
			contactsList.get(0).setFirstName(sc.next());
			System.out.println("Enter LastName");
			contactsList.get(0).setLastName(sc.next());
			System.out.println("Enter Area");
			newAddress.setArea(sc.next());
			System.out.println("Enter City");
			newAddress.setCity(sc.next());
			System.out.println("Enter State");
			newAddress.setState(sc.next());
			System.out.println("Enter zip");
			newAddress.setZip(sc.nextInt());
			System.out.println("Enter PhoneNumber"); 
			contactsList.get(0).setPhoneNum(sc.nextInt());
			System.out.println("Enter Email");
			contactsList.get(0).setEmail(sc.next());
			
			System.out.println(contactsList.get(0));
			return "Edited";
		}else {
			
			return "No contact found in the book.";
		}
		
	}
	
	public void getContact() {
		for(int i=0;i<numOfContacts;i++) {
			ContactInfo cInfo = contactsList.get(i);
			System.out.println(cInfo);
		}
	}


	@Override
	public void addContact(String firstName, String lastName, Address address, long phoneNum, String email) {
		// TODO Auto-generated method stub
		
	}

}

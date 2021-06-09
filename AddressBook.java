package com.addressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
interface ContactDetails{
	
	void addContact();
}
public class AddressBook implements ContactDetails{
	
	static int numOfContacts = Main.numberOfContacts;
	static List<ContactInfo> contactsList = new ArrayList<ContactInfo>();
	static List<Address> addressInfo = new ArrayList<Address>();
	static Map<ContactInfo,Address> completeDetails = new HashMap<ContactInfo, Address>();
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
		addressInfo.add(contact1);
		completeDetails.put(contactInfo,contact1);
		System.out.println(completeDetails);
		//getContact();
	}
	
	@SuppressWarnings("unused")
	public String editDetails() {
		sc.nextLine();
		String inputName;
		System.out.println("Enter First name:");
		inputName = sc.nextLine();
		for(int i=1; i<=numOfContacts;i++) {
		if(inputName.equals(contactsList.get(i).getFirstName())) {
			System.out.println("Enter new data:");
			System.out.println("Enter FirstName");
			contactsList.get(i).setFirstName(sc.next());
			System.out.println("Enter LastName");
			contactsList.get(i).setLastName(sc.next());
			System.out.println("Enter Area");
			addressInfo.get(i).setArea(sc.next());
			System.out.println("Enter City");
			addressInfo.get(i).setCity(sc.next());
			System.out.println("Enter State");
			addressInfo.get(i).setState(sc.next());
			System.out.println("Enter zip");
			addressInfo.get(i).setZip(sc.nextInt());
			System.out.println("Enter PhoneNumber"); 
			contactsList.get(i).setPhoneNum(sc.nextLong());
			System.out.println("Enter Email");
			contactsList.get(i).setEmail(sc.next());
			System.out.println(contactsList.get(i));
			System.out.println(addressInfo.get(i));
			
			return "Edited";
		}else {
			
			return "No contact found in the book.";
		}
		}
		return null;
		
	}
	
	public String deleteContact() {
		sc.nextLine();
		String ipName1;
		String ipName2;
		System.out.println("Enter first name:");
		ipName1 = sc.nextLine();
		System.out.println("Enter last name:");
		ipName2 = sc.nextLine();
		if(ipName1.equals(contactsList.get(0).getFirstName()) && ipName2.equals(contactsList.get(0).getLastName())) {
			contactsList.remove(0);
			return "Contact Deleted!";
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






}

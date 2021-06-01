package com.addressBook;

import java.util.ArrayList;
import java.util.List;
interface ContactDetails{
	public void addContact(String firstName, String lastName, Address address, long phoneNum, String email);
}
public class AddressBook implements ContactDetails{
	
	static int numOfContacts =0;
	 List<ContactInfo> contactsList;
	
	public AddressBook() {
		contactsList = new ArrayList<ContactInfo>();	
	}
	
	@Override
	public void addContact(String firstName, String lastName, Address address, long phoneNum, String email) {
		
		ContactInfo contactInfo =  new ContactInfo(firstName, lastName, address, phoneNum, email);
		contactsList.add(contactInfo);
		numOfContacts++;
		System.out.println(contactsList);
	}
	
	public void getContact() {
		for(int i=0;i<numOfContacts;i++) {
			ContactInfo cInfo = contactsList.get(i);
			System.out.println(cInfo);
		}
	}

}

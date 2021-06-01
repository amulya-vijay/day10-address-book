package com.addressBook;

public class ContactInfo {
	
		private String firstName;
		private String lastName;
		private int phoneNum;
		private String email;
		private String city;
		private String state;
		private int zip;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
	
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	
		public int getPhoneNum() {
			return phoneNum;
		}
		public void setPhoneNum(int phoneNum) {
			this.phoneNum = phoneNum;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
	
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
	
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		
		@Override
		public String toString() {
			return "ContactDetails--> \n firstName=" + firstName + "\n lastName=" + lastName + "\n phoneNumber=" + phoneNum
					+ "\n email=" + email + "\n city=" + city + "\n state=" + state + "\n zip=" + zip + "\n";
		}
	

}

package com.addressBook;

public class ContactInfo {
	
		private String firstName;
		private String lastName;
		private Address address;
		private long phoneNum;
		private String email;
		private String area;
		String city;
		String state;
		int zip;
		
		public ContactInfo(String firstName2, String lastName2, Address address2, long phoneNum2, String email2) {
			this.firstName =firstName2;
			this.lastName = lastName2;
			this.address = address2;
			this.phoneNum=phoneNum2;
			this.email = email2;
			// TODO Auto-generated constructor stub
		}
	
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
	
		public long getPhoneNum() {
			return phoneNum;
		}
		public void setPhoneNum(long phoneNum) {
			this.phoneNum = phoneNum;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
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
					+ "\n email=" + email +"\n";// "\n area=" + area+"\n city=" + city + "\n state=" + state + "\n zip=" + zip + "\n";
		}
	
}	

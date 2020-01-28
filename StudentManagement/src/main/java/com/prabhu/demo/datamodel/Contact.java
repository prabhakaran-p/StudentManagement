package com.prabhu.demo.datamodel;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {
	 private String addressLine1 ;
	    private String addressLine2 ;	   
	    private String city ;
	    private String distirct ;
	    private String state ;
	    private String country ;
	    private String zipCode ;
	    private String emergencyContact ;
	    private String emergencyPhone ;
	    private String phone1 ;
	    private String phone2 ;
	    private String mobilePhone1 ;
	    private String mobilePhone2 ;
	    private String email ;
		public String getAddressLine1() {
			return addressLine1;
		}
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		public String getAddressLine2() {
			return addressLine2;
		}
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDistirct() {
			return distirct;
		}
		public void setDistirct(String distirct) {
			this.distirct = distirct;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getZipCode() {
			return zipCode;
		}
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		public String getEmergencyContact() {
			return emergencyContact;
		}
		public void setEmergencyContact(String emergencyContact) {
			this.emergencyContact = emergencyContact;
		}
		public String getEmergencyPhone() {
			return emergencyPhone;
		}
		public void setEmergencyPhone(String emergencyPhone) {
			this.emergencyPhone = emergencyPhone;
		}
		public String getPhone1() {
			return phone1;
		}
		public void setPhone1(String phone1) {
			this.phone1 = phone1;
		}
		public String getPhone2() {
			return phone2;
		}
		public void setPhone2(String phone2) {
			this.phone2 = phone2;
		}
		public String getMobilePhone1() {
			return mobilePhone1;
		}
		public void setMobilePhone1(String mobilePhone1) {
			this.mobilePhone1 = mobilePhone1;
		}
		public String getMobilePhone2() {
			return mobilePhone2;
		}
		public void setMobilePhone2(String mobilePhone2) {
			this.mobilePhone2 = mobilePhone2;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	    
	    
}

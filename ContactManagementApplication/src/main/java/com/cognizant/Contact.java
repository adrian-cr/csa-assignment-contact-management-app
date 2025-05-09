package com.cognizant;

public class Contact {
  private static int counter = 1;
  private final int contactId;
  private String contactType;
  private String email;
  private String name;
  private String phoneNumber;
  
  public Contact(String contactType, String email, String name, String phoneNumber) {
    this.contactId = counter;
    this.contactType = contactType;
    this.email = email;
    this.name = name;
    this.phoneNumber = phoneNumber;
    counter++;
  }//Contact() - constructor
  
  /* Getters: */
  public int getContactId() {
    return contactId;
  }//getContactId()
  public String getContactType() {
    return contactType;
  }//getContactType()
  public String getEmail() {
    return email;
  }//getEmail()
  public String getName() {
    return name;
  }//getName()
  public String getPhoneNumber() {
    return phoneNumber;
  }//getPhoneNumber()
  
  /* Setters: */
  public void setContactType(String contactType) {
    this.contactType = contactType;
  }//setContactType()
  public void setEmail(String email) {
    if (email.matches("^(.+)@(\\S+)$")) this.email = email;
  }//setEmail()
  public void setName(String name) {
    this.name = name;
  }//setPhoneNumber()
  public void setPhoneNumber(String phoneNumber) {
    if (phoneNumber.matches("^\\d{8}$"))this.phoneNumber = phoneNumber;
  }//setPhoneNumber()
  
  @Override
  public String toString() {
    return "Contact{" +
            "contactId=" + contactId +
            ", contactType='" + contactType + '\'' +
            ", email='" + email + '\'' +
            ", name='" + name + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';
  }
}//Contact

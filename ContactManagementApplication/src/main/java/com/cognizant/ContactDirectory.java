package com.cognizant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ContactDirectory {
  private final List<Contact> contactList = new ArrayList<>();
  private final HashMap<String, Contact> contactDictionary = new HashMap<>();
  private final HashSet<String> contactTypes = new HashSet<>();
  
  public ContactDirectory() {
  }

  /* Getters: */
  public List<Contact> getContacts() {
    return contactList;
  }//getContactList()
  public HashMap<String, Contact> getContactDictionary() {
    return contactDictionary;
  }//getContactDictionary()
  public HashSet<String> getContactTypes() {
    return contactTypes;
  }//getContactTypes()
  
  /* Class methods: */
  public void addContact(Contact contact) {
    if (!contactDictionary.containsKey(contact.getName())) {
      contactList.add(contact);
      contactDictionary.put(contact.getName(), contact);
      contactTypes.add(contact.getContactType());
    }//if
  }//addContact()
  public void addContactType(String type) {
    contactTypes.add(type);
  }//addContactType()
  public Contact findByName(String name) {
    name = toTitleCase(name);
    if (contactDictionary.containsKey(name))
      return contactDictionary.get(name);
    return null;
  }//findByName()
  public List<Contact> getSortedContacts() {
    List<Contact> sortedContacts = new ArrayList<Contact>(contactList);
    sortedContacts.sort((Contact a, Contact b) -> {return a.getName().compareToIgnoreCase(b.getName());});
    return sortedContacts;
  }//getSortedContacts()
  public String toTitleCase(String str) {
    String[] strArr = str.split(" ");
    String[] newStrArr = new String[strArr.length];
    for (int i=0; i<strArr.length; i++) {
      String capStr = strArr[i].substring(0,1).toUpperCase() + strArr[i].substring(1);
      newStrArr[i] = capStr;
    }//for
    return String.join(" ", newStrArr);
  }//toTitleCase()
  public void updateByName(String name, String dataType, String data) {
    Contact contact = findByName(name);
    if (contact!=null) {
      switch (dataType) {
        case "name":
          contact.setName(data);
          break;
        case "email":
          contact.setEmail(data);
          break;
        case "phone":
          contact.setPhoneNumber(data);
          break;
        case "type":
          contact.setContactType(data);
          contactTypes.add(data);
          break;
      }//switch
    }//if
  }//updateByName()
  
  @Override
  public String toString() {
    return "ContactDirectory{" +
            "contactList=" + contactList +
            ", contactDictionary=" + contactDictionary +
            ", contactTypes=" + contactTypes +
            '}';
  }//toString()
}//ContactDirectory

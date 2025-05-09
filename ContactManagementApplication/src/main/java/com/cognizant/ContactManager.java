package com.cognizant;

public class ContactManager {
  
  public static void main(String[] args) {
    /* I. Add new contacts to the directory: */
    System.out.println("I. Add new contacts to the directory:\n".toUpperCase());
    
    ContactDirectory directory = new ContactDirectory();
    Contact contact1 = new Contact( "Business", "evan.lee@startup.io", "Evan Lee", "55578900");
    Contact contact2 = new Contact( "Personal", "alice.johnson@example.com", "Alice Johnson", "55512346");
    Contact contact3 = new Contact( "Personal", "dana.white@home.com", "Dana White", "55534569");
    Contact contact4 = new Contact( "Business", "bob.smith@company.com", "Bob Smith", "55556784");
    Contact contact5 = new Contact( "Business", "charlie.doe@example.org", "Charlie Doe", "55590121");
    
    
    
    directory.addContact(contact1);
    directory.addContact(contact2);
    directory.addContact(contact3);
    directory.addContact(contact4);
    directory.addContact(contact5);
    
    System.out.println("directory.getContactList() -->");
    for (Contact c : directory.getContacts())
      System.out.println(c.getName().toUpperCase() +
              "\nEmail: " + c.getEmail() +
              "\nPhone (" + c.getContactType().toLowerCase() + "): " + c.getPhoneNumber() + "\n");
    
    
    /* II. Register and display unique contact types: */
    System.out.println("II. Register and display unique contact types:".toUpperCase());
    
    System.out.println("\ndirectory.getContactTypes():");
    System.out.println("  --> " + directory.getContactTypes());
    
    directory.addContactType("Emergency");
    System.out.println("\ndirectory.addContactType(\"Emergency\"):");
    System.out.println("  --> " + directory.getContactTypes());
    
    directory.addContactType("Emergency");
    System.out.println("\ndirectory.addContactType(\"Emergency\"): //no duplicate should be generated");
    System.out.println("  --> " + directory.getContactTypes() + "\n\n");//no duplicate should be generated
    
    
    /* III. Search for a contact by name and display their details: */
    System.out.println("III. Search for a contact by name and display their details:".toUpperCase());
    
    System.out.println("\ndirectory.findByName(\"Bob Smith\"):");
    System.out.println("  --> " + directory.findByName("Bob Smith"));
    
    System.out.println("\ndirectory.findByName(\"John Doe\"): //should return null");
    System.out.println("  --> " + directory.findByName("John Doe") + "\n\n");
    
    
    /* IV. Update contact information and manage the contact list: */
    System.out.println("IV. Update contact information and manage the contact list:".toUpperCase() + "\n");
    System.out.println("directory.findByName(\"dana white\"):");
    System.out.println("  --> " + directory.findByName("dana white") + "\n");
    
    System.out.println("directory.updateByName(\"dana white\", \"phone\", \"00000000\");\n");
    directory.updateByName("dana white", "phone", "00000000");
    
    System.out.println("directory.findByName(\"dana white\"):");
    System.out.println("  --> " + directory.findByName("dana white") + "\n");
    
    
    /* V. Sort and display the list of contacts alphabetically: */
    System.out.println("V. Sort and display the list of contacts alphabetically:".toUpperCase());
    System.out.println("\nContact order in original list:");
    System.out.print("[");
    for (Contact c : directory.getContacts()) System.out.print(c.getName() + (directory.getContacts().indexOf(c)!=directory.getContacts().size()-1? ", " : ""));
    System.out.println("]\n");
    System.out.println("Contact order in sorted list:");
    System.out.print("[");
    for (Contact c : directory.getSortedContacts()) System.out.print(c.getName() + (directory.getSortedContacts().indexOf(c)!=directory.getSortedContacts().size()-1? ", " : ""));
    System.out.print("]\n");
  }
}
# Assignment: Contact Management App

The current project contains the necessary code
to run a contact management application where
personal and professional contacts can be stored,
accessed, and managed.

The program, which can be run from the project's
`ContactManager` class, allows users to add, update, and 
search for contacts using various classes and 
interfaces from Java's `Collections` framework.

Below are the features and funtionalities implemented:

## Classes and Collections
* A class `Contact` with attributes such as `contactId`, `name`, `phoneNumber`, `email`, and `contactType` (e.g., `"Personal"` or `"Professional"`).
* A class `ContactDirectory` to store and manage contacts, utilizing `List`, `Set`, and `Map` objects for different tasks.

## List Implementation
* An `ArrayList`object is used for storing all contacts.
* Methods to add, update, and display contacts are implemented.
* Functionality to sort the contact list by name is implemented.

## Set Implementation
* A `HashSet` object is used for maintaining a list of unique contact types (e.g., "Personal" or "Professional").
* Methods to add new contact types and display the list of unique types are implemented.

## Map Implementation
* A `HashMap` object is used for organizing contacts by `name`, where the key is the contact's `name` and the value is the `Contact` object.
* Methods to search for a contact by `name` and retrieve their details are implemented.
* Users can update contact information using a given `name`.

## Implementation
* The project is run through the main class `ContactManager` using a `main()` method.
* The code inside the `main()` methods demonstrates the program's ability to:
  1. Add new contacts to the directory.
  2. Register and display unique contact types.
  3. Search for a contact by `name` and display their details.
  4. Update contact information and manage the contact list.
  5. Sort and display the list of contacts alphabetically.
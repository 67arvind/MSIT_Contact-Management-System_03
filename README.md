Simple Contact Management System

Overview :-
This program allows users to store and manage contact information. Users can add new contacts, view the contact list, edit existing contacts, and delete contacts as needed. Contacts are stored in memory or in a file for persistent storage, ensuring data is always accessible.

Features
Add new contacts: Enter name, phone number, and email address.

View contact list: Display all stored contacts.

Edit contacts: Modify contact details.

Delete contacts: Remove contacts from the list.

How to Use
Add Contact: Enter the contact's name, phone number, and email address.

View Contacts: Display all contacts in the list.

Edit Contact: Select a contact to update their details.

Delete Contact: Remove a contact from the list.

Example
java

Contact contact = new Contact("John Doe", "123-456-7890", "john.doe@example.com");
contactManager.addContact(contact);
contactManager.viewContacts();
contactManager.editContact("John Doe", newContactDetails);
contactManager.deleteContact("John Doe");
Requirements
Java Development Kit (JDK)

An IDE or text editor (e.g., IntelliJ IDEA, Eclipse)

Compilation
To compile the program, use the following command:


Code :-

javac ContactManager.java
Execution
To run the program, use the following command:


Code :-

java ContactManager
Files
Contact.java: Class representing a contact.

ContactManager.java: Class managing the contact list.

Persistent Storage
Contacts can be stored in memory or written to a file for persistent storage. Ensure the file path is correctly set in the program to save and retrieve contacts from a file.


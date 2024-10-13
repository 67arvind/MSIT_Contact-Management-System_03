import java.util.ArrayList;
import java.util.Scanner;

// Define the Contact class
class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    // Constructor
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method to display contact details
    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}

// Main class for Contact Management System
public class ContactManagementSystem {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        // Menu loop
        while (!exit) {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add a new contact");
            System.out.println("2. View all contacts");
            System.out.println("3. Update an existing contact");
            System.out.println("4. Delete a contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to add a new contact
    private static void addContact() {
        System.out.println("\nEnter contact details:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        contacts.add(new Contact(name, phoneNumber, email));
        System.out.println("Contact added successfully.");
    }

    // Method to view all contacts
    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("\nNo contacts found.");
        } else {
            System.out.println("\n--- Contact List ---");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }

    // Method to update an existing contact
    private static void updateContact() {
        if (contacts.isEmpty()) {
            System.out.println("\nNo contacts to update.");
            return;
        }

        viewContacts();

        System.out.print("\nEnter the number of the contact to update: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline

        if (index >= 0 && index < contacts.size()) {
            System.out.println("Updating contact: " + contacts.get(index));
            System.out.print("New Name: ");
            String newName = scanner.nextLine();
            System.out.print("New Phone Number: ");
            String newPhoneNumber = scanner.nextLine();
            System.out.print("New Email: ");
            String newEmail = scanner.nextLine();

            contacts.get(index).setName(newName);
            contacts.get(index).setPhoneNumber(newPhoneNumber);
            contacts.get(index).setEmail(newEmail);

            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Invalid contact number.");
        }
    }

    // Method to delete a contact
    private static void deleteContact() {
        if (contacts.isEmpty()) {
            System.out.println("\nNo contacts to delete.");
            return;
        }

        viewContacts();

        System.out.print("\nEnter the number of the contact to delete: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline

        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Invalid contact number.");
        }
    }

    public static void setContacts(ArrayList<Contact> contacts) {
        ContactManagementSystem.contacts = contacts;
    }
}

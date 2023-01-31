package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    static ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    public static void main(String[] args) {
        System.out.println("=======Welcome to Mobile Phone Directory==========");
        Scanner scanner = new Scanner(System.in);
        String isContinue = "Y";
        do {
            displayInstructions();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    listAllContacts();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    getContactByName();
                    break;
                case 6:
                    displayInstructions();
                    break;
                default:
                    break;
            }
            System.out.println("Would you like to continue(Y/N) ?");
            isContinue = scanner.next();
        } while (isContinue.equalsIgnoreCase("Y"));
    }
    private static void addNewContact(){
        Contacts contact = new Contacts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        contact.setName(scanner.nextLine());
        System.out.println("Enter the phone number: ");
        contact.setPhoneNumber(scanner.nextLine());
        addContact(contact);
    }
    private static void addContact(Contacts contact) {
        if(findContact(contact.getName()) >= 0){
            System.out.println("Name already exists");
        }else{
            contactList.add(contact);
        }
    }
    private static void listAllContacts() {
        int count = 1;
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(count + ". " + contactList.get(i).getName() + " " + contactList.get(i).getPhoneNumber());
            count++;
        }
    }
    public static void removeContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        int position = findContact(name);
        if(position != 1){
            contactList.remove(position);
        }else{
            System.out.println("Contact does not exists");
        }
    }
    private static void modifyContact() {
        Contacts contact = new Contacts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name for which the phone number needs to be modified: ");
        String name = scanner.nextLine();
        contact.setName(name);
        System.out.println("Enter the new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        contact.setPhoneNumber(newPhoneNumber);
        int position = findContact(name);
        contactList.set(position, contact);
    }
    private static void getContactByName() {
        Contacts contact = new Contacts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        int position = findContact(name);
        System.out.println(contactList.get(position).getName());
        System.out.println(contactList.get(position).getPhoneNumber());
    }
    private static void displayInstructions() {
        System.out.println("Please select your choice: \n" +
                "1. Add Contact \n" +
                "2. List All Contacts \n" +
                "3. Remove Contact \n" +
                "4. Modify Contact \n" +
                "5. Retrieve Single Contact Details \n" +
                "6. Display Instructions \n"
        );
    }
    private static int findContact(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            Contacts contact = contactList.get(i);
            if (contact.getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
}



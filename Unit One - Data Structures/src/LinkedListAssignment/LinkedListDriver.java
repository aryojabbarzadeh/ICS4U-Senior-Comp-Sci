package LinkedListAssignment;

import java.util.Scanner;

public class LinkedListDriver {
    public static void main(String[] args) {
        Scanner ni = new Scanner (System.in);
        ContactLinkedList contacts = new ContactLinkedList();
        boolean ends = false;
        Scanner options = new Scanner (System.in);
        String yes = "Yes";
        while (!ends){

            
            System.out.println("To add a contact press 1");
            System.out.println("To display all contacts press 2");
            System.out.println("To display a specific contact press 3");
            System.out.println("To delete a contact press 4");
            int option = Integer.parseInt(options.nextLine());

            if (option == 1)
                newContact(contacts);

            else if (option == 2)
                ContactLinkedList.printList(contacts);

            else if (option == 3)
                searchContact(contacts);

            else if (option == 4)
                deleteContact(contacts);

            System.out.println();
            System.out.println("If you would like to use the menu again please type Yes , and if not please type No");
            String end = (ni.nextLine());
            if (end.equals(yes)){
                ends = false;
                System.out.println();
            }
            else{
                ends = true;
            }
        }
        ni.close();
        options.close();
    }
<<<<<<< HEAD
    /**
     * adds a contact
     * @param contacts
     */
    private static void newContact(ContactLinkedList contacts){ 
=======
    private static void newContact(ContactLinkedList contacts){ //adds a contact
>>>>>>> 5c173dbad9514d695e2b5e9f52e7929af0d4a338
        Scanner in = new Scanner (System.in);
        System.out.print("Please Enter the Last Name: ");
        String LastN = (in.nextLine());
        System.out.print("Please Enter the First Name: ");
        String FirstN = (in.nextLine());
        System.out.print("Please Enter the Phone Number: ");
        String pNumber = (in.nextLine());
        Contact f = new Contact(FirstN, LastN, pNumber); //puts the all the strings above into the contact
        contacts.add(f);
    } 
<<<<<<< HEAD
    /**
     * searches for a specific contact
     * @param contacts
     */
    private static void searchContact(ContactLinkedList contacts){ 
=======
    private static void searchContact(ContactLinkedList contacts){ //searches for a specific contact
>>>>>>> 5c173dbad9514d695e2b5e9f52e7929af0d4a338
        Scanner in = new Scanner (System.in); 
        System.out.print("Please Enter the Last Name of the Contact: ");
        String lName = (in.nextLine());
        contacts.search(lName);
    }
<<<<<<< HEAD
    /**
     * deletes a contact
     * @param contacts
     */
    private static void deleteContact(ContactLinkedList contacts){ 
=======
    private static void deleteContact(ContactLinkedList contacts){ //deletes a contact
>>>>>>> 5c173dbad9514d695e2b5e9f52e7929af0d4a338
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter the phone number of the contact you would like to delete: ");
        String num = (in.nextLine());
        contacts.remove(num);
    }
    }

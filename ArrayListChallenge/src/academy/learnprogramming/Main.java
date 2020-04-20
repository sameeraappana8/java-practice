package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

    public static void main(String[] args) {
    boolean quit = false;
    int choice =0;
    printMenu();
    while(!quit){
        System.out.println("Choose what you want to do from the menu:");
        choice = scan.nextInt();
        scan.nextLine();
        switch(choice){
            case 0:
                printMenu();
                break;
            case 1:
                contacts.displayContactsList();
                break;
            case 2:
                addContacts();
                break;
            case 3:
                modifyContacts();
                break;
            case 4:
                removeContacts();
                break;
            case 5:
                searchContacts();
                break;
            case 6:
                quit = true;
                break;
        }
    }

    }

    public static void printMenu(){
        System.out.println("\tEnter a choice:");
        System.out.println("\t - 0 for menu choices");
        System.out.println("\t - 1 for displaying your contacts");
        System.out.println("\t - 2 for adding new contacts");
        System.out.println("\t - 3 for editing existing contacts");
        System.out.println("\t - 4 for removing contacts");
        System.out.println("\t - 5 for searching contacts");
        System.out.println("\t - 6 quit application");
    }

    public static void addContacts(){
        System.out.println("Please enter a contact name to add:");
        contacts.addContactsList(scan.nextLine());
    }

    public static void modifyContacts(){
        System.out.println("Please enter a contact name which you want to edit:");
        String contactName = scan.nextLine();
        System.out.println("Please enter a new name:");
        String newName = scan.nextLine();
        contacts.modifyContactsList(newName,contactName);
    }

    public static void removeContacts(){
        System.out.println("Enter a contact name that you want to delete:");
        contacts.removeContactsList(scan.nextLine());
    }
    public static void searchContacts(){
        System.out.println("Enter a contact name to search:");
        String name = scan.nextLine();
        if(contacts.onFile(name)){
            System.out.println("Found " + name + " in our grocery list");
        }
        else{
            System.out.println(name + " not found in grocery list");
        }

    }
}

package academy.learnprogramming;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();

                case 7:
                    quit = true;
                    break;

            }
        }


    }

    public static void printInstructions(){
        System.out.println("\n Press");
        System.out.println("\t - 0 for print choice options");
        System.out.println("\t - 1 to print the grocery list items");
        System.out.println("\t - 2 to add a new item to your grocery list");
        System.out.println("\t - 3 to modify an item in your grocery list");
        System.out.println("\t - 4 to delete an item in your grocery list");
        System.out.println("\t - 5 to search for an item in your grocery list");
        System.out.println("\t - 6 to exit the application");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item:");
        groceryList.addGroceryItem(scan.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item name:");
        String itemName = scan.nextLine();
        System.out.println("Enter item name which you want to replace:");
        String newItem = scan.nextLine();
        groceryList.modifyGroceryItem(itemName, newItem);

    }

    public static void removeItem(){
        System.out.print("Enter item name:");
        String itemName = scan.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem(){
        System.out.println("Enter item to be searched for:");
        String searchItem = scan.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        }
        else{
            System.out.println(searchItem + " not found in grocery list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        //ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList()); //this is another way of doing it in one line.
        //String[] myArray = new String[groceryList.getGroceryList().size()];
        //myArray = groceryList.getGroceryList().toArray(myArray); // This method expects which variable we want the arraylist to put data to so we passed myarray in the brackets.

    }
}

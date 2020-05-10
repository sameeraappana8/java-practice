package academy.learnprogramming;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Cincinnati");
        addInOrder(placesToVisit, "New York");
        addInOrder(placesToVisit, "LA");
        addInOrder(placesToVisit, "San Francisco");
        addInOrder(placesToVisit, "Seattle");
        addInOrder(placesToVisit, "Florida");

        addInOrder(placesToVisit, "Chicago");
        addInOrder(placesToVisit, "DC");

        placesToVisit.remove(5);
        printList(placesToVisit);

        addInOrder(placesToVisit,"Las Vegas");
        printList(placesToVisit);

        addInOrder(placesToVisit,"Las Vegas");
        printList(placesToVisit);

        visit(placesToVisit);


    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
            while(i.hasNext())
            {
                System.out.println("Now visiting: " + i.next());
            }
            System.out.println("=====================");
        }


    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> i = linkedList.listIterator();
        while(i.hasNext()){
            int comparison = i.next().compareTo(newCity);
            if(comparison == 0){
                //both new city and city in the list are same. So don't add anything.
                System.out.println("The city is already visited");
                return false;
            }else if(comparison>0){
                //new city should come before the city in the list
                i.previous();
                i.add(newCity);
                return true;
            }else if(comparison<0) {
                //new city should come after the city in list so don't do anything for now. continue search
            }
        }
        i.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> citiesList = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("There are no cities in the list");
        }else{
            System.out.println("Now visiting " + citiesList.next());
            printMenu();
        }

        while(!quit){
            int action = scan.nextInt();
            scan.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(citiesList.hasNext()){
                        System.out.println(citiesList.next());
                    }else{
                        System.out.println("You are at the end of the list");
                    }
                    break;
                case 2:
                    if(citiesList.hasPrevious()){
                        System.out.println(citiesList.previous());
                    }else{
                        System.out.println("You are at the starting of the list");
                    }
                    break;
                case 3:
                    printMenu();
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available options:");
        System.out.println("0 - to exit\n" +
                "1 - to go to next city\n" +
                "2 - to go to previous city\n" +
                "3 - to print menu");
    }
    }


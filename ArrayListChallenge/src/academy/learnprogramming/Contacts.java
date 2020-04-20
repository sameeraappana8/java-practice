package academy.learnprogramming;

import java.util.ArrayList;

public class Contacts {

    private ArrayList<String> contactsList = new ArrayList<String>();

    public void displayContactsList(){
        System.out.println("You have " + contactsList.size() + " contacts");
        for(int i =0; i<contactsList.size(); i++){
            System.out.println(i+1 + ". " + contactsList.get(i));
        }
    }

    public void addContactsList(String newContactName){
        int position = findContact(newContactName);
        if (position>=0){
            System.out.println("This contact name already exists");
        }
        else{
            contactsList.add(newContactName);
        }

    }
    public void modifyContactsList(String newContactName, String contactName){
        int position = findContact(contactName);
        if (position>=0){
            modifyContactsList(position,newContactName);
        }
        else{
            System.out.println("Contact not found");
        }
    }

    private void modifyContactsList(int position, String newContactName){
        contactsList.set(position, newContactName);
        System.out.println("The contact " + position+1 + " has been modified");
    }

    public void removeContactsList(String contactName){
        int position = findContact(contactName);
        if(position>=0){
            removeContactsList(position);
        }
        else{
            System.out.println("Contact not found");
        }

    }

    private void removeContactsList(int position){
        contactsList.remove(position);
    }

    public int findContact(String contactName){
        return contactsList.indexOf(contactName);

    }

    public boolean onFile(String searchItem){
        int position = findContact(searchItem);
        if (position>=0){
            return true;
        }

        return false;
    }

}

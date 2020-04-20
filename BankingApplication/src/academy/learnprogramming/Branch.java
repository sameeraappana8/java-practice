package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    private String branchName;

    public String getBranchName() {
        return branchName;
    }

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    private static ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }


    public boolean createCustomer(String customerName, double firstTransaction){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, firstTransaction));
            return true;
        }
        return false;
    }

    public boolean anotherTransaction(String customerName, double transaction){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(transaction);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i =0; i<customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
            return null;

    }
}

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("JP Morgan & Chase");
        bank.addBranch("Calhoun Street");
        bank.addCustomer("Calhoun Street", "Sameera Appana", 800.00);
        bank.addCustomer("Calhoun Street", "Santhosh Sahini", 1200.00);
        bank.addBranch("Downtown Cincinnati");
        bank.addCustomer("Downtown Cincinnati", "Rishyak Chowdary",900.00);
        bank.addCustomerTransactions("Calhoun Street","Sameera Appana", 80.00);
        bank.addBranch("Calhoun Street");
        bank.listCustomers("Calhoun Street", false);

    }
}

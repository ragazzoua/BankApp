package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        if (bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.05);
        bank.addCustomer("Adelaide", "Percy", 220.55);

        bank.addBranch("Sidney");
        bank.addCustomer("Sidney", "Bob", 150.55);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.22);
        bank.addCustomerTransaction("Adelaide", "Mike", 44.22);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if (!bank.addCustomer("Melbourne", "Brian", 5.66)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Error Adelaide branch already exist");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 11.33)){
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Adelaide", "Tim", 12.22)){
            System.out.println("Customer Tim already exist");
        }
    }
}

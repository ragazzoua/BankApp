package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.05);
        bank.addCustomer("Adelaide", "Percy", 220.55);

        bank.addBranch("Sidney");
        bank.addCustomer("Sidney", "Bob", 150.55);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.22);
        bank.addCustomerTransaction("Adelaide", "Mike", 44.22);

        bank.listCustomers("Adelaide", true);
    }
}

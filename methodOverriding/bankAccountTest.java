package methodOverriding;

import classes.BankAccount;

public class bankAccountTest {
    public static void main(String[] args) {
        BankAccountPublic ba = new BankAccountPublic();
        ba.name = "Nikki";
        ba.balance = 10000;
        ba.accountNumber = 123456;

CheckingAccount ca = new CheckingAccount();
ca.balance = 10000;
ca.transfer(23);
ba.transfer(23);
ba.info();

    }
}

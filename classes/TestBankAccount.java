package classes;

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.type = "Debit";
        ba.accountNumber = 1234567;
        ba.balance = 1000000;
        ba.holderName = "Nikki";

        ba.deposit(1000);
        ba.transfer(2000);
        ba.info();


    }
}
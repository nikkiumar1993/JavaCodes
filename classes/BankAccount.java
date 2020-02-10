package classes;

public class BankAccount {
    String type;
    int accountNumber;
    double balance;
    String holderName;

    public void deposit(double depositamount){
        System.out.println(depositamount + " is deposited to your account");
        balance+= depositamount;
    }
    public void transfer(double transnum){
        System.out.println(transnum + " is transferred from your account");
        balance-=transnum;
    }
    public void info(){
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Type: " + type);
        System.out.println("Account Number: " + accountNumber);
    }
}

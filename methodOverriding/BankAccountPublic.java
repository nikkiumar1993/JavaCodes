package methodOverriding;

public class BankAccountPublic {
    public double balance;
    public int accountNumber;
    public String name;

    public void info(){
        System.out.println(this.balance + ": is the balance");
        System.out.println(this.accountNumber + ": is an account number");
        System.out.println(this.name + ": is the name on the account");

    }
    @Override
    public String toString() {
        String result = "Name: " + this.name + "\n Acc num: " + this.accountNumber + "\n balace: " + this.balance;
        return result;
    }

    public void transfer(double amount){
        System.out.println("Money is transferred" + amount);
        this.balance -= amount+(amount*.10);

    }
    public void deposit(double amount){
        this.balance+= amount;
        System.out.println("Deposit successful");


    }


}

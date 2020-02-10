package methodOverriding;

public class CheckingAccount extends BankAccountPublic{
    @Override
    public void transfer(double amount) {

        double total = amount + (amount*.05);
        if(this.balance>=total){
            System.out.println("Transfer success");
            this.balance-=total;
        }else{
            System.out.println("Not enough money. Transfer failed");
        }
    }
}

package methodOverriding;

public class SavingsAccount extends BankAccountPublic{
    public double interestIncome;

    @Override
    public void transfer(double amount) {

        balance-=amount+(amount*.2);
    }

    @Override
    public void info() {
        super.info();
        System.out.println(interestIncome + ": is interest income");
    }

    public void calculateAnnualInterestIncome(){
  this.interestIncome+= balance*.03;
    }


}

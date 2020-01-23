package polymorphism;

public class PaymentMethod implements MobileVarifiable{
    public void charge (double amount){
        System.out.println("Amount charged: "+ amount);
    }
    public void refund(double amount){
        System.out.println("Refund amount: " + amount);
    }

    @Override
    public boolean verify() {
        System.out.println("Please approve from Payment method");
        return true;
    }
}

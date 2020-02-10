package polymorphism;

public class CreditCard extends PaymentMethod{
    @Override
    public void charge(double amount) {
        System.out.println("Amount charging in Credit card Account: " + amount);
        System.out.println("Fee applied $13");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount refunded in Credit card Account: " + amount);
    }
}

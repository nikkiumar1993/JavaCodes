package polymorphism;

public class MoneyGram implements MobileVarifiable {
    @Override
    public boolean verify() {
        System.out.println("Money Garm is cancelling the transaction");
        return false;
    }
}

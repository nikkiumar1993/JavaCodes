package polymorphism;

import java.util.ArrayList;

public class VerifyTransactions {
    public static void main(String[] args) {
        MobileVarifiable mv1 = new ZelleTransfer();
        MobileVarifiable mv2 = new MoneyGram();
        MobileVarifiable mv3 = new CreditCard();

        ArrayList<MobileVarifiable> transactions = new ArrayList<>();
        transactions.add(mv1);
        transactions.add(mv2);
        transactions.add(mv3);
        for(MobileVarifiable m: transactions){
            if(m.verify()){
                System.out.println("Transaction Success!");
            }else{
                System.out.println("Transaction Failed!");
            }
        }
    }
}

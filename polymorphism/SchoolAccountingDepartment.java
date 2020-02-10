package polymorphism;

import java.util.ArrayList;

public class SchoolAccountingDepartment {
    public static void main(String[] args) {
        PaymentMethod pm1 = new BankAccount();
        PaymentMethod pm2 = new Paypal();
        PaymentMethod pm3 = new CreditCard();
        PaymentMethod pm4 = new Paypal();
        PaymentMethod pm5 = new BankAccount();
        MobileVarifiable mv = new Paypal();

        ArrayList<PaymentMethod> studentPayments = new ArrayList<>();
        studentPayments.add(pm1);
        studentPayments.add(pm2);
        studentPayments.add(pm3);
        studentPayments.add(pm4);
        studentPayments.add(pm5);

        for(PaymentMethod p : studentPayments){
            p.charge(500);
        }
    }
}

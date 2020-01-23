package classes;

public class DebitCard {
    long cardNumber;
    String name;
    String cardType;
    int pin;
    double balance;

    public void info() {
        System.out.println("Card Number " + cardNumber);
        System.out.println("Holders Name " + name);
        if (cardType == null) {
        } else {
            System.out.println("Card Type " + cardType);
        }

        System.out.println("Balance " + balance);
    }


     public DebitCard(long cardNumber, String name, double balance){
        if(String.valueOf(cardNumber).length()==16){
             this.cardNumber = cardNumber;
         }else{
            System.out.println("Invalid card number");
        }
         this.name = name;
         this.balance = balance;
     }
     public DebitCard(long cardNumber, String name, String cardType, int pin, double balance){
        this(cardNumber,name, balance);
        this.cardNumber = cardNumber;
        this.name = name;
        if(cardType.equalsIgnoreCase("Visa") || cardType.equalsIgnoreCase("Master Card")){
            this.cardType = cardType;
        }else{
            System.out.println("Invalid Card type");
        }
        String newPin = pin + "";
        if(newPin.length()==4){
            this.pin = pin;
        }else{
            System.out.println("Invalid pin length");
        }

     }
}

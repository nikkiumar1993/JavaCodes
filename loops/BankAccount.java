package loops;


import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int balance = 100;
        int transBal;
        int times = 3;
        while(balance > 0){
            System.out.println("Enter cost of item:");
          transBal = input.nextInt();
          if(transBal <= balance){
              times--;
              System.out.println("You spent $" + transBal + " so far");
              System.out.println("You may buy up to " + times);
              balance-=transBal;

          }else {
              System.out.println();

          }
        }

            System.out.println("");

    }
}


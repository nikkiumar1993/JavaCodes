package Project1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfCall;
        double bill=0.0;
        System.out.println("Enter number of calls:");
        numberOfCall = input.nextInt();

        // your code here. (DO NOT change existing code)
        //----------------------------------------------
        bill = 200;

        if(numberOfCall <= 100){
            System.out.println("Your bill is $" + bill);
        }else if(numberOfCall > 100 && numberOfCall<=150){
           double bill2 = 200 + ((numberOfCall-100)*.60);
            System.out.println("Your bill is $" + bill2);
        }else if(numberOfCall > 150 && numberOfCall<=200){
            double bill3 = 230 + ((numberOfCall-150)*.50);
            System.out.println("Your bill is $" + bill3);
        }else if(numberOfCall > 200){
            double bill4 = 255 + ((numberOfCall-200)*.40);
            System.out.println("Your bill is $" + bill4);
        }

    }
}

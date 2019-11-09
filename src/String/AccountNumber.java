package String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");
        String num = input.nextLine();
        String firstNumber = num.substring(0,1);
//        boolean invalid = !firstNumber.equals("5") || !firstNumber.equals("2");
//
//        if(invalid){
//            System.out.println("Invalid account number");
//        }else{
//            if (firstNumber.equals("5")) {
//                if(num.length() ==10)
//                System.out.println("Valid 5 account");
//            }else{
//                System.out.println("invalid 5 account");
//            }
//
//        }
//        if(firstNumber.equals("2")) {
//            if (num.length() == 7){
//                System.out.println("valid 2 account");
//            }else{
//                System.out.println("invalid 2 account");
//            }
//        }
        if(num.startsWith("2") && num.length()>7 || num.length()<7) {
            System.out.println("Invalid account number");
        }else if(num.startsWith("5") || num.length()!=10){
            System.out.println("Invalid account number");
        }else{
            System.out.println("Valid account");
        }

    }
}

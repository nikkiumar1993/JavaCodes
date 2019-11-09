package Project2;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();
        boolean valid = true;


        // Your code here
        //------------------------------------------------
          for(int i = 0; i<n1.length(); i++)
            if(n1.length()>=8){

                if(n1.charAt(i)>=65 && n1.charAt(i)<=90){


                }else{
                 valid =false;
                    System.out.println("Password should contain at least 1 uppercase number");

                }
                if(n1.charAt(i)>=97 && n1.charAt(i)<=122) {

                }else{
                    valid=false;
                    System.out.println("Password should contain at least 1 lowercase number");

                }
                if(n1.charAt(i)>=48 && n1.charAt(i)<=57){

                }else{
                    valid = false;
                    System.out.println("Password should contain at least 1 digit");
                }
                if(n1.charAt(i)>=33 && n1.charAt(i)<=47 || n1.charAt(i)>=58 && n1.charAt(i)<=64){

                }else{
                    valid = false;
                    System.out.println("Password should contain at least 1 of these special characters");

                }
                if(valid){
                 System.out.println("Your password is accepted");
                }
            }
        System.out.println("Password should contain minimum 8 characters");
        }

}



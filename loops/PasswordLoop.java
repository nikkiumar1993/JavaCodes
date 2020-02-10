package loops;

import java.util.Scanner;

public class PasswordLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = "secret478";
        for(int i = 1; ;i++) {
            System.out.println("Please enter your password");
            String UserPassword = input.nextLine();

            if(i ==3){
                System.out.println("Sorry your account is locked. Try after 5 hours");
                break;
            }



            if(UserPassword.equals(password)){
                System.out.println("Welcome to your profile");
                break;
            }
            }
        }


    }


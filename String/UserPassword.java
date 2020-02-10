package String;

import java.util.Scanner;

public class UserPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user = "test";
        String pass = "test123";

        System.out.println("Please enter your username");

        String userUsername = input.nextLine();


        if (user.equals(userUsername)){
            System.out.println("Enter your password");
            String userPassword = input.nextLine();
            if (pass.equals(userPassword)) {
                System.out.println("Welcome");
            }else{
                System.out.println("Invalid Password");
            }
        }else{
            System.out.println("Invalid username");
        }
    }

}
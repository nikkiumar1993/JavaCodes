package IfElseStatements;
import java.util.Scanner;
public class Cup {
    public static void main(String[] args) {
        int passCode = 3241;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a pass code");

        int num = input.nextInt();

        if(num == passCode) {
            System.out.println("Welcome to iPhone");
        }else if (num < 0) {
            System.out.println("No negative Number");
        }else if (num < 1000){
            System.out.println("You entered less digits");
        }else if (num > 9999) {
            System.out.println("You entered more digits");
        }
        else{
            System.out.println("Wrong pass code! Try again!");
        }
    }
}

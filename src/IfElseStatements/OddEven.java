package IfElseStatements;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5 integer number");

        int num = input.nextInt();

        if(num % 2 == 0) {
            System.out.println("Even");
        }

        else {
            System.out.println("Odd");
        }


    }
}

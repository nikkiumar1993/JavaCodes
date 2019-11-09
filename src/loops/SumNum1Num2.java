package loops;

import java.util.Scanner;

public class SumNum1Num2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = 0;
        double avg = 0;
        for(int i = num1; i<=num2; i++){
            sum+=i;
        }
            System.out.println("THe sum of "+ num1 + " to "+ num2 + " is " + sum);

    }
}

package Project2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(;;) {
            System.out.println("Enter number you want");
            int number = input.nextInt();
            if (number < 0) {
                negative++;
            } else if (number == 0) {
                zero++;
            } else {
                positive++;
            }
            System.out.println("Do you want to continue y/n?");
            input.nextLine();
            String answer = input.nextLine();
            if(answer.equals("y")){
            }else{
                System.out.println("Positive numbers: " + positive);
                System.out.println("Negative numbers: " + negative);
                System.out.println("Zero numbers: " + zero);
                break;
            }
        }

    }
}


package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task2Day1 {
    public static void main(String[] args) {
//        double[] num = {45.99, 23.5, 11.50, 33.33, 99.99};
//
//        System.out.println(Arrays.toString(num));
//        //       num[num.length-1]=112.89;
//        num[4] = 112.89;
//        System.out.println(Arrays.toString(num));
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = 1;
        for(int i = 1; i<=num2; i++){
           sum*=num1;

        }
        System.out.println(sum);

    }
}

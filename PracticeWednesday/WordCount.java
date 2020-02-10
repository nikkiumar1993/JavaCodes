package PracticeWednesday;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        duplicate();
    }

    public static void countWord() {
        System.out.println("Please enter a sentence to be analyzed");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        System.out.println("Your sentence has " + arr.length + " words");

    }

    public static void duplicate() {
        int[] num = {1, 2, 3, 3, 5, 6, 7, 7, 8, 9, 10, 1};
//            Arrays.sort(num);
//            for (int i = 0; i < num.length-1; i++) {
//                if(num[i]!=num[i+1]){
//
//                }else{
//                    System.out.println(num[i]);
//                }
//
//            }
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(num[i]);
            }
        }
    }
}



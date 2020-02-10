package arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number that will be the size of your array");
        int size = input.nextInt();
        int [] arr= new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Enter for your array");
           arr[i] = input.nextInt();

        }
        int[] firstHalf = new int[size/2];
        int[] secondHalf = new int[size/2];
        for (int i = 0; i <size/2 ; i++) {
            firstHalf[i] = arr[i];
        }
        for (int i = (size/2),j=0; i <size ; j++,i++) {

            secondHalf[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(firstHalf));
        System.out.println(Arrays.toString(secondHalf));


    }
}

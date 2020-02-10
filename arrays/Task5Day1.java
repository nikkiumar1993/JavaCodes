package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task5Day1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many names d you want to enter?");
        int size = input.nextInt();
        input.nextLine();


        String[] names = new String[size];

        for(int i = 0; i<names.length; i++) {
            System.out.println("Enter name " + (i + 1));

            names[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(names));




    }
}

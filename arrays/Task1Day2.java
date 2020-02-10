package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task1Day2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of cars:");
        int numOfCars = input.nextInt();
input.nextLine();
        String[] cars = new String[numOfCars];
        for(int i = 0; i<numOfCars; i++){
            System.out.println("Enter car " + (i+1));
            cars[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(cars));

    }
}

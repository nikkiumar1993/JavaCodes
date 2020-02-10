package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie2Try2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int day = 0;
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

        boolean notDead = true;
        while (notDead) {


            for (int i = 1; i < inhabitants.length; i++) {

                if (inhabitants[i] == 0) {
                    inhabitants[i] = inhabitants[i - 1] / 2;
                    inhabitants[i] = inhabitants[i + 1] / 2;
                }

            }



            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

            day++;

            int counter = 0;
            //for each element checking if every city is zero
            for (int element : inhabitants) {
                counter = counter + element;
            }

            //if each element value in every city is zero, we stop
            if (counter == 0) {
                notDead = false;
            }
        }
    }
}

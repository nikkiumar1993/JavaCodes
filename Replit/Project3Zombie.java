package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Project3Zombie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
         for(int i=0; i<inhabitants.length; i++) {
           inhabitants[i] = input.nextInt();
         }

        //TODO. Write you code below this line.

        int day = 0;
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        out:
        while (true) {
            for (int i = 1; i < inhabitants.length; i++)
                if (inhabitants[i] > 0 && inhabitants[i - 1] == 0)
                    inhabitants[i] /= -2;


            for (int i = inhabitants.length - 2; i >= 0; i--)
                if (inhabitants[i] < 0)
                    inhabitants[i] = -inhabitants[i];
                else if (inhabitants[i] > 0 && inhabitants[i + 1] == 0)
                    inhabitants[i] /= 2;
            day++;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));//[3, 6, 0, 4, 3, 2, 7, 1]
            int count = 0;
            for (int i = 0; i < inhabitants.length; i++) {
                if (inhabitants[i] == 0) {
                    count++;
                }
                if (count == inhabitants.length) {
                    break out;
                }

            }

        }
        System.out.println("---- EXTINCT ----");

    }
}

package scanners;

import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {

        Scanner apples = new Scanner(System.in);
        System.out.println("How many apples are there?");

        int totalApples = apples.nextInt();

        int females = (70*85);
        int males = (30*45);

        int result = (totalApples - females - males);

        System.out.println("Cybertek staff got: " + result + " apples!");

    }
}

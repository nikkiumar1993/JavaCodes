package IntroToJavaPractice;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner t8 = new Scanner(System.in);
        System.out.println("Enter your change:");
        int cents = t8.nextInt();

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        int totalQuarter = (cents / quarter);

        cents %= quarter;

        int totalDime = (cents / dime);

        cents %= dime;

        int totalNickel = (cents / nickel);

        cents %= nickel;

        int totalPenny = (cents / penny);

        cents %= penny;

        System.out.println("Quarters: " + totalQuarter);

        System.out.println("Dimes: " + totalDime);

        System.out.println("Nickles: " + totalNickel);

        System.out.println("Pennies: " + totalPenny);

    }
}

package scanners;
import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);

        System.out.println("How much money would you like to save up each month, through out half year?");

        int amountOfMoney = money.nextInt();

        int result = amountOfMoney * 6;

        System.out.println("You saved $" + result);

        System.out.println("How much did you spent on a new bike?");

        int bike = money.nextInt();



        int moneysaved = result - bike;

        System.out.println("You still have $" + moneysaved + " left!");
    }
}

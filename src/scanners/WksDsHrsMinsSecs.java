package scanners;
import java.util.Scanner;
public class WksDsHrsMinsSecs {
    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);

        System.out.println("Enter amount of days: ");

        int days = calc.nextInt();

        int weeks = (days/7);

        int remainderDays = (days % 7);

        System.out.println("The amount of day you entered equals to  " + weeks + " weeks and " + remainderDays +  " days!" );

        int hours = (days * 24);

        System.out.println("Hours: " + hours);

        long minutes = (hours * 60);

        System.out.println("Minutes: " + minutes);

       long seconds = (minutes * 60);

        System.out.println("Seconds: " + seconds);

    }
}

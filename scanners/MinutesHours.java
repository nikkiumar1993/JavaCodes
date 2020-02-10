package scanners;
import java.util.Scanner;
public class MinutesHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter minutes:");

        int minutes = scanner.nextInt();

        int hours = minutes/60;

        int remaindingMinutes = minutes  % 60;
        System.out.println(minutes + " minutes is " + hours + " hours and " + remaindingMinutes + " minutes");


    }
}

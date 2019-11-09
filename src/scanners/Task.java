package scanners;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Month: ");
        int month = scanner.nextInt();

        System.out.println("Day: ");
        int day = scanner.nextInt();

        System.out.println("Year: ");
        int year = scanner.nextInt();
        System.out.println(month + "/" + day + "/" + year);




    }
}

package IfElseStatements;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

// Write a program that asks a user to enter a number corresponding to the day of the week starting from 1 being Sunday, 2 being Monday, etc…
//         If the number is not between 1 and 7 print “invalid day”
//         > input: 7
//         > output: Saturday

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 1 to 7");
        int num = input.nextInt();

        String dayOfTheWeek = "";
        switch (num) {
            case 1:
                dayOfTheWeek = "Sunday";
                break;
            case 2:
                dayOfTheWeek = "Monday";
                break;
            case 3:
                dayOfTheWeek = "Tuesday";
                break;
            case 4:
                dayOfTheWeek = "Wednesday";
                break;
            case 5:
                dayOfTheWeek = "Thursday";
                break;
            case 6:
                dayOfTheWeek = "Friday";
                break;
            case 7:
                dayOfTheWeek = "Saturday";
                break;
            default:
                dayOfTheWeek = "Invalid entry";

        }
        System.out.println(dayOfTheWeek);
    }
}



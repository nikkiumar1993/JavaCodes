package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SaturdayTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month");
        String month = "October";
        String usermonth = input.nextLine();

        boolean check = month.equalsIgnoreCase(usermonth);
            System.out.println(check);

        }



    }


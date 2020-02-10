package String;

import java.util.Scanner;

public class SaturdayTask12 {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner input = new Scanner(System.in);
        String age = input.nextLine();
        int am = age.indexOf("am") + 3;
        int years = age.indexOf("years");
        String age2 = age.substring(am, years-1);
        int ageNum = Integer.valueOf(age2);
        ageNum +=5;
        System.out.println("In 5 years you will be " + ageNum);


    }
}

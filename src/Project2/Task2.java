package Project2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String str1 = input.next();
        int length = str1.length();
        String newstring = "";

        if(length<3 || length>100){
            System.out.println("Invalid");
        }else {
            for (int i = 0; i < length; i++) {
                if (str1.charAt(i) >= 48 && str1.charAt(i) <= 57 && length > 3 && length <= 100) {
                    newstring = newstring + str1.charAt(i);
                }
            }
            System.out.println(newstring);
        }

    }
}
//Task 2
//
//        Given a String, str2 , (str2 may contain characters, numbers and special characters) perform the following conditional actions:
//        Check if str2 has 3 or more characters, if less than 3 or bigger than 100 character, print only Invalid enter
//        Get only numbers from str2 and make one string then print (Hint: use charAt(), ASCII table to verify specific character is number or not number)
//
//        Input: av$5yit8
//        Output: 58
//
//        Input: abc23fd5hk7
//        Output: 2357
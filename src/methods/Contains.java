package methods;

import java.util.Scanner;
/*Write a method that takes two Strings. Check if the second String is found inside of the first String.
  If it does, remove that part from the String, but if the second String is not in the first String ask the user to enter another String to try again.*/

public class Contains {
    public static void main(String[] args) {

        containsOrNot("My name is Nikki", "Nikki");
    }
    public static void containsOrNot(String str, String str2){


            if(str.contains(str2)){
               str = str.replace(str2, "");
                System.out.println(str.trim());
            }else{
                System.out.println("Try again");
                Scanner input = new Scanner(System.in);
                String again = input.nextLine();
                if(str.contains(again)){
                    str = str.replace(again, "");
                    System.out.println(str.trim());
                }else
                    System.out.println("Out of tries");
            }

    }
}

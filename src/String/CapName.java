package String;

import java.util.Scanner;

public class CapName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("enter your name");
//        String name = input.nextLine();
//
//        String firstLetter = name.substring(0,1);
//        firstLetter = firstLetter.toUpperCase();
//
//        String restOfTheWord = name.substring(1).toLowerCase();
//
//        System.out.println(firstLetter + restOfTheWord);

        System.out.println("enter a sentence");

        String sentence = input.nextLine();
        int space = sentence.indexOf(" ");
        String firstword = sentence.substring(0,space);
        String remain = sentence.substring(space + 1);
        System.out.println(remain + " " + firstword);



    }
}

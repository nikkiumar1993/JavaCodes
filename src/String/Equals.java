package String;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
//        String word = "Cybertek";
//        String word2 = "Cybertek";
//        System.out.println(word.equals("Cybertek"));
//        System.out.println(word.length() == word2.length());
//        System.out.println(word.isEmpty()); //word.length()=0
//
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = input.nextLine();

        if (message.isEmpty()) {
            System.out.println("Message is empty");
        }
        else if (message.length()>=10) {
            System.out.println("Message is good");
        }else {
            System.out.println("Message is too short");
        }

    }
}

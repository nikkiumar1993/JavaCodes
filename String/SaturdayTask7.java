package String;

import java.util.Scanner;

public class SaturdayTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message");
        String message = input.nextLine();
        String idiot = "idiot";
        String dumb = "dumb";
        String stupid = "stupid";
        String goodword = "smart";


        if (message.contains(idiot)) {
            String replace = message.replace(idiot, goodword);
            System.out.println("Your message was changed");
            System.out.println(replace);
        }else if(message.contains(stupid)) {
            String replace = message.replace(stupid, goodword);
            System.out.println("Your message was changed");
            System.out.println(replace);
        }else if(message.contains(dumb)) {
            String replace = message.replace(dumb, goodword);
            System.out.println("Your message was changed");
            System.out.println(replace);
        }else{
            System.out.println("Your message was not changed");
            System.out.println(message);
        }
        }
    }

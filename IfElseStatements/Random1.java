package IfElseStatements;
import java.util.*;
public class Random1 {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(26);
        number +=65;
        char letter = (char)(number);
        System.out.println("My number is " + number);
        System.out.println("Your letter is " + letter);


    }
   }


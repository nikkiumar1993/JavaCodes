package IfElseStatements;

import java.util.*;
public class Randomnum {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int num = random.nextInt(10);
        num++;

        System.out.println(num);

        System.out.println("Write a number from 1 to 10");
        int userNum = input.nextInt();


        if (num == userNum) {
            System.out.println("Congrats you guessed right");
        } else if (userNum > num) {
            System.out.println("your guess is too high");
        } else if (userNum < num) {
            System.out.println("Your guess is too low");
        }
    }
}


//
//        int number = random.nextInt(100);
//        number ++;
//        System.out.println(number);
//        Guess Number: User is asked to guess a number from 1 to 10
//        Write a program that generates a random number and takes a guess from the user.
//                > If user guesses correct number they should see “ Congrats you guessed right”
//> If user guess is more than the random number they should see: “your guess is too high”
//> If user guess is less than the random number they should see “your guess it too low”


//    }
//}

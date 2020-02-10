package loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int num = random.nextInt(100)+1;
        int guess = 0;
        int count = 0;
        do{
            System.out.println("Guess a number from 1 to 100");
             guess = input.nextInt();
            count++;
            if(guess > num){
                System.out.println("too high");

            }else if(guess < num){
                System.out.println("too low");
            }else{
                System.out.println("You guessed after" + count + "tries");
            }
        }while(guess!=num);

        }

    }


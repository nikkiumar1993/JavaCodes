package IfElseStatements;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class ValidAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();

        if(age < 0  || age > 100) {
            System.out.println("Invalid age");
        } else if (age >=30 ) {
            System.out.println("Welcome to the building");
        }else {
            System.out.println("Sorry try again when you are 30");
        }
    }
}
package IntroToJavaPractice;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner t7 = new Scanner(System.in);

        double a = t7.nextDouble();
        double b = t7.nextDouble();

        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Remainder: " + (a%b));


    }
}

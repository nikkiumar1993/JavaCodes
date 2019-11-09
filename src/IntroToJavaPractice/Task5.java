package IntroToJavaPractice;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner t5 = new Scanner(System.in);

        char a = t5.nextLine().charAt(0);
        char b = t5.nextLine().charAt(0);
        boolean c = a > b;
        System.out.println(c);
    }
}

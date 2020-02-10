package IntroToJavaPractice;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner t3 = new Scanner(System.in);

        int num = t3.nextInt();
        int num2 = t3.nextInt();

        boolean b = num > num2;

        System.out.println(b);
    }
}

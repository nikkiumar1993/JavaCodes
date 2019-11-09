package IntroToJavaPractice;
import java.util.Scanner;
public class Tasks {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        String name = score.nextLine();
        char gender = score.nextLine().charAt(0);
        int age = score.nextInt();
        long phoneNum = score.nextLong();
        double gpa = score.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNum);
        System.out.println("GPA: " + gpa);


    }
}

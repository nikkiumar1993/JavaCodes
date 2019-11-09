package String;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SaturdayTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Cybertek is located in Des Plaines";
        System.out.println("Enter part of the sentence");
        String word = input.nextLine();
        int num = sentence.indexOf(word);
        System.out.println(word + " starts at: " + num);
    }
}

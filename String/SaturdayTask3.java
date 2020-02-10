package String;

import java.util.Scanner;

public class SaturdayTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "We will have a picnic when the weather gets nicer";
        System.out.println(sentence);
        System.out.println("Enter 2 characters from the sentence you want to change");
        String char1 = input.nextLine();
        String char2 = input.nextLine();

        System.out.println(sentence.replace(char1, char2));

    }
}

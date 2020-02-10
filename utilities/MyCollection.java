package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyCollection {

    public static String name;
    public String lastName;

    public void hi(){
        System.out.println(name);
    }
    public static ArrayList<String> getStringList() {
        System.out.println(name);
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a word:");
            words.add(scanner.nextLine());
            System.out.println("Are you done? Y/N? ");
            if (scanner.nextLine().equalsIgnoreCase("Y")) {
                break;
            }

        }
        return words;

    }
}

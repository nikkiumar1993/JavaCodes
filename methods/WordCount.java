package methods;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some string");
        String str = input.nextLine();
        countWords(str);
    }
    public static void countWords(String str){
      String[] arr = str.trim().split(" ");
        System.out.println("the number of words in the sentence is " + arr.length);


    }
}

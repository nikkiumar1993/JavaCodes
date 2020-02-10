package arrays;

import java.util.Scanner;

public class ReversedEachWord {
    public static void main(String[] args) {
        String str = "It started to snow in Chicago";
        String[] word = str.split(" ");
        String finalString = "";

        for(String words: word){
            String rev = "";
            for(int i =words.length()-1; i>=0; i--){
                rev+= words.charAt(i);
            }
            finalString+=rev + " ";

        }
        System.out.println(finalString);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String wordd = input.nextLine();
        String rev = "";

        for(int i = wordd.length()-1; i>=0; i--){

            rev += wordd.charAt(i);
        }
        System.out.println(rev);
    }
}

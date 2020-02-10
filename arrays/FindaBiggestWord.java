package arrays;

import java.util.Arrays;

public class FindaBiggestWord {
    public static void main(String[] args) {
        String sentence = "Write a program that creates a group of given size thisisabigword";
        String[] sentArr = sentence.split(" ");
        System.out.println(Arrays.toString(sentArr));
        int biggestLength = 0;
        String biggestWord = "";

        for (String word : sentArr) {
            if (word.length() > biggestLength) {
                biggestLength = word.length();
                biggestWord=word;
            }
        }
        System.out.println(biggestWord);
//        for (String word : sentArr) {
//            if (word.length() > biggestLength) {
//                System.out.println(word);
        /*
        8) Given the String: “It started to snow in Chicago”
Reverse each individual word and print the result
> expected output:
tI detrats ot wons ni ogacihC
         */

            }

}

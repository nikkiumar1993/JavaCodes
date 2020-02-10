package PracticeWednesday;


import java.util.Arrays;
import java.util.Scanner;

public class LoginPassword {
    public static void main(String[] args) {
//        login();
//        System.out.println(palindrome("civic"));
//        System.out.println(returnCount("About 94,500,000 results (0.62 seconds)"));
        System.out.println(isAnagram("nikki", "kkii"));
    }
    public static void login(){
        Scanner input = new Scanner(System.in);
        String log = "vkhekalo1986";
        double password = 123456;


        System.out.println("You have clicked to login button");
        System.out.println("Please enter account name:");
        String login = input.nextLine();

        System.out.println("Please enter your password");
        int pass = input.nextInt();
        if(log.equals(login) && password==pass){
            System.out.println("Login successful!");
        }else{
            System.out.println("Either your login or your password is incorrect");
        }
    }

    public static boolean palindrome(String word) {
        String rev = "";
        for (int i = word.length()-1; i >= 0; i--) {
            rev += word.charAt(i) +"";
        }
        if (word.equalsIgnoreCase(rev)) {
            return true;
        }
        return false;
    }
    public static String returnCount(String str){
        String [] arr = str.split(" ");
        String secondWord = arr[1].replace(",", "");
        return secondWord;
    }
    public static boolean isAnagram(String word, String word2){
        if(word.length()!=word2.length()) {
            return false;
        }
            char [] arr1 = word.toCharArray();
            char [] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);

        }
    }


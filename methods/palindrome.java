package methods;

import loops.Palindrome;

import java.awt.*;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeRev("mom"));
    }
    public static boolean isPalindromeArr(String str){
        char [] arr = str.toLowerCase().toCharArray();
        int last = arr.length-1;
        for (int i = 0; i <arr.length/2 ; i++) {
            if(arr[i] != arr[last-i]){
                return false;
            }

        }
        return true;
    }
    public static boolean isPalindromeRev(String str){
        if(ReverseString.str(str).equals(str)){
            return true;
        }
        return false;       
    }
}

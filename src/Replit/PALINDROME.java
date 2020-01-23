package Replit;

public class PALINDROME {
    public static boolean isPalindrome(String check) {
        char [] arr = check.toLowerCase().toCharArray();
        int last = arr.length-1;
            for (int i = 0; i <arr.length/2 ; i++) {
                if(arr[i] != arr[last-i]){
                    return false;
                }
            }return true;

    }
}


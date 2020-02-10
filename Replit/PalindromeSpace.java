package Replit;

public class PalindromeSpace {
    public static boolean isPalindrome(String check) {
        check = check.toLowerCase().replace(" ","");
        String rev = "";

        for(int i = check.length()-1; i >=0; i--) {
            rev += check.charAt(i);
        }
        if(rev.equals(check)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Nurses Run"));
    }
}

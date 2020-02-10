package Replit;

public class ConcatCodingBat {
    public String conCat(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        }else if(a.length()> b.length()){
            return a.substring(a.length()-b.length()) + b;
        }return  a + b.substring(b.length()-a.length());



    }

    public static void main(String[] args) {

    }
}
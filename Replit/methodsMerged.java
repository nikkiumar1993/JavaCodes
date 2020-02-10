package Replit;

public class methodsMerged {
    public static void main(String[] args) {
        String one = "java";
        String two = "selenium";
        String merged = "";

        for(int i = 0; i <one.length(); i++){

                merged+= one.charAt(i)+ "" + two.charAt(i);
            }System.out.println(merged + two.substring(one.length()));
        }

    }


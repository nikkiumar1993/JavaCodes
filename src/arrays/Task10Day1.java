package arrays;

import java.util.Scanner;

public class Task10Day1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] emails = {"Jamesbord3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", "Fran2113gmail.com", "JamieM@yahoo.com"};

        for(int i = 0; i<emails.length; i++){
            if(emails[i].contains("@") && emails[i].contains(".")){
                int at = emails[i].indexOf("@");
                int dot = emails[i].indexOf(".");
                if(at<dot){
                    System.out.println(emails[i] + " Valid");
                }else{
                    System.out.println(emails[i] + " Invalid");
                }

            }else{
                System.out.println(emails[i] + " Invalid email");

            }
        }
    }
}

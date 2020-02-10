package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class SplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {

        //your code here

        String[] arrInfo = info.split(",");//person name: jon last name: doe age: 30

        System.out.println("person name: " + arrInfo[0] + " last name: " + arrInfo[1] + " age: " + arrInfo[2]);


    }//end person

}

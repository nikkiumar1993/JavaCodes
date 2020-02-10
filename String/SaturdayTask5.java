package String;

import java.util.Scanner;

public class SaturdayTask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence1 = input.nextLine();
        String sentence2 = input.nextLine();
        int compare = sentence1.compareTo(sentence2);
        if(compare< 0){
            System.out.println(sentence1);
        }else if(compare>0){
            System.out.println(sentence2);
        }else{
            System.out.println("equal");
        }

    }
}

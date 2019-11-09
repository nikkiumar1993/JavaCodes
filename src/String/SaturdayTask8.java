package String;

import java.util.Scanner;

public class SaturdayTask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 names(first name and last name)");
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        int space = name1.indexOf(" ");
        int space2 = name2.indexOf(" ");
        String lastname2 = name2.substring(space + 1);
         if(name1.contains(lastname2)){
            System.out.println("relatives");
         }else{
             System.out.println("not relatives");
         }


    }
}

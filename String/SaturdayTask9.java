package String;

import java.util.Scanner;

public class SaturdayTask9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 Strings at least 6 char long");
        String n1 = input.nextLine().trim();
        String n2 = input.nextLine().trim();
        String first4 = n1.substring(0,4).toLowerCase();


        if(n1.length()<6 && n2.length()<6){
            System.out.println("Invalid data");
        }else{
            System.out.println(first4 + n2.substring(n2.length()-3) + "@cybertek.com");
        }

        }


    }


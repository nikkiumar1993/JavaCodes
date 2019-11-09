package String;

import java.util.Scanner;

public class SaturdayTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();

        if(name.startsWith("a") || name .startsWith("z")){
            System.out.println("Cool name");
        }else{
            System.out.println("Sorry not a cool name");
        }
    }
}

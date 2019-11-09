package loops;

import java.util.Scanner;

public class Adding1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add 1?");
        String yesOrNo = input.nextLine();
        int count = 0;
        while(yesOrNo.equals("y") || yesOrNo.equals("yes")){
            count++;
            System.out.println("Would you like to add 1?");
            yesOrNo = input.nextLine();
        }
        System.out.println("Your number is: " + count);

        int num2 = -1;
        do{
            System.out.println("Would you like to add 1");
            yesOrNo = input.nextLine();
        }while(yesOrNo.equals("yes"));
    }
}

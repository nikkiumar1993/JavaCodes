package loops;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
//        int num = 0;
//        while (num <=15) {
//            System.out.println(num++);
//        }
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = input.nextLine();
//        while (name.startsWith("j")){
//            System.out.println("Enter your name");
//            name = input.nextLine();
//        }
        System.out.println("Enter a number more than 0");
      int num = input.nextInt();
      int start = 0;
      while(start<=num)
          System.out.println(start++);
    }
}

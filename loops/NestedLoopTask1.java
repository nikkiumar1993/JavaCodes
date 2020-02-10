package loops;

import java.util.Scanner;

public class NestedLoopTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();
        for(int i = 0; i < num; i++ ){
            System.out.print("# ");
            for(int j=0; j<num;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}

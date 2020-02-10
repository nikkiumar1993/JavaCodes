package Project2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TASK 1
        System.out.println("Enter the number:");
        int x = input.nextInt();

        //your code here
        //----------------------------------------------------------
//int sum = 0;
int num1 = 0;
int num2 = 1;
for(int i = 0; i<=x;i++){
    System.out.print(num1 + " ");
  int sum= num1 + num2;
  num1 = num2;
  num2 = sum;

}



        // //----------------------------------------------------------

    }
}

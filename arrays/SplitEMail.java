package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEMail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        int count = 0;

        String [] SplitEmail = email.split("@");
        for(int i = 1; i<SplitEmail.length; i++){

            if(SplitEmail[i].contains("@")){
                count++;
            }
            if(count>1){
                System.out.println("invalid email");
            }else{
                System.out.println("Email id: " + SplitEmail[0]);
                System.out.println("Email domain: " + SplitEmail[1]);
            }
        }

    }
}

package loops;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class StringManipulationLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a phone number");
        String number = input.nextLine();
        boolean validLength = false;
        if(number.length()==10){
            validLength = true;
        }else if(number.length()==12){
            if(number.charAt(0)=='(' && number.charAt(4)==')'){
                validLength=true;
                number = number.replace("(", "").replace(")", "");
            }
        }
        int count = 0;
        if(validLength){
            for(int i = 0; i < number.length(); i++){
                char num = number.charAt(i);
                if(num>=48 && num<=57){
                    count++;
                }
            }
        if(count == number.length()){
            System.out.println("Valid Number");
        }else{
            System.out.println("Invalid number");
        }
        }else{
            System.out.println("Invalid number format");

        }

    }
}

package loops;

import java.util.Scanner;

public class ForLoopTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a name");

//        for(int i = 0; i<5; i++){
//            System.out.println("Enter name " + (i+1));
//            String name = input.nextLine();
//            System.out.println(name);
//        }
            for (; ;) {
                String word = input.nextLine();
                if(word.contentEquals("Hi")){
                    System.out.println("Hello");
                }else{
                    System.out.println("Good bye");
                    break;
                }

            }


    }
}

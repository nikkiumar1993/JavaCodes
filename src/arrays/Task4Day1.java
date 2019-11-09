package arrays;

import java.util.Scanner;

public class Task4Day1 {
    public static void main(String[] args) {
        String[] students = {"James", "Sam", "Adam", "Elize", "Jamie", "Benzema", "Sandy"};
        for(int i = 0; i<students.length; i++){
//            System.out.println(students[i]);
//            System.out.println(students[i].substring(students[i].length()-1));
            if(students[i].substring(students[i].length()-1).equals("s")){
                System.out.println(students[i]);
            }
            if (students[i].contains("s") || students[i].contains("S") ){
                System.out.println(students[i]);

            }


        }
        System.out.println();

        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();
        for(int i = 0; i<students.length; i++){
            if(students[i].toLowerCase().contains(user)){
                System.out.println(students[i]);
            }
        }

    }
}

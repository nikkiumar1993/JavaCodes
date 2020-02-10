package TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EnterNamesGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of groups");
        int groups = input.nextInt();



        input.nextLine();
        String [][] names = new String[groups][];
        for (int i = 0; i <names.length ; i++) {
            System.out.println("Enter how many students in each group");
            int numStudents = input.nextInt();
            input.nextLine();
            String [] group = new String[numStudents];
            for (int j = 0; j < numStudents; j++) {
                System.out.println("Enter a name" + (j+1));
                group[j]=input.nextLine();


            }
           names[i]=group;
        }
        System.out.println(Arrays.deepToString(names));





    }

}

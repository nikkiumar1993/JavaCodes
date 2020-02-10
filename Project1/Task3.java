package Project1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //----------------------------------------------------------

        //TASK 1
        System.out.println("Enter word:");
        String str2 = input.nextLine();
        str2 = str2.toLowerCase();

        if(str2.length()>=3 && str2.length()<=100){

        }else if(str2.length()%2==0) {

            System.out.println(str2);
        }
        }
    }


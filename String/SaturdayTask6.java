package String;

import java.util.Scanner;

public class SaturdayTask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String car = input.nextLine();
        switch (car){
            case("empty"):
                System.out.println("There are no cars in you garage");
                break;
            case("Toyota"):
            case("Nissan"):
                System.out.println("There is a japanese car in your garage");
                break;
            case("BMW"):
                System.out.println("There is a German car in you garage");
                break;
            case("Maserati"):
                System.out.println("There is a Italian car in you garage");
                break;
            case("Jaguar"):
                System.out.println("There is a British car in you garage");
                break;
            default:
                System.out.println("No cars of that type");
        }
    }
}

package classes;

import java.util.Scanner;

public class TestHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of house do you live in?");
        House house = new House();
        house.type = scanner.nextLine();
        System.out.println("What is your address?");
        house.address = scanner.nextLine();
        System.out.println("How many rooms do you have?");
        house.numRooms = scanner.nextInt();

        house.info();
    }
}

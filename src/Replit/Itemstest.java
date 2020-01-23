package Replit;

import java.util.Scanner;

public class Itemstest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many items do you have?");
        int numOfItems = input.nextInt();
        input.nextLine();

        Items[] myItems = new Items[numOfItems];

        for (int i = 0; i < numOfItems; i++) {
            System.out.println("Enter an item name " + (i + 1));
            String name = input.nextLine();
            System.out.println("Enter an item price " + (i + 1));
            double price = input.nextDouble();
            input.nextLine();
            myItems[i] = new Items(name, price);
        }
        for (Items item : myItems) {
            item.info();
        }
    }
}

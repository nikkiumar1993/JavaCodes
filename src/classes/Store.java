package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String name;
    String address;
    ArrayList<Item> items = new ArrayList<>();
    int numOfItems;
    int totalSales;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addItem(Item item) {
        this.items.add(item);
        numOfItems++;
    }

    public void seeInventory() {
//        for (int i = 0; i < items.size(); i++) {
//            System.out.println("Item# " + (i + 1));
//            System.out.println("Item name : " + items.get(i).name);
//            System.out.println("Item price : " + items.get(i).price);
//            System.out.println("Item size : " + items.get(i).size);
//            System.out.println();
//        }
        System.out.println("Zara chicago store");
        System.out.println("Total sales $" + this.totalSales);

        for (Item item : items) {
            item.info();
        }
    }

    public void addItem() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many items do you have?");
        int numItems = input.nextInt();
        input.nextLine();
        for (int i = 0; i < numItems; i++) {
            System.out.println("Please enter the item name and price");
            String name = input.nextLine();
            double price = input.nextDouble();
            input.nextLine();
            Item item = new Item(name, price);
            items.add(item);
            numOfItems++;
        }
    }

    public void info() {
        System.out.println("Store name: " + name + " Store address: " + address + " Num of items: " + numOfItems);
        seeInventory();
    }

    public void sellItem(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name.equals(itemName)) {
                this.totalSales += items.get(i).price;
                items.remove(i);
                numOfItems--;
                System.out.println("Your transaction is successful ");
                return;
            }
        }
        System.out.println("Transaction is failed");
    }

    public void returnItem(String name) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a price of returned item");
        double price = input.nextDouble();
        Item item = new Item(name, price);
        items.add(item);
        numOfItems++;
        totalSales-=price;
        System.out.println("\nReturn process successful");
    }
}




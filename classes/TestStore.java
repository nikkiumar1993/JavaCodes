package classes;

import java.util.ArrayList;

public class TestStore {
    public static void main(String[] args) {
        Store zara = new Store("Zara", "312 main st");
        Item item1 = new Item("Socks", 10);
        Item item2 = new Item("Coat", 200);
        Item item3 = new Item("Shirt", 30);

        zara.addItem(item1);
        zara.addItem(item2);
        zara.addItem(item3);

        System.out.println("Zara has " + zara.numOfItems + " items");
        zara.seeInventory();

//        zara.addItem();
//        zara.info();
//        zara.seeInventory();
        zara.sellItem("Coat");
        zara.seeInventory();
        zara.returnItem("Table");
        zara.seeInventory();
    }
}

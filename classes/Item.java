package classes;

public class Item {
    public String name;
    public double price;
    int size;

    public Item(String name, double price){
        this.name = name;
        this.price = price;

    }
    public Item(String name, double price, int size){
        this(name, price);
        this.size = size;

    }
    public void info(){
        System.out.println("\nName: " + name);
        System.out.println("Price: $" + price);
    }
}

package Replit;

public class Items {
    String name;
    double price;

    public Items(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void info(){
        System.out.println("Name " + name);
        System.out.println("Price " + price);
    }
}

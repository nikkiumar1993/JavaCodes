package inheritance;

public class Laptop {
    public Laptop(){
        super();
        System.out.println("Laptop constructor");
    }
    String model;
    int memorySize;
    String color;

public static int numOfLaptops;


    public void turnOn(){
        System.out.println("Laptop is turning on");
    }
}

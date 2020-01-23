package staticClass;

public class Lexus {
    String model;
    int year;
    String color;
    double mileage;
    boolean newOrNot;
    double price;
    static int totalNumOfLexus;

    public Lexus(String model, int year) {
        this.model = model;
        this.year = year;
        totalNumOfLexus++;
    }

    public static double mileToKm(double mileage) {
        return mileage * 1.6;

    }

    public static void evaluateCar(Lexus car) {

        if (car.mileage < 50000 && car.year >= 2016) {
            System.out.println("Best choice");
        } else if (car.mileage >= 50000 && car.mileage <= 100000 && car.year >= 2012 && car.year <= 2016) {
            System.out.println("Fair choice");
        } else if (car.mileage > 100000 || car.mileage <= 200000) {
            System.out.println("You decide");
        } else if (car.mileage > 200000) {
            System.out.println("Stay away");
        } else {
            System.out.println("Not able to evaluate");
        }
    }


}

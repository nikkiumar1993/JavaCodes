package classes;

public class TestCar {
    public static void main(String[] args) {



        Car car = new Car();
        car.make = "Lexus";
        car.mileage = 100;
        car.sportEdition = false;
        car.year = 2019;

        car.drive();
        car.drive("Ohio");
        car.drive(300);
        System.out.println(car.mileage);


    }
}
package staticClass;

public class LexusTest {
    public static void main(String[] args) {
        Lexus car1 = new Lexus("LX 360", 2015);
Lexus.evaluateCar(car1);
        System.out.println(car1.mileToKm(50000));

        car1.mileage = 100001;
        car1.year = 2012;
      Lexus.evaluateCar(car1);

    }
}

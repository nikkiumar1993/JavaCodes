package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("BMW");

        System.out.println(cars);
        System.out.println(cars);
        cars.add("Tesla");
        cars.add("Honda");
        List<String> list = new ArrayList<>(cars);
        System.out.println(cars);

        for (String car: cars) {
            System.out.println(car);
        }


    }
}

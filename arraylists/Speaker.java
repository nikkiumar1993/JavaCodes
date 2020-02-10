package arraylists;

import java.util.ArrayList;

public class Speaker {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Jason");
//        names.add("Adam");
//        names.add(1, "Nikki");
//        System.out.println(names);
//        System.out.println(names.get(1));
//        names.size();

        ArrayList<Cat> catsForSale = new ArrayList<>();
        Cat cat1 = new Cat();
        cat1.color = "White";
        cat1.age = 3;
        Cat cat2 = new Cat();
        cat2.color = "Black";
        cat2.age = 2;
        catsForSale.add(cat1);
        catsForSale.add(cat2);

        for (int i = 0; i < catsForSale.size(); i++) {
            System.out.println("Cat# " + (i + 1));
            System.out.println("Age: " + catsForSale.get(i).age);
            System.out.println("Color: " + catsForSale.get(i).color);
            System.out.println();
        }


    }
}

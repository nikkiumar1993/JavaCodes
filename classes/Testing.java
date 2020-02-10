package classes;

public class Testing {
    public static void main(String[] args) {
        String name = "java";
        Flag f1 = new Flag();
        f1.country = "USA";
        f1.color = "Red, white and blue";
        f1.size = 5;
        f1.material = "wood";
        System.out.println(f1.country);
        f1.flap();
        Flag f2 = new Flag();
        System.out.println(f2.country);
        f1.info();
        f2.info();
        f1.upgrade(4, "paper");
    }
}

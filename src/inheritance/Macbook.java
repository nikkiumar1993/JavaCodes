package inheritance;

public class Macbook extends Laptop {

    static int numOfLaptops;

    public Macbook() {
        super();

    }

    public void appleID() {
        super.memorySize = 45;

    }


    public static void main(String[] args) {

        Macbook macbook = new Macbook();
        macbook.color = "grey";
        Macbook.numOfLaptops = 23;
        System.out.println(Macbook.numOfLaptops);
        System.out.println(Laptop.numOfLaptops);


    }

}

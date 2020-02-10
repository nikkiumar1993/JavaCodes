package staticClass;

public class BestBuy {
    String location;
    static int numOfComputers;
     static String day;
    static {
        numOfComputers = 50;
        System.out.println("run first");
       day = "monday";
    }
    static {
        System.out.println("Run second");
        if (day.equals("monday")) {
            numOfComputers = 60;
        } else {
            numOfComputers = 20;
        }
    }
    public static void printComputer(){
        System.out.println(numOfComputers);
    }

}

public class Cats {
    public static void main(String[] args) {
        int numberofwild;
        numberofwild = 20;
        System.out.println("Wild: " + numberofwild);
        int numberofpets;
        numberofpets = 0;
        System.out.println("Pets " + numberofpets);
        System.out.println();
        
        numberofwild -= 5;
        numberofpets += 5;
        System.out.println("Wild: " + numberofwild);
        System.out.println("Pets: " + numberofpets);
        System.out.println();
        
        numberofwild = 10;
        numberofpets = numberofwild;
        System.out.println("Wild:" + numberofwild);
        System.out.println("Pets:" + numberofpets);
        
    }
}

public class Fruits {
    public static void main(String[] args) {
        int numberofapples;
        numberofapples = 10;

        System.out.println("apples: " + numberofapples);


        int numberoforanges;
        numberoforanges = 5;
        System.out.println("oranges: " + numberoforanges);
        
        numberofapples = 8;
        numberoforanges = numberofapples;

        System.out.println("apples after: " + numberofapples);
        System.out.println("orange after: " + numberoforanges);
    }
}

package operators;

public class Logic {
    public static void main(String[] args) {

//        System.out.println(5 > 4 && 6 > 4); // && both of the statements need to be true
//        System.out.println(4 < 3 ||false); // || OR one of the statement need to be true
//
//        boolean b = 5 > 1;
//        boolean d = false;
//        boolean check = d || b;
//        boolean check2 = d && b;
//        System.out.println(b);
//        System.out.println(d);
//        System.out.println(check);
//        System.out.println(check2);

        int age = 5;
        int age2 = 6;
        boolean ageB = age == age2;
        boolean ageBB = age != age2;
        System.out.println(ageB);//false
        System.out.println(ageBB);//true
        System.out.println(!ageB);//true
        System.out.println(!false);//true

        String word = "house";
        String word2 = "house";

        System.out.println(word.equals(word2)); // true

        int a = 10;
        int c = 8;

        System.out.println(false | a++ > c);//true
        System.out.println(a); //11
        System.out.println(false || true); //true






    }
}

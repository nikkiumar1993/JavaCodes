package WrapperClass;

import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {
    ArrayList<Integer> listInts = new ArrayList<>();

    public void generateNumbers(int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            Integer num = random.nextInt(1000);
            listInts.add(num);
        }
    }
    public void generateEvens(int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            Integer num = random.nextInt(100);
            if (num % 2 == 0) {
                listInts.add(num);
            }else{
                size++;
            }
        }
    }
    public void info(){
        for (int i = 0; i <listInts.size() ; i++) {
            System.out.println(listInts.get(i));
        }
    }

    public static void main(String[] args) {
//        System.out.println(Byte.MAX_VALUE);
//        Byte b = (byte)130;
        MagicNumber obj1 = new MagicNumber();
//        obj1.generateNumbers(4);
//        obj1.info();
        obj1.generateEvens(5);
        obj1.info();
    }
}

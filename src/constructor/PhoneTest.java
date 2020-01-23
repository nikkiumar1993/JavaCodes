package constructor;

import java.util.Arrays;

public class PhoneTest {
    public static void main(String[] args) {
//        Phone phone = new Phone("iphoneX", "Gold");
//        phone.info();
//
//        Phone phone2 = new Phone("Galaxy", "white", -234, true );
//        phone2.info();
//        System.out.println("--------------------------------");
//        phone2.text(1234567890, "");
//
//        phone.call(1234567890L);
        System.out.println(wordCount("hello world hello"));

    }

    public static int wordCount(String words) {
        String [] arrWords = words.split(" ");

         int count = arrWords.length;
        return count;

    }
}

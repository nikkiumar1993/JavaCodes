package stringBuilder;

import utilities.MyCollection;

import java.util.ArrayList;

public class ex {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       list.add("hello");
       list.add("mother");
       list.add("papa");
       list.add("abc");
//        StringBuilder sb = new StringBuilder("James");
//        sb.append(" Bond");
//        sb.append(4+4);
//        System.out.println(sb);
//
//        StringBuilder sb2 = new StringBuilder("Car");
////        sb2.deleteCharAt(1);
//        sb2.reverse();
//        sb2.delete(0,2);
//        sb2.insert(0, "Hello");
//
//        System.out.println(sb2);
//
//        System.out.println(isPalindrome("civic"));

        System.out.println(deleteWord("I want to concat"));
        System.out.println(deleteWord("I want to concat", "want"));
        System.out.println(insertWord(list, "morning "));

    }

    public static boolean isPalindrome(String word) {
        StringBuilder sb3 = new StringBuilder(word);
//        sb3.reverse();
        if (word.equalsIgnoreCase(sb3.reverse().toString())) {
            return true;
        }
        return false;
    }

    public static String deleteWord(String word) {
        StringBuilder sb = new StringBuilder(word);

        word.toLowerCase();
        if (word.contains("con")) {
            return sb.delete(word.indexOf("con"), (word.indexOf("con")) + 3).toString();
        }
        return word;
    }

    public static String deleteWord(String main, String str2) {
        StringBuilder sb = new StringBuilder(main);
        int length = str2.length();
        if (main.contains(str2)) {
            return sb.delete(main.indexOf(str2), (main.indexOf(str2)) + length).toString();
        }
        return main;
    }

    public static ArrayList<String> insertWord(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                StringBuilder sb = new StringBuilder(list.get(i));
                sb.insert(list.get(i).length() / 2, "HELLO");
                list.set(i, sb.toString());
            }

        }
        return list;
    }
    public static ArrayList<String> insertWord(ArrayList<String> list, String word) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                StringBuilder sb = new StringBuilder(list.get(i));
                sb.insert(list.get(i).length() / 2, word);
                list.set(i, sb.toString());
            }

        }
        return list;
    }

}

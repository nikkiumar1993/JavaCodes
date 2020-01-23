package Replit;


import java.util.Arrays;

public class ProjectDaycontainsSentence {
    public static void main(String[] args) {
        String[] array = {"kkini", "nikik", "mother", "daddy", "nikki", "niikk"};
        String  anagram = "";
        String a = "";
        String word = "nikki";
        String[] nu = word.split("");
        Arrays.sort(nu);
        for (String z : nu) {
            a += z;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String b = "";
            String[] nunu = array[i].split("");
            Arrays.sort(nunu);
            for (String z : nunu) {

                b += z;

                if (a.equals(b)) {
                    count++;
                    anagram+= b + " ";
                }
            }
        }

        String [] arrAnagram = anagram.split(" ");

        System.out.println(Arrays.toString(arrAnagram));

    }
}
//String [] array = {"sdfas", "sdgfsdg", "asdfdgavd"};
//  String word = "hello";
//
//        String[] newArr = Arrays.copyOf(array, array.length+1);
//        newArr[0] = word;
//        for (int i = 1; i < newArr.length; i++) {
//            newArr[i] += array[i];
//
//        }
//
//        System.out.println(Arrays.toString(newArr));
//    }


//        String[] words = {"apple", "is", "sweet"};
//        String sentence="apple is i g h g sweet";
//        String [] arrSentence = sentence.split(" ");
//        System.out.println(Arrays.toString(arrSentence));
//        int count = 0;
//        for(int i = 0; i< words.length; i++){
//            for (int j = 0; j <arrSentence.length ; j++) {
//
//                if(words[i].equalsIgnoreCase(arrSentence[j])){
//                    count++;
//                }
//            }
//            }
//
//        if(count==arrSentence.length){
//            System.out.println(count);
//        }
//        System.out.println(count);


//    int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };
//
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = i + 1; j < arr.length; j++) {
//        int tmp = 0;
//        if (arr[i] > arr[j]) {
//        tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//        }
//        }
//        }

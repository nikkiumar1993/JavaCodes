package TwoDArrays;

import java.util.Arrays;

public class Length2D {
    public static void main(String[] args) {
//        int [][] arr = {{4,2,3}, {3232,11,13,4,2}, {23,13}};
//
//        for (int i = 0; i <=arr.length; i++) {
//            System.out.println("Length of row" + (i+1) + " : " + arr[i].length);
//        }
//
//        String [][] groups  = new String [3][];
//        String [] group1 = {"Nikki", "Asya", "Olya", "Katya"};
//        String [] group2 = {"Venera", "Abdu"};
//        String [] group3 = {"Yulia", "Alex", "Anton"};
//
//          groups[0] = group1;
//          groups[1] = group2;
//          groups[2] = group3;
//        System.out.println(Arrays.deepToString(groups));

        int [][] arr = {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};
//        int max = arr[0][0];
//        for(int i=0; i<arr.length; i++){
//            for(int j =0; j<arr[i].length; j++){
//                if(max<arr[i][j]){
//                    max = arr[i][j];
//                }
//            }
//        }System.out.println(max);
        int sum = 0;
int index = 0;
        for(int i = 0; i< arr.length;i++){
            int inner = 0;
            for (int j = 0; j <arr[i].length ; j++) {
                inner+= arr[i][j];
                if(inner>sum){
                    sum = inner;
                    index=i;
                }
            }
        }
        System.out.println(index);

    }
}

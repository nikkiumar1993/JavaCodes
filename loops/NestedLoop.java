package loops;

public class NestedLoop {
    public static void main(String[] args) {
//        for(int i=0; i < 5; i++){
//            System.out.println("i is " +i);
//            for(int j = 0; j < 5; j++){
//                System.out.println("j is " + j);
//            }
//            System.out.println();
//        }
//
//        for(int i = 0; i < 5; i++){
//            System.out.println("i is " + i);
//            for(int j = 0; j <= i; j++){
//                System.out.println("j is " + j);
//            }
//            System.out.println();
//        }

        for( int i = 0; i < 5; i++){
            int run = 3;
            while(run != 0){
                System.out.println(run--);
            }
            System.out.println();
        }
    }
}

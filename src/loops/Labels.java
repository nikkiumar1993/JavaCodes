package loops;

public class Labels {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 5; i++) {
            System.out.println("i is " + i);
            inner:
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue inner;
                }
                System.out.println("j is " + j);
                if (i == 3) {
                    break inner;
                }
            }
            System.out.println();
        }


    }
}

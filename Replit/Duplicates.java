package Replit;

public class Duplicates {
    public static void main(String[] args) {
        String[] r = {"1", "2", "3", "1", "arr", "arr", "1"};
        System.out.println(getDup(r));

    }

    public static int getDup(String[] r) {
        String helper = "";
        int duplicate = 0;
        for (int i = 0; i < r.length; i++) {
            int count = 0;
            if (!helper.contains(r[i])) {
                for (int j = 0 ; j < r.length; j++) {
                    if (r[i].equals(r[j])) {
                        count++;
                    }
                    helper += r[i];
                }if(count>1){
                    duplicate+=count;
                }
            }
        }
        return duplicate;

    }
}
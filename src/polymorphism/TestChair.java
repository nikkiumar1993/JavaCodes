package polymorphism;

import java.util.ArrayList;

public class TestChair {
    public static void main(String[] args) {
        Chair c = new Humanscale();
        Chair c2 = new Aeron();
        Chair c3 = new Humanscale();
        Chair c4 = new Aeron();
        Rollable r = new Aeron();
        Rollable r2 = new Humanscale();
        Collapsible col = new Humanscale();


        ArrayList<Chair> chairs = new ArrayList<>();
        chairs.add(c);
        chairs.add(c2);
        chairs.add(c3);
        chairs.add(c4);

        for (Chair ch : chairs) {
            ch.stepOnIt();
        }
    }


}

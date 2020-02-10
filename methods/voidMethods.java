package methods;

import org.w3c.dom.ls.LSOutput;

public class voidMethods {
    public static void main(String[] args) {
        sayHi();
        sayBye();
        sayHi();
    }

    public static void sayHi() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
        sayBye();
    }

    public static void sayBye(){
        System.out.println("Bye");
    }
}

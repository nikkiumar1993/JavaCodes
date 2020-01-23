package polymorphism2;

public class Dog extends Animal implements Trainable {
    String name;
    boolean isMale;

    @Override
    public void bark() {

    }

    @Override
    public void breath() {
        System.out.println("Dog is breathing");
    }
}

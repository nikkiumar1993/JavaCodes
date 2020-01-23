package polymorphism2;

public class GermanShepherd extends Dog implements Trainable {
int age;

    @Override
    public void breath() {
        System.out.println("German Shepherd is breathing");
    }

    @Override
    public void bark() {

    }
}

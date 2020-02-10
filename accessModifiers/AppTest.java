package accessModifiers;

public class AppTest {
    public static void main(String[] args) {
        App app = new App("apple", "A", 4);
        app.info();
        app.setReviews("good");
        System.out.println(app.getReviews());
    }
}

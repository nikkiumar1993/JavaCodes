package constructor;

public class Sky {
    String color;
    int Stars;


    public Sky(String colorCode) {
        this.color = colorCode;
    }
    public void info(){
        System.out.println("sky color is: " + color);
        System.out.println("Visible stars: " + Stars);
    }
    public static void main(String[] args) {
        Sky refSky = new Sky("Blue");
        //refSky.color = "Blue";
        System.out.println(refSky.color);
        Sky sky1 = new Sky("White", 100000000);
        System.out.println(sky1.color);
        System.out.println(sky1.Stars);
        sky1.info();


    }

    public Sky(String color1, int stars){
        this.color = color1;
        this.Stars = stars;
    }
}

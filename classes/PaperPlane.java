package classes;

public class PaperPlane {
    public static void main(String[] args) {
        Flag flagone = new Flag();
        flagone.size= 4;
        flagone.country = "Canada";
        flagone.color = "red, white";
        flagone.material = "paper";
        Flag flag2 = new Flag();
        flag2.size= flagone.size ;
        flag2.country = flagone.country;
        flag2.color = flagone.color;
        flag2.material = flagone.material;

        flagone.size = 0;
        flagone.country = "a";
        flagone.color = "a";
        flagone.material = "a";
        flagone.info();
        flag2.info();

        flagone.upgrade(255, "gold");
        flagone.info();
    }

}

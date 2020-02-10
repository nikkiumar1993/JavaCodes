package polymorphism;

public interface Wifi {
    void searchWifi();  //public abstract void searchWifi();
   public  static void m(){
       System.out.println("Static Method");
    }
    public default void d(){
        System.out.println("Default Method");
    }


}

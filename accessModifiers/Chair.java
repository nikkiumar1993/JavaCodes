package accessModifiers;

public class Chair {
    private int size;
    public String model;

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        }
    }
      public int getSize() {
          if (this.model.equalsIgnoreCase("ikea")) {
              return size;
          } else {
              System.out.println("Its not a real model");
              return 0;
          }
      }


public void info(){
    System.out.println("Model: " + model);
    System.out.println("Size: " + size);
}
}

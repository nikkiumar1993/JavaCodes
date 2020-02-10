package constructor;

public class Phone {
    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNUMBER;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Phone(String model, String color, int memory, boolean touchscreen) {
        this.model = model;
        this.color = color;

        this.touchscreen = touchscreen;
        if (memory < 0) {
            System.out.println("Invalid memory");
        } else {
            this.memory = memory;
        }

    }

    public void info() {
        System.out.println("Phone Model: " + model);
        System.out.println("Phone memory: " + memory);
        System.out.println("Color: " + color);
        System.out.println("NUmber: " + phoneNUMBER);
        System.out.println("Touchscreen: " + touchscreen);
    }

    public boolean text(long phoneNum, String text) {
        String num = phoneNum + "";
        if (num.length() == 10 && !text.isEmpty()) {
            System.out.println("Message is sent");
            return true;
        } else {
            System.out.println("Invalid phone number or text body");
            return false;
        }

    }

    public void call(long num) {
        String pnum = num + "";
        if (pnum.length() == 10) {
            System.out.println("Calling to " + pnum);
        } else {
            System.out.println("Invalid phone number");
        }
    }
}
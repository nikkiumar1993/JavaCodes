package polymorphism;

public class ZelleTransfer implements MobileVarifiable {

    @Override
    public boolean verify() {
        System.out.println("Zelle is varifying a transfer");
        return true;
    }
}

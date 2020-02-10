package polymorphism;

public  class Humanscale extends Chair implements Rollable, Collapsible {
    @Override
    public void sit() {
        System.out.println("Sitting on Humanscale chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on Humanscale chair");
    }

    @Override
    public void lock() {
        System.out.println("Human scale is locking");
    }

    @Override
    public void unlock() {
        System.out.println("Human scale is unlocking");
    }

    @Override
    public void fold() {
        System.out.println("Human scale is folding");
    }

    @Override
    public void unfold() {
        System.out.println("Human scale is unfolding");
    }

    @Override
    public void rollBack() {
        System.out.println("Human scale is rolling back");
    }

    @Override
    public void rollForward() {
        System.out.println("Human scale is rolling forward");
    }
}

package dish;

public abstract class Dish {
    protected boolean isInduction, isClean;
    protected String color;

    public abstract void breakUp();
    public abstract void wash();
}
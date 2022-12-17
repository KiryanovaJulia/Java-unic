package dish;

public class Pan extends Dish{
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pan(boolean isInduction, String color, int size) {
        this.isInduction = isInduction;
        this.color = color;
        this.size = size;
        isClean = true;
    }

    public void fry(String dish) {
        System.out.println("The " + dish + " is fried\n");
        isClean = false;
    }

    public void flip() {
        System.out.println("The pan was flipped\n");
    }

    public String toString() {
        return "Pan size: " + size + '\n'
                + "Pan is " + (isClean ? "cleaned" : "dirty");
    }

    @Override
    public void breakUp() {
        System.out.println("Unfortunately, the pan broke\n");
    }

    @Override
    public void wash() {
        System.out.println("Pan successfully washed\n");
        isClean = true;
    }
}
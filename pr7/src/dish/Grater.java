package dish;

public class Grater extends Dish{
    private int size, sides;

    public Grater(int sides, String color, int size) {
        this.sides = sides;
        super.color = color;
        this.size = size;
    }

    public void grate(String ingredient) {
        System.out.println("The " + ingredient + " is grated\n");
        isClean = false;
    }

    public void turnOver() {
        System.out.println("The grater was turned over\n");
    }

    public String toString() {
        return "Grater size: " + size + '\n'
                + "Grater is " + (isClean ? "cleaned" : "dirty");
    }

    @Override
    public void breakUp() {
        System.out.println("Unfortunately, the grater broke\n");
    }

    @Override
    public void wash() {
        System.out.println("Grater successfully washed\n");
        isClean = true;
    }
}
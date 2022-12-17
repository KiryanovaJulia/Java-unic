package pr3.human;

public class Leg {
    private int length;

    public Leg() {

    }

    public Leg(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void kick() {
        System.out.println("You kicked an object!");
    }

    public String toString() {
        return String.format("Leg length = %d", length);
    }
}
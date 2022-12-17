package pr3.human;

public class Hand {
    private int length;

    public Hand() {

    }

    public Hand(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void grab() {
        System.out.println("You grabbed object!");
    }

    public void showGesture(String gesture) {
        System.out.println(String.format("You showed %s gesture", gesture));
    }

    public String toString() {
        return String.format("Hand length = %d", length);
    }
}
package furnetureShop;

public class Wardrobe extends Furniture {
    boolean isOpened;

    public Wardrobe(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
        isClean = true;
        isColored = false;
        isOpened = false;
    }

    public boolean getOpenedStatus() {
        return isOpened;
    }

    public void open() {
        isOpened = true;
    }

    public void close() {
        isOpened = false;
    }

    @Override
    public void clean() {
        isClean = true;
    }

    @Override
    public void paint(String color) {
        isColored = true;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wardrobe's info:\n" + super.toString() + '\n'
                + "Opened status: " + (isOpened ? "opened" : "closed");
    }
}
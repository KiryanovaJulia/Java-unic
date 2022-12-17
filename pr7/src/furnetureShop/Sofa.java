package furnetureShop;

public class Sofa extends Furniture{

    public Sofa(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
        isClean = true;
        isColored = false;
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
        return "Sofa's info:\n" + super.toString();
    }
}
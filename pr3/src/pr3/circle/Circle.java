package pr3.circle;

public class Circle {
    private int xPosition, yPosition, radius;

    public Circle(int xPosition, int yPosition, int radius) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.radius = radius;
    }

    public int getX() {
        return xPosition;
    }

    public void setX(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getY() {
        return yPosition;
    }

    public void setY(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return String.format("Circle info: X = %d, Y = %d, Radius = %d", xPosition, yPosition, radius);
    }
}
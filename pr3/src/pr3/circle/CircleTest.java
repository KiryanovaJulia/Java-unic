package pr3.circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(20, 10, 5);
        System.out.println(circle);

        System.out.println(String.format("Circle radius before changes = %d", circle.getRadius()));
        circle.setRadius(21);
        System.out.println(String.format("Circle radius after changes = %d", circle.getRadius()));

        System.out.println(String.format("Circle x position before changes = %d", circle.getX()));
        circle.setX(44);
        System.out.println(String.format("Circle x position after changes = %d", circle.getX()));

        System.out.println(circle);

    }
}
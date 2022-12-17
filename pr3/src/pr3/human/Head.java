package pr3.human;

public class Head {
    private String head_shape;

    public Head() {
        head_shape = "Is unknown";
    }

    public Head(String head_shape) {
        this.head_shape = head_shape;
    }

    public String getShape() {
        return head_shape;
    }

    public void setShape(String head_shape) {
        this.head_shape = head_shape;
    }

    public void tilt() {
        System.out.println("You tilted your head!");
    }

    public void turn() {
        System.out.println("You turned your head!");
    }

    public String toString() {
        return String.format("Head shape is %s", head_shape);
    }
}
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MyPanel extends JPanel {

    private final int SCREEN_WIDTH = 500;
    private final int SCREEN_HEIGHT = 500;
    private static int counter = 0;

    private Image image1, image2, image3, image4;
    private ArrayList<Image> images = new ArrayList<>();

    MyPanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    }

    MyPanel(String arg) {
        image1 = new ImageIcon(arg).getImage();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    }

    MyPanel(String arg1, String arg2, String arg3, String arg4) {
        image1 = new ImageIcon(arg1).getImage();
        image2 = new ImageIcon(arg2).getImage();
        image3 = new ImageIcon(arg3).getImage();
        image4 = new ImageIcon(arg4).getImage();

        images.add(image1);
        images.add(image2);
        images.add(image3);
        images.add(image4);

        this.setPreferredSize(new Dimension(SCREEN_WIDTH + 150, SCREEN_HEIGHT + 150));
    }

    public void paint(Graphics g) {
        // ==== Animation ====
        try {
            printAnimation(g);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // ==== Shapes ====
        //printShapes(g);
    }

    public void printShapes(Graphics g) {
        int n = 0;
        final int MAX_SHAPES = 50;
        final Random r = new Random();

        while (n < MAX_SHAPES) {
            switch (r.nextInt(3)) {
                case 0:
                    printOval(g);
                    break;
                case 1:
                    printRect(g);
                    break;
                case 2:
                    printTriangle(g);
                    break;
                default:
                    System.out.println("Something went wrong");
            }
            n++;
        }
    }

    public void printAnimation(Graphics g) throws InterruptedException {
        Graphics2D g2D = (Graphics2D) g;

        Image img = images.get(counter);
        g2D.drawImage(img, 0, 0, null);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        counter++;
        if (counter < 4)
            repaint();
    }

    public void printOval(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        final Random r = new Random();
        int rWidth = r.nextInt(75) + 25;
        int rHeight = r.nextInt(75) + 25;

        int maxX = SCREEN_WIDTH - rWidth;
        int maxY = SCREEN_HEIGHT - rHeight;

        int rXPoint = r.nextInt(maxX);
        int rYPoint = r.nextInt(maxY);

        g2D.setStroke(new BasicStroke(2));
        Color c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256), r.nextInt(256));
        g2D.setPaint(c);
        g2D.drawOval(rXPoint, rYPoint, rWidth, rHeight);
    }

    public void printTriangle(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        final Random r = new Random();
        g2D.setStroke(new BasicStroke(2));

        Color c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256), r.nextInt(256));
        g2D.setPaint(c);

        int[] xPoints = {r.nextInt(SCREEN_HEIGHT), r.nextInt(SCREEN_HEIGHT), r.nextInt(SCREEN_HEIGHT)};
        int[] yPoints = {r.nextInt(SCREEN_HEIGHT), r.nextInt(SCREEN_HEIGHT), r.nextInt(SCREEN_HEIGHT)};

        g2D.drawPolygon(xPoints, yPoints, 3);
    }

    public void printRect(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        final Random r = new Random();
        g2D.setStroke(new BasicStroke(2));

        int rWidth = r.nextInt(125) + 25;
        int rHeight = r.nextInt(125) + 25;

        int maxX = SCREEN_WIDTH - rWidth;
        int maxY = SCREEN_HEIGHT - rHeight;

        int rXPoint = r.nextInt(maxX);
        int rYPoint = r.nextInt(maxY);

        Color c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256), r.nextInt(256));
        g2D.setPaint(c);
        g2D.drawRect(rXPoint, rYPoint, rWidth, rHeight);
    }

}

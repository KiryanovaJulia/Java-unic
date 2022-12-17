
import javax.swing.*;

public class MyFrame extends JFrame {

    MyPanel panel;

    MyFrame() {
        panel = new MyPanel();
        this.setTitle("Rectangles");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    MyFrame(String arg) {

        panel = new MyPanel(arg);
        this.setTitle("Rectangles");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public MyFrame(String arg0, String arg1, String arg2, String arg3) {
        panel = new MyPanel(arg0, arg1, arg2, arg3);
        this.setTitle("Rectangles");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
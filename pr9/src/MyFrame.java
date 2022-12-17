import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    MyPanel panel;
    JButton button;

    MyFrame() {
        button = new JButton("Draw a shape");
        button.setBounds(203, 203, 100, 50);
        button.setFocusable(false);
        button.addActionListener(this);

        panel = new MyPanel(button);
        this.setTitle("GUI application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        this.add(button);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    MyFrame(String arg) {

        panel = new MyPanel(arg);
        this.setTitle("GUI application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public MyFrame(String arg0, String arg1, String arg2, String arg3) {
        panel = new MyPanel(arg0, arg1, arg2, arg3);
        this.setTitle("GUI application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            repaint();
        }
    }
}
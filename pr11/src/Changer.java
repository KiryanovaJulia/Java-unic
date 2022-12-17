import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Changer implements ActionListener {
    JFrame frame;
    JTextArea textArea;

    String[] colors, fonts;
    JComboBox comboBoxColors, comboBoxFonts;


    Changer() {
        frame = new JFrame("Changer");
        frame.setLayout(new FlowLayout());
        frame.setPreferredSize(new Dimension(500, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        textArea = new JTextArea(2, 15);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        textArea.setLineWrap(true);


        String[] colors = {"Blue", "Red", "Black"};
        String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};

        comboBoxColors = new JComboBox(colors);
        comboBoxFonts = new JComboBox(fonts);

        comboBoxFonts.addActionListener(this);
        comboBoxColors.addActionListener(this);


        frame.add(textArea);
        frame.add(comboBoxColors);
        frame.add(comboBoxFonts);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBoxColors) {
            String selectedItem = (String)comboBoxColors.getSelectedItem();
            if (selectedItem == "Blue")
                textArea.setForeground(Color.BLUE);
            else if (selectedItem == "Red")
                textArea.setForeground(Color.RED);
            else
                textArea.setForeground(Color.BLACK);
        }
        if (e.getSource() == comboBoxFonts) {
            String selectedItem = (String)comboBoxFonts.getSelectedItem();
            if (selectedItem == "Times New Roman")
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 15));
            else if (selectedItem == "MS Sans Serif")
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 15));
            else
                textArea.setFont(new Font("Courier New", Font.PLAIN, 15));
        }
    }
}
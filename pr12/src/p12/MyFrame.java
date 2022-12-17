package p12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JPanel panel;
    JLabel label;
    JComboBox comboBox;

    MyFrame() {
        this.setTitle("Planets");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setResizable(false);
        this.setPreferredSize(new Dimension(500, 75));

        label = new JLabel();
        label.setText("Select your planet");

        comboBox = new JComboBox(p12.SolarSystem.values());
        comboBox.addActionListener(this);

        this.add(label);
        this.add(comboBox);

        this.pack();
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            p12.SolarSystem selectedItem = (p12.SolarSystem) comboBox.getSelectedItem();
            label.setText("The gravity of " + selectedItem + " = " + String.valueOf(selectedItem.calculateGravity()));
        }
    }
}
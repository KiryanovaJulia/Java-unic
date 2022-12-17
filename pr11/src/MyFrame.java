import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private final int MIN_VALUE = 0;
    private final int MAX_VALUE = 20;
    private final int ATTEMPTS_COUNT = 3;

    private JPanel panel, welcomeHeader, welcomeContainer;
    private JButton button;
    private JButton restartButton, startGameButton;
    private JTextField textField;
    private JLabel label, label2;
    private JLabel winStatusIcon, welcomeIcon;

    private int attempts = ATTEMPTS_COUNT;
    private int number = (int)(Math.random() * 20);

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(123, 50, 250)); // window bg color
        this.setResizable(false);
        this.setTitle("Guessing");

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(850, 700));
        panel.setBackground(new Color(123, 50, 250));
        panel.setLayout(new BorderLayout());
        welcome();

        this.setLocationRelativeTo(null); // places window in the middle of the screen
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startGameButton) {
            startGame();
        }
        if (e.getSource() == button) {
            guessing();
        }
        if (e.getSource() == restartButton) {
            restartGame();
        }
    }

    public void welcome() {

        // ==== HEADER ====
        welcomeHeader = new JPanel();
        welcomeHeader.setBounds(0, 0, 850, 60);
        welcomeHeader.setBackground(new Color(123, 50, 250));
        welcomeHeader.setLayout(new BorderLayout());

        label = new JLabel("Welcome to the Guessing game!");
        label.setForeground(new Color(0xfadf32));
        label.setFont(new Font("Consolas", Font.PLAIN, 25));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        label2 = new JLabel("Your task is to guess the number from " + MIN_VALUE +
                " to " + MAX_VALUE + " in " + ATTEMPTS_COUNT + " attempts.");
        label2.setForeground(new Color(0xfadf32));
        label2.setFont(new Font("Consolas", Font.PLAIN, 25));
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        // ==== CONTAINER ====
        welcomeContainer = new JPanel();
        welcomeContainer.setLayout(null);
        welcomeContainer.setBounds(0, 61, 850, 180);
        welcomeContainer.setBackground(new Color(123, 50, 250));

        startGameButton = new JButton("Start the game");
        startGameButton.addActionListener(this);
        startGameButton.setBounds(325, 61, 200, 70);
        startGameButton.setFocusable(false);
        startGameButton.setFont(new Font("Consolas", Font.PLAIN, 20));
        startGameButton.setBackground(new Color(0x5305da));
        startGameButton.setForeground(new Color(0xffffff));
        startGameButton.setBorderPainted(false);
        startGameButton.setOpaque(true);

        // ==== ICON ====
        ImageIcon image = new ImageIcon("java_tasks/src/p11/img/welcome.png");
        welcomeIcon = new JLabel();
        welcomeIcon.setIcon(image);
        welcomeIcon.setHorizontalAlignment(SwingConstants.CENTER);

        // ==== PANELS ADDING ====
        welcomeHeader.add(label, BorderLayout.NORTH);
        welcomeHeader.add(label2, BorderLayout.SOUTH);
        welcomeContainer.add(startGameButton);

        panel.add(welcomeHeader);
        panel.add(welcomeContainer);
        panel.add(welcomeIcon, BorderLayout.SOUTH);

        this.add(panel);
        this.pack();
    }

    public void startGame() {
        panel.remove(welcomeHeader);
        panel.remove(welcomeContainer);
        panel.remove(welcomeIcon);
        panel.setLayout(new FlowLayout());
        repaint();

        button = new JButton("Guess the number");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setFont(new Font("Consolas", Font.PLAIN, 20));
        button.setBackground(new Color(0x5305da));
        button.setForeground(new Color(0xffffff));
        button.setBorderPainted(false);
        button.setOpaque(true);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("0");

        label = new JLabel("You have " + ATTEMPTS_COUNT + " attempts");
        label.setForeground(new Color(0xfadf32));
        label.setFont(new Font("Consolas", Font.PLAIN, 25));

        label2 = new JLabel();
        label2.setForeground(new Color(0xfadf32));
        label2.setFont(new Font("Consolas", Font.PLAIN, 25));

        panel.add(button);
        panel.add(textField);
        panel.add(label);
        panel.add(label2);

        this.add(panel);
        this.pack();
    }

    public void guessing() {
        boolean isValidText = true;
        boolean isValidNumber = true;
        boolean isGuessed = false;
        int textFieldNumber = 0;
        // text field input handling
        try {
            textFieldNumber = Integer.parseInt(textField.getText()); // catch block entrance
            isValidNumber = textFieldNumber <= MAX_VALUE && textFieldNumber >= MIN_VALUE ? true : false;
            isGuessed = number == textFieldNumber;
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number");
            isValidText = false;
        }

        if (isValidText && isValidNumber)
        {
            attempts--;
            System.out.println(number); // console helper
            if (attempts != 0) {
                label.setText("You have " + attempts + " attempts");
                if (isGuessed) {
                    gameWin();
                }
                else if (textFieldNumber > number) {
                    label2.setText("The number is lesser than you think");
                }
                else {
                    label2.setText("The number is bigger than you think");
                }
            }
            else {
                if (!isGuessed)
                    gameLose();
                else
                    gameWin();
            }
        }
        else if (!isValidText) {
            label2.setText("Input must be a number!");
        }
        else {
            label2.setText("Number must be from " + MIN_VALUE + " to " + MAX_VALUE + "!");
        }
    }

    public void gameWin() {
        button.setEnabled(false);
        label.setText("Congratulations!");
        label2.setText("You won! Do you want to play again?");

        restartButton = new JButton("Let's play!");
        restartButton.addActionListener(this);
        restartButton.setFocusable(false);
        restartButton.setFont(new Font("Consolas", Font.PLAIN, 20));
        restartButton.setBackground(new Color(0x5305da));
        restartButton.setForeground(new Color(0xffffff));
        restartButton.setBorderPainted(false);
        restartButton.setOpaque(true);

        panel.add(restartButton);
        ImageIcon winImage = new ImageIcon("java_tasks/src/p11/img/win.png");
        winStatusIcon = new JLabel();
        winStatusIcon.setIcon(winImage);
        panel.add(winStatusIcon);
        this.pack();
    }

    public void gameLose() {
        button.setEnabled(false);
        label.setText("You’ve wasted all attempts");
        label2.setText("Do you want to try again?");

        restartButton = new JButton("Try again");
        restartButton.addActionListener(this);
        restartButton.setFocusable(false);
        restartButton.setFont(new Font("Consolas", Font.PLAIN, 20));
        restartButton.setBackground(new Color(0x5305da));
        restartButton.setForeground(new Color(0xffffff));
        restartButton.setBorderPainted(false);
        restartButton.setOpaque(true);

        panel.add(restartButton);

        ImageIcon loseImage = new ImageIcon("java_tasks/src/p11/img/lose.png");
        winStatusIcon = new JLabel();
        winStatusIcon.setIcon(loseImage);

        panel.add(winStatusIcon);
        this.pack();
    }

    public void restartGame() {
        attempts = 3;
        number = (int)(Math.random() * MAX_VALUE);
        label.setText("You have " + ATTEMPTS_COUNT + " attempts");
        label2.setText("");
        panel.remove(restartButton);
        button.setEnabled(true);
        panel.remove(winStatusIcon);
        repaint();
    }
}
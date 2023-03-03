import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainMenu extends JFrame {

    MainMenu(){

        JLabel imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon("bia.png");
        imageLabel.setIcon(imageIcon);
        this.add(imageLabel);

        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Arial", Font.BOLD, 25));
        EventHandler handler = new EventHandler();
        button.addActionListener(handler);
        // Add button to frame
        this.add(button);
        this.setLayout(new FlowLayout());

        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,700);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.PINK);

    }

    // Event Handler
    private class EventHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           
            // open game frame
            new ColorMenu();
            // Close main menu frame
            dispose();
           
           
        }
    }

}
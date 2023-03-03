import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Component;

public class tryAgain extends JFrame{

 tryAgain(){

    JLabel imageLabel = new JLabel();
    
    ImageIcon imageIcon = new ImageIcon("bia2.png");
    imageLabel.setIcon(imageIcon);
    this.add(imageLabel);


    JLabel textLabel = new JLabel("Game Over kana Bhie");
    textLabel.setFont(new Font("sans-serif", Font.BOLD, 40));

    JButton tryAgainBtn = new JButton();
    tryAgainBtn.setText("TRY AGAIN");
    tryAgainBtn.setFont(new Font("Arial", Font.BOLD, 25));
    EventHandler handler = new EventHandler();
    tryAgainBtn.addActionListener(handler);


    JButton exitBtn = new JButton();
    exitBtn.setText("EXIT");
    exitBtn.setFont(new Font("Arial", Font.BOLD, 25));
    EventHandler1 handler1 = new EventHandler1();
    exitBtn.addActionListener(handler1);

    // Add button to frame
    this.add(tryAgainBtn);
    this.add(exitBtn);
    this.add(textLabel);
    this.setLayout(new FlowLayout());
    this.setTitle("Snake Game");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(500,670);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.setResizable(true);

    this.getContentPane().setBackground(Color.PINK);



 }

 private class EventHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        App.main(null);
        dispose();   
       
    }
}

private class EventHandler1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
   
        dispose();   
       
    }
}

    
}

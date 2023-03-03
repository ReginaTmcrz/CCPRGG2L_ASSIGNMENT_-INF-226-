import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListDataEvent;

public class ColorMenu extends JFrame{

    
    JList colorJList; 

    private String[] colorNameArray = {"Green", "Blue", "Yellow", "Orange", "Pink"};
    private Color[] colorClassArray = {Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.PINK};

    ColorMenu(){

    this.setLayout(new FlowLayout());
    this.setTitle("Snake Game");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(500,670);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.setResizable(true);
    this.getContentPane().setBackground(Color.PINK);


    JLabel label = new JLabel(); 
    label.setText("Choose Backgroud Color Bhie");
    label.setFont(new Font("Arial", Font.BOLD, 30));
    this.add(label);

    colorJList = new JList(colorNameArray);
    colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    colorJList.setFont(new Font("Arial", Font.BOLD, 40));

    BGColorEventHandler bgEventHandler = new BGColorEventHandler();
    colorJList.addListSelectionListener(bgEventHandler);
    this.add(colorJList);

  

    } 

    private class BGColorEventHandler implements ListSelectionListener{

        @Override
        public void valueChanged(ListSelectionEvent event) {

            GamePanel gp = new GamePanel();
            gp.gameBGColor = colorClassArray[colorJList.getSelectedIndex()];

            new GameFrame();
            dispose();

           
           
           
        }
    }
}

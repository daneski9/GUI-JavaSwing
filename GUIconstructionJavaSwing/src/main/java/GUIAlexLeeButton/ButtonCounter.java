package GUIAlexLeeButton;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonCounter implements ActionListener{ //gui object. contains frame, layout.
    
    int count = 0;
    JLabel label;
   
    public ButtonCounter(){ 
        JFrame frame = new JFrame(); //frame is basically the empty window, but we want to put stuff inside it (where the panel comes in)
        
        //button
        JButton button = new JButton("Click me");
        button.addActionListener(this); //using to record number of clicks. this means it goes to this class
       
        label = new JLabel("Number of clicks: 0");
       
        
        JPanel panel = new JPanel(); //layout. common series to do is -> set up border, set the layout, then add elements to the layout
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); //top, bottom, left, right
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(new Dimension(300, 300));
    }
    
    public static void main(String[] args) {
        new ButtonCounter(); //new GUI object  when we run the program. it makes a new GUI using the constructor above. which will bring up the window
        
    }

    @Override
    public void actionPerformed(ActionEvent e) { //once the button is click, the action is performed.
        count++;
        label.setText("Number of clicks: "+ count);
    }
}
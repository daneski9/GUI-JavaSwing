//Dane Coleman
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * A numeric keypad
 */
public class NumberPad extends JPanel {
    private ActionListener listener;
    
    public NumberPad(ActionListener listener){ //default constructor
        super();
        this.listener = listener;
        setupLayout();
        
    }
    /**
     * Setup and layout this NumberPad
     */
    private void setupLayout(){
        int count = 0;
        setLayout(new GridLayout(4, 3)); //4 rows, 3 columns
        
        
        
        //adding buttons
        for(int i = 0; i<3; i++){
            for(int j = 1; j < 4; j++){
                count++;
                JButton btn = new JButton(String.format("%d", count));
                btn.addActionListener(listener);
                add(btn); //Adding button to the panel. (extends JPanel)
             //   btn.addActionListener(this);
              //  add(new JButton(String.format("%d", count))); //Adding button to the panel. (extends JPanel)
            }
        }
        bottomRow(); //bottom buttons
       
    }
    private void bottomRow(){
       JButton btn = new JButton("Del");
       btn.addActionListener(listener);
       add(btn);
       btn = new JButton(String.format("%d", 0));
       btn.addActionListener(listener);
       add(btn);
       btn = new JButton("C");
       btn.addActionListener(listener);
       add(btn);
    }
    
}

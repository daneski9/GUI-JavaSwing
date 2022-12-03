//Dane Coleman
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * A window containing a PIN entry pad.
 */
public class PINPadWindow extends JFrame{
    /**
     * Default Constructor.
     */
    public PINPadWindow(){
        super();
        setupLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates the program on close, without it, the program is stuck and continues to run
        pack(); //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        setResizable(false);
    }
    /**
     * Setup and layout this PINPadWindow
     */
    private void setupLayout(){
        setPreferredSize(new Dimension(300,300)); //or setSize(300,300)
        Container   contentPane;
        NumberPad   numPad;  
        Display     displayAbove;
        
        displayAbove = new Display();                //initializing a Display(). JLabel
        numPad       = new NumberPad(displayAbove);  //initializing a NumberPad(). JPanel. Passing in display as a listener.
        contentPane  = getContentPane();             //initializing. 
        
        
        numPad.add(displayAbove); //adding display to panel
        add(numPad); //add numPad to JFrame
        contentPane.add(displayAbove, BorderLayout.NORTH); //add displayText north.

      
       
    }
}

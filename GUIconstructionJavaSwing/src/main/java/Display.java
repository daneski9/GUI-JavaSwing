//Dane Coleman
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Display extends JLabel implements ActionListener{
    private String pinNumber;
    public Display(){
       // super(" ");
        super("", SwingConstants.RIGHT); //constants display on right side of the bar (aligned right)
        setBorder(BorderFactory.createEtchedBorder());
        setPreferredSize(new Dimension(45,45)); //set size of display
        setText("Enter your pin");
        setForeground(Color.gray);
        
    }

    @Override
    public void actionPerformed(ActionEvent AE) {
        String cur = AE.getActionCommand(); //Returns the command string associated with this action.
        if(getText().equals("Enter your pin")){
            setText("");
        }
        
        if(cur.equals("C")){
            setText("");
        }
        if(cur.equals("Del")){
            setText(getText().substring(0, getText().length()-1));
        }
        else{
          setForeground(Color.red);
          setText(getText()+"*");
          pinNumber+=cur; //recording pin
        }
        if(getText().length()>3){
                setForeground(Color.magenta);
                setText("Authentication Successful");
        }
        
        
        
    }
  
    
    
}
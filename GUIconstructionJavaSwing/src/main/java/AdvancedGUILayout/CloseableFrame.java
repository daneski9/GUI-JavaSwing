package AdvancedGUILayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A JFrame that responds to WindowClosing events
 */
public class CloseableFrame extends    JFrame 
                            implements WindowListener
{


    /**
     * Construct a new CloseableFrame
     */
    public CloseableFrame()
    {
        super();
        ImageIcon   icon;
        String      lookAndFeel;
        
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);        


        icon = new ImageIcon("../icon.gif");
        setIconImage(icon.getImage());
        setSize(500,300);
        setTitle("James Madison University");

        addWindowListener(this);
    }



    /**
     * Handle windowClosing events (required by WindowListener)
     */
    public void windowClosing(WindowEvent e)
    {
       int        response;
       
       response = JOptionPane.showConfirmDialog(this,
                                                "Exit this application?",
                                                "Exit?", 
                                                JOptionPane.YES_NO_OPTION);

       if (response == JOptionPane.YES_OPTION)
       {
          dispose();          
          System.exit(0);
       }
    }


    /**
     * Handle other windowing events (required by WindowListener)
     */
    public void windowOpened(WindowEvent e){};
    public void windowClosed(WindowEvent e){};
    public void windowIconified(WindowEvent e){};
    public void windowDeiconified(WindowEvent e){};
    public void windowActivated(WindowEvent e){};
    public void windowDeactivated(WindowEvent e){};

}
                                   

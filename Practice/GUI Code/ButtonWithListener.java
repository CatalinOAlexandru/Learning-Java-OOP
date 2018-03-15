import java.awt.*;
import java.awt.event.*;

public class ButtonWithListener extends Frame implements ActionListener
{   
    public ButtonWithListener()
    {
       super("Simple Button GUI");
       setSize(100,100);
       Button b=new Button("Kill button");
       add(b);
       b.addActionListener(this);
       setVisible(true);
    }
     public void actionPerformed(ActionEvent e){
         e.getSource();
 
         System.out.println("the kill button has been pressed");
         System.exit(0);
        }
        
     public static void main(String[] args){
         new ButtonWithListener();
        }         
}

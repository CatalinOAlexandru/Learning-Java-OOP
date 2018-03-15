import java.awt.*;
import java.awt.event.*;
    public class ButtonTest extends Frame implements ActionListener{
        public static void main(String args[]) {
            ButtonTest f = new ButtonTest("Button Test GUI");
            f.setSize(150,100);
            f.setVisible(true);
            
        }
    
        public void actionPerformed(ActionEvent e){
         System.out.println("A");   
        }
    
    ButtonTest(String title) {
            super(title);
            setLayout(new FlowLayout());
            Button b1 = new Button("Test this too");
            Button b = new Button("Test this");
            add(b1);
            add(b);
            b.addActionListener(this);
        }
    }
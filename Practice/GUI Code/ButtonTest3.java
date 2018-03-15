import java.awt.*;
import java.awt.event.*;
    public class ButtonTest3 extends Frame{
         
        
        public static void main(String args[]) 
        {
            ButtonTest3 f= new ButtonTest3("Button Test GUI");
            f.setSize(150,100);
            f.setVisible(true);
            f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent ev) {
        System.exit(0);
      }
    });
        }
    
  public  ButtonTest3(String title) {
         super(title);
         setLayout(new FlowLayout());
         Button b = new Button("Change Gui");
         add(b);
         MyButtonListener listener = new MyButtonListener();
         b.addActionListener(listener);
     }
 

class MyButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
       ButtonTest f = new ButtonTest("Button Test GUI");
            f.setSize(150,100);
            f.setVisible(true);
        dispose();
    }
}

}



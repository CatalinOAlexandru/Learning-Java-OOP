import java.awt.*;
import java.awt.event.*;
    public class ButtonTest4 extends Frame{
         
        
        public static void main(String args[]) {
            ButtonTest4 f= new ButtonTest4("Button Test GUI");
            f.setSize(150,100);
            f.setVisible(true);
            f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent ev) {
        System.exit(0);
      }
    });
        }
    
  public  ButtonTest4(String title) {
         super(title);
         setLayout(new FlowLayout());
         Button b = new Button("Change Gui");
         add(b);

         b.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent evt) {
       ButtonTest f = new ButtonTest("Button Test GUI");
            f.setSize(150,100);
            f.setVisible(true);
        dispose();
    } });
     }
 


}



import java.awt.*;
import java.awt.event.*;
    public class ButtonTest2 extends Frame {
        public static void main(String args[]) {
            ButtonTest2 f = new ButtonTest2("Button Test GUI");
            f.setSize(150,100);
            f.setVisible(true);
        }
   
    public ButtonTest2(String title) {
        super(title);
        setLayout(new FlowLayout());
        Button b = new Button("End Program");
        add(b);
        //ButtonListener listener = new ButtonListener();
        b.addActionListener(new ActionListener(){  public void actionPerformed(ActionEvent evt) {
        System.out.println("I am finished now");
        System.exit(0); 
    }  });
    }



}

import java.awt.*;
import java.awt.event.*;

public class PhoneSolved {
        public static void main(String args[]) {
            Frame f = new PhoneFrame();
            f.pack();
            f.setVisible(true);
             f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent ev) {
        System.exit(0);
      }
    });
        }
    }
    
    class PhoneFrame extends Frame {
        
        private TextField tf;
        private Button b;
        
        public PhoneFrame() {

            Panel buttonPanel = new Panel();
            buttonPanel.setLayout(new GridLayout(4,3,10,10));
            for (int i = 1; i<=9; i++) {
                b = new Button(i+"");
                buttonPanel.add(b);
                b.addActionListener(new DialsListener());
            }
            buttonPanel.add(new Button("*"));
            b = new Button("0");
            buttonPanel.add(b);
            b.addActionListener(new DialsListener());
            buttonPanel.add(new Button("#"));
            
            Panel centerPanel = new Panel();
            centerPanel.setLayout(new FlowLayout());
            centerPanel.add(buttonPanel);
            add("Center", centerPanel);
            //add("Center", buttonPanel);
            
            Panel bottomPanel = new Panel();
            b = new Button("Dial");
            bottomPanel.add(b);
            b.addActionListener(new ButtonListener());
            add("South",bottomPanel);
            
            tf = new TextField("",10);
            tf.setEditable(false);
            add("North", tf);
        }
        
        class DialsListener implements ActionListener {
            public void actionPerformed(ActionEvent evt) {
                tf.setText((tf.getText())+(evt.getActionCommand()));
                //tf.setText((tf.getText())+(evt.getSource()));
            }
        }
        
        class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent evt) {
                tf.setText("");
               //try {
                  tf.setText("Dialing...");
               //    Thread.sleep(5000);
               //    tf.setText("");
                //}
               // catch (InterruptedException e){}
            }
        }
    }
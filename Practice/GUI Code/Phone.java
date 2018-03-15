import java.awt.*;


public class Phone {
        public static void main(String args[]) {
            Frame f = new PhoneFrame();
            f.pack();
            f.setVisible(true);
        }
    }
    
    class PhoneFrame extends Frame {
        
        private TextField tf;
        private Button b;
        
        public PhoneFrame() {

            Panel buttonPanel = new Panel();
            buttonPanel.setLayout(new GridLayout(4,3,5,5));
            for (int i = 1; i<=9; i++) {
                b = new Button(i+"");
                buttonPanel.add(b);
            }
            buttonPanel.add(new Button("*"));
            b = new Button("0");
            buttonPanel.add(b);
            buttonPanel.add(new Button("#"));
            
            Panel centerPanel = new Panel();
            centerPanel.setLayout(new FlowLayout());
            centerPanel.add(buttonPanel);
            add("Center", centerPanel);
            
            Panel bottomPanel = new Panel();
            b = new Button("Dial");
            bottomPanel.add(b);
            add("South",bottomPanel);
            
            tf = new TextField("",10);
            tf.setEditable(false);
            add("North", tf);
        }
    }
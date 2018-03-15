import java.awt.*;
import java.awt.event.*;

    public class TestMsg {
        public static void main(String args[]) {
            Frame f = new MsgFrame("Print Messages");
            f.setSize(350,200);
            f.setVisible(true);
             f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent ev) {
        System.exit(0);
      }
    });
        }
    }

    class MsgFrame extends Frame {
        Choice msgChoice = new Choice();
        
        public MsgFrame(String title) {
            super(title);
            setLayout(new FlowLayout());
            Label l = new Label("Choose the item you want to display: ");
            add(l);
            msgChoice.add("Hello");
            msgChoice.add("Nice to meet you");
            msgChoice.add("Goodbye");
            add(msgChoice);
            MyChoiceListener listener = new MyChoiceListener();
            msgChoice.addItemListener(listener);
        }
    
// This is the Listener for the Choice List
class MyChoiceListener implements ItemListener {
    public void itemStateChanged(ItemEvent evt) {
        System.out.println(msgChoice.getSelectedItem());
    }
}
}

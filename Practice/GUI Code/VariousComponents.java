import java.awt.*;
    public class VariousComponents {
        public static void main(String args[]) {
            Frame f = new TestFrame("Various GUI Components");
            f.setSize(500,400);
            f.setVisible(true);
        }
    }
    
    class TestFrame extends Frame {
        public TestFrame(String title) {
            super(title);
            setLayout(new FlowLayout());
            
            Label l = new Label("Button");
            add(l);
            Button b = new Button("Button");
            add(b);
            
            Checkbox c = new Checkbox("Checkbox");
            add(c);
            
            CheckboxGroup musicGroup = new CheckboxGroup();
            Checkbox c1 = new Checkbox("Jazz",musicGroup,false);
            Checkbox c2 = new Checkbox("Blues",musicGroup,true);
            Checkbox c3 = new Checkbox("Rock",musicGroup,false);
            add(c1); add(c2); add(c3);
            
            Label l1 = new Label("Choice items");
            add(l1);
            Choice msgChoice = new Choice();
            msgChoice.add("Hello");
            msgChoice.add("Nice to meet you");
            msgChoice.add("Goodbye");
             msgChoice.add("another Goodbye");
            add(msgChoice);
            
            
            Label l2 = new Label("List items");
            add(l2);
            List sample = new List();
            sample.add("A");sample.add("E"); 
            sample.add("B");sample.add("F");
            sample.add("C");sample.add("G");
            sample.add("D");
            add(sample);
            
            Label l4 = new Label("Text Area");
            add(l4);
            TextArea ta = new TextArea(10,20);
            add(ta);
           
           TextField tf = new TextField("A TextField",15);
           tf.setEditable(false);
           add(tf);

            
        }
    }
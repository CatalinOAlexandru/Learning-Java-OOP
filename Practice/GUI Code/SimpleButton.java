import java.awt.*;

public class SimpleButton extends Frame
{
    
    public SimpleButton()
    {
      super("TEST Button");
      setSize(100,100);
      Button b=new Button("this button does nothing");
      add(b);
      setVisible(true);
    }

    public static void main(String[] args){
      new SimpleButton();
    }
}

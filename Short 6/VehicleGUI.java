import java.awt.*;
import java.awt.event.*;

public class VehicleGUI extends Frame implements ActionListener
{
    private TextField tf = new TextField(15);
    private Button car;
    private Button van;

    public VehicleGUI()
    {
        super("OOP GUI");
        setSize(400,150);
        
        setLayout(new FlowLayout());
        
        car = new Button("Sport Car");
        add(car);
        car.addActionListener(this);
        
        van = new Button("Van");
        add(van);
        van.addActionListener(this);
        
        add(tf);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("button pressed");
        
    }
    public static void main(String[] START)
    {
        new VehicleGUI();
    }
}

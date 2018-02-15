import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener
{
    JFrame frame;
    JPanel panel;
    JTextField hptext;
    JTextField aerotext;
    JTextField weighttext;
    JTextField speedtext;
    
    JTextField displaycons;
    
    JButton b1;
    JButton b2;
    JLabel hplab;
    JLabel aerolab;
    JLabel weightlab;
    JLabel speedlab;
    
    JLabel consumption;
    
    public GUI()
    {
        window();

    }
    
    public void window()
    {
        frame = new JFrame("Exercise 6");
        frame.setVisible(true);
        frame.setSize(800,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(3,4));
        
        hptext = new JTextField(10);
        aerotext = new JTextField(10);
        weighttext = new JTextField(10);
        speedtext = new JTextField(10);
        displaycons = new JTextField("0",10);

        b1 = new JButton("Create new Vehicle");
        b2 = new JButton("Create new Van");
        
        hplab = new JLabel("Horsepower");
        aerolab = new JLabel("Aerodynamics");
        weightlab = new JLabel("Weight");
        speedlab = new JLabel("Top Speed");
        consumption = new JLabel("Consumpotion: ");
        
        panel.add(hplab);
        panel.add(aerolab);
        panel.add(weightlab);
        panel.add(speedlab);
        
        panel.add(hptext);
        panel.add(aerotext);
        panel.add(weighttext);
        panel.add(speedtext);
        
        panel.add(b1);
        panel.add(b2);
        
        panel.add(consumption);
        panel.add(displaycons);
        
        
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String input;
                input = hptext.getText();
                
                displaycons.setText(input + "SportCar object has been created");

            }
        });
        
        frame.add(panel);

    }
    
    public void actionPerformed(ActionEvent e)
    {
        String input;
        input = hptext.getText();
        
        JFrame frame2 = new JFrame("Button clicked");
        frame2.setVisible(true);
        frame2.setSize(200,200);
        
        JLabel lab = new JLabel("You clicked me");
        JPanel p = new JPanel();
        
        
        
        
        frame2.add(p);
        p.add(lab);
        
    }
    
    public static void main(String[] args)
    {
        new GUI();
    }
}

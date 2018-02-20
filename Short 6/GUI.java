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
    
    JTextField displayCons;
    JTextField displayInfo;
    JTextField displayAcc;
    JTextField displayCarry;
    
    JButton b1;
    JButton b2;
    JLabel hplab;
    JLabel aerolab;
    JLabel weightlab;
    JLabel speedlab;
    
    JLabel consumption;
    JLabel information;
    JLabel acceleration;
    JLabel carry;
    
    public GUI()
    {
        window();

    }
    
    public void window()
    {
        frame = new JFrame("OOP - Short 6");
        frame.setVisible(true);
        frame.setSize(430,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        panel = new JPanel();
        panel.setLayout(new GridLayout(11,2));
        
        
        
        hplab = new JLabel("Horsepower");
        panel.add(hplab);
        hptext = new JTextField(10);
        panel.add(hptext);
        
        aerolab = new JLabel("Aerodynamics");
        panel.add(aerolab);
        aerotext = new JTextField(10);
        panel.add(aerotext);
        
        weightlab = new JLabel("Weight");
        panel.add(weightlab);
        weighttext = new JTextField(10);
        panel.add(weighttext);
        
        speedlab = new JLabel("Top Speed");
        panel.add(speedlab);
        speedtext = new JTextField(10);
        panel.add(speedtext);
        
        panel.add(Box.createVerticalStrut(10));
        panel.add(Box.createVerticalStrut(10));

        displayCons = new JTextField("",10);
        consumption = new JLabel("Consumpotion");        
        panel.add(consumption);
        panel.add(displayCons);
        
        displayAcc = new JTextField("",10);
        acceleration = new JLabel("Acceleration");        
        panel.add(acceleration);
        panel.add(displayAcc);
        
        displayCarry = new JTextField("",10);
        carry = new JLabel("Carry Weight");        
        panel.add(carry);
        panel.add(displayCarry);
        
        panel.add(Box.createVerticalStrut(10));
        panel.add(Box.createVerticalStrut(10));
        
        b1 = new JButton("New Sport Car");
        b2 = new JButton("New Van");
        panel.add(b1);
        panel.add(b2);
        
        displayInfo = new JTextField("",10);
        information = new JLabel("Information");        
        panel.add(information);
        panel.add(displayInfo);
        
        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                SportCar scar1 = new SportCar(200,220,1500);

                displayInfo.setText(" A SportCar object has been created");
                
                hptext.setText(String.valueOf(scar1.getHorsepower()));
                aerotext.setText(String.valueOf(scar1.getAerodynamics()));
                weighttext.setText(String.valueOf(scar1.getWeight()));
                speedtext.setText(String.valueOf(scar1.getTopspeedCar()));
                
                double carConsumption1=(1000+(scar1.getWeight()/5))*(scar1.getTopspeedCar()/100)*(scar1.getAerodynamics()*scar1.getHorsepower())/10000;
                String result = String.format("%.2f", carConsumption1);
                displayCons.setText(result);
                displayAcc.setText(String.valueOf(scar1.acceleration()));
                displayCarry.setText("Not Available");
            }
        });   
        
        b2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Van van1 = new Van(100, 3500, 160.4, 100);
                
                displayInfo.setText(" A Van object has been created");

                hptext.setText(String.valueOf(van1.getHorsepower()));
                aerotext.setText(String.valueOf(van1.getAerodynamics()));
                weighttext.setText(String.valueOf(van1.getWeight()));
                speedtext.setText(String.valueOf(van1.getTopspeedVan()));
                
                double vanConsumption1=(1000+(van1.getWeight()/5))*(van1.getTopspeedVan()/100)*(van1.getAerodynamics()*van1.getHorsepower())/10000;
                String result = String.format("%.2f", vanConsumption1);
                displayCons.setText(result);
                displayAcc.setText(String.valueOf(van1.acceleration()));
                displayCarry.setText(String.valueOf(van1.getCarryweight()));
            }
        });  
        
        frame.add(panel);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        // Only to allow the actionPerformer above to work
    }
    
    public static void main(String[] START)
    {
        new GUI();
    }
}

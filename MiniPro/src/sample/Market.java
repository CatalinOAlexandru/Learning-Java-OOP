package sample;

import java.util.*;
import java.text.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Market extends Controller
{
    protected double Value;
    protected double HighestValue;
    protected double Volume;
    protected double M24High;
    protected double M24Low;
    
    public Market(double inValue, double inHighestValue, double inVolume, double inM24High, double inM24Low)
    {
        Value = inValue;
        HighestValue = inHighestValue;  
        Volume = inVolume;
        M24High = inM24High;
        M24Low = inM24Low;
    }
    public double getValue()
    {
        return Value;
    }
    public double getHighestValue()
    {
        return HighestValue;
    }
    public double getVolume()
    {
        return Volume;
    }
    public double getM24High()
    {
        return M24High;
    }
    public double getM24Low()
    {
        return M24Low;
    }
    
    public double buy(double Amount, double capital, String marketName){ //under construction

        TextArea terminal = (TextArea) SimulatorGUI.sceneWindow.lookup("#terminal");

        Double buyMarket = Amount * getValue();
        String ans;
        ans = "yes";
        if(ans.equalsIgnoreCase("yes"))
        {
            terminal.appendText(getTime() + "We are processing a transaction worth: " + buyMarket + " USD\n");
            capital = capital - buyMarket;
            if(capital < 0)
            {
                capital = capital + buyMarket;
                terminal.appendText(getTime() + "Sorry, but you dont have enoght money to buy " + Amount + " coin(s).\n");
            }
            else
            {
                terminal.appendText(getTime() + "You now own " + Amount + " Coins/Shares which are worth " + buyMarket + " USD\n");
                terminal.appendText(getTime() + "Your new capital is: " + capital + " USD\n");
            }
        }
        else
        {
            terminal.appendText(getTime() + "We cancelled your transaction. You were not charged.\n");
        }
        return capital;
    }

    public static String getTime()
    {
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("hh:mm:ss");
        return ("[" + ft.format(dNow)+ "] ");
    }

    public double sell(double Amount, double capital, String marketName, Double SharesOwned){ //under construction

        TextArea terminal = (TextArea) SimulatorGUI.sceneWindow.lookup("#terminal");
        Double sellMarket = Amount * getValue();
        String ans;

        if((SharesOwned - Amount) < 0)
        {
            terminal.appendText(getTime() + "Sorry, but you don't have enough Coins/Shares to proceed with this transaction\n");
            return -9999.01; //used in simulator.java as a confirmation that the transaction failed
        }
        else {
            ans = "yes";
            if (ans.equalsIgnoreCase("yes")) {
                terminal.appendText(getTime() + "We are processing a transaction worth: " + sellMarket + " USD.\n");
                capital = capital + sellMarket;

                terminal.appendText(getTime() + "Your new capital is: " + capital + " USD.\n");
            } else {
                terminal.appendText(getTime() + "We cancelled your transaction. You were not charged.\n");
            }
            return capital;
        }
    }
    
    public static String InputString(String s)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);
        return scanner.nextLine();
    } // END Input String
}

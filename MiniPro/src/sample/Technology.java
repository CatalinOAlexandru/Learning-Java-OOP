/* Author - Catalin Alexandru
Mini Project
*/
package sample;
import java.util.*; // it imports the entire java util library and makes it available to use

public class Technology extends Market
{

    public Technology(double value, double HighestValue, double Volume, double M24High, double M24Low)
    {
        super(value, HighestValue, Volume, M24High, M24Low);
    }   
    /*
    public String getTechName()
    {
        return TechName;
    }
    public double getTechValue()
    {
        return TechValue;
    }
    public void setTechValue(double value)
    {
        TechValue = value;
    }*/
}

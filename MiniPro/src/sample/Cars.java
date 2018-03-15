/* Author - Catalin Alexandru
Mini Project
*/
package sample;
import java.util.*; // it imports the entire java util library and makes it available to use

public class Cars extends Market
{
    public Cars(double value, double HighestValue, double Volume, double M24High, double M24Low)
    {
        super(value, HighestValue, Volume, M24High, M24Low);
    }   
    /*
    public String getMetalName()
    {
        return MetalName;
    }
    public double getMetalValue()
    {
        return MetalValue;
    }
    public void setMetalsVAlue(double value)
    {
        MetalValue = value;
    }*/
}
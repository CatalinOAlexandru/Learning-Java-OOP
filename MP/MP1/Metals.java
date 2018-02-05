/* Author - Catalin Alexandru
Mini Project
*/

import java.util.*; // it imports the entire java util library and makes it available to use

public class Metals
{
    protected String MetalName;
    protected double MetalValue;
    protected int MetalAmount;
    public Metals()
    {
    }   
    public Metals(String name, double value, int amount)
    {
        MetalName = name;
        MetalValue = value;
        MetalAmount = amount;
    }   
    public String getMetalName()
    {
        return MetalName;
    }
    public double getMetalValue()
    {
        return MetalValue;
    }
    public int getMetalsAmount()
    {
        return MetalAmount;
    }
}
/* Author - Catalin Alexandru
Mini Project
*/

import java.util.*; // it imports the entire java util library and makes it available to use

public class Technology
{
    protected String TechName;
    protected double TechValue;
    protected int TechAmount;
    public Technology()
    {
    }   
    public Technology(String name, double value, int amount)
    {
        TechName = name;
        TechValue = value;
        TechAmount = amount;
    }   
    public String getTechName()
    {
        return TechName;
    }
    public double getTechValue()
    {
        return TechValue;
    }
    public int getTechAmount()
    {
        return TechAmount;
    }
}

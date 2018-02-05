/* Author - Catalin Alexandru
Mini Project
*/

import java.util.*; // it imports the entire java util library and makes it available to use

public class Technology
{
    protected String TechName;
    protected double TechValue;
    public Technology()
    {
    }   
    public Technology(String name, double value)
    {
        TechName = name;
        TechValue = value;
    }   
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
    }
}

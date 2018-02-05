/* Author - Catalin Alexandru
Mini Project
*/

import java.util.*; // it imports the entire java util library and makes it available to use

public class Crypto
{
    protected String CryptoName;
    protected double CryptoValue;
    public Crypto()
    {
    }  
    public Crypto(String name, double value)
    {
        CryptoName = name;
        CryptoValue = value;
    }   
    public String getCryptoName()
    {
        return CryptoName;
    }
    public double getCryptoValue()
    {
        return CryptoValue;
    }
    public void setCryptoValue(double value)
    {
        CryptoValue = value;
    }
}

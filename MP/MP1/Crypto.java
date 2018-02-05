/* Author - Catalin Alexandru
Mini Project
*/

import java.util.*; // it imports the entire java util library and makes it available to use

public class Crypto
{
    protected String CryptoName;
    protected double CryptoValue;
    protected int CryptoAmount;
    public Crypto()
    {
    }  
    public Crypto(String name, double value, int amount)
    {
        CryptoName = name;
        CryptoValue = value;
        CryptoAmount = amount;
    }   
    public String getCryptoName()
    {
        return CryptoName;
    }
    public double getCryptoValue()
    {
        return CryptoValue;
    }
    public int getCryptoAmount()
    {
        return CryptoAmount;
    }
}

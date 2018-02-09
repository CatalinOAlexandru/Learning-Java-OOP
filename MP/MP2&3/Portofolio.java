/* Author - Catalin Alexandru
Mini Project
*/

public class Portofolio
{
    protected String userName;
    protected double userCapital;
    protected double Bitcoin;
    protected double Litecoin;
    protected double Ethereum;

    public Portofolio(String name, double capital)
    {
       userName = name;
       userCapital = capital;
       Bitcoin = 0.0;
       Litecoin= 0.0;
       Ethereum = 0.0;
    }
    public void setUserName(String name)
    {
       userName = name; 
    }
    public void setUserCapital(double money)
    {
        userCapital = money;
    }
    public void setBitcoin(double amount)
    {
        Bitcoin = amount;
    }
    public void setLitecoin(double amount)
    {
        Bitcoin = amount;
    }
    public void setEthereum(double amount)
    {
        Bitcoin = amount;
    }
    public String getUserName()
    {
        return userName;
    }
    public double getUserCapital()
    {
        return userCapital;
    }
    public double getBitcoin()
    {
        return Bitcoin;
    }
    public double getLitecoin()
    {
        return Litecoin;
    }
    public double getEthereum()
    {
        return Ethereum;
    }
}

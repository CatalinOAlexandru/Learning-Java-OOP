/* Author - Catalin Alexandru
Mini Project
*/

package sample;
public class Portofolio
{
    protected String userName;
    protected double userCapital;
    protected double Bitcoin;
    protected double Litecoin;
    protected double Ethereum;
    protected double Apple;
    protected double Samsung;
    protected double Google;
    protected double Porsche;
    protected double Volkswagen;
    protected double Audi;

    public Portofolio(String name, double capital)
    {
       userName = name;
       userCapital = capital;
       Bitcoin = 0.0;
       Litecoin= 0.0;
       Ethereum = 0.0;
       Apple = 0.0;
       Samsung = 0.0;
       Google = 0.0;
       Porsche = 0.0;
       Volkswagen = 0.0;
       Audi = 0.0;
       
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
    public void setApple(double amount)
    {
        Apple = amount;
    }
    public void setSamsung(double amount)
    {
        Samsung = amount;
    }
    public void setGoogle(double amount)
    {
        Google = amount;
    }
    public void setPorsche(double amount)
    {
        Porsche = amount;
    }
    public void setWolkswagen(double amount)
    {
        Volkswagen = amount;
    }
    public void setAudi(double amount)
    {
        Audi = amount;
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
    public double getApple()
    {
        return Apple;
    }
    public double getSamsung()
    {
        return Samsung;
    }
    public double getGoogle()
    {
        return Google;
    }
    public double getPorsche()
    {
        return Porsche;
    }
    public double getVolkswagen()
    {
        return Volkswagen;
    }
    public double getAudi()
    {
        return Audi;
    }
}

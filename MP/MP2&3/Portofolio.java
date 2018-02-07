/* Author - Catalin Alexandru
Mini Project
*/

public class Portofolio
{
    protected String userName;
    protected double userCapital;
    protected double Bitcoin;

    public Portofolio()
    {
        userName = "";
        userCapital = 0.0;
        Bitcoin = 0.0;
    }
    public Portofolio(String name, double capital)
    {
       String userName = name;
       double userCapital = capital;
       Bitcoin = 0.0;
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
}

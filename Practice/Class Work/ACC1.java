public class ACC1
{
    private double balance; // instance variable
    
    public ACC1()
    {
        balance = 0;
    }
    
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void close()
    {
        balance = 0;
    }
    
    public double getBalance()
    {
        return balance;
    }
}
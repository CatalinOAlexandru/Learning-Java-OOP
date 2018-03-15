public class SavingAccount extends Account
{
    private double interestRate;
    
    public SavingAccount()
    {
        interestRate = 0;
    }
    
    public double getInterestRate()
    {
        return interestRate;
    }
    
    public void setInterestRate(double d)
    {
        interestRate = d;
    }
    
    public void printStatement()
    {
        super.printStatement();
        System.out.println("The current interest rate is: " + interestRate);
    }
}
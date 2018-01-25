public class Account
{
   
    
    //instance variables
    protected double balance;
    private double interest;
    //constructors
    public Account(double initialBalance) 
    {
        balance = initialBalance;
        if(balance < 0)
        {
            System.out.println("Sorry, but you can't open an Account with a negative balance");
            balance = 0.0;
            System.out.println("Your current balance is 0.0");
        }
    }
    public Account() 
    {
        balance = 0.0;
    } 
    //instance methods
    public void printStatement()
    {
     System.out.println("Current balance is: " + balance);   
    }
    
    public void withdraw(double amount) 
    {
        //amount = square(amount);
        balance -= amount;
        if(balance < 0)
        {
            balance += amount;
            System.out.println("Your current balance is " +balance+ ".");
            System.out.println("Sorry, but you can't withdraw "+amount+" and go under 0.");
            
        }
    }
    public void deposit(double amount) 
    {
        balance +=amount;
        if(balance > 100000)
        {
            System.out.println("You are now rich!");
        }
    }
    public double getBalance() 
    {
        return balance;
    }
    public void setInterest(double rate)
    {
        interest = rate/100;
        System.out.println("The interest was set to: " + rate + "%");
    }
    public double computeInterest(int n)
    {
        double compBalance = balance * Math.pow((1 + interest), (n/12));
        return compBalance;
    }
    public void close() 
    {
        balance = 0.0;
    }
    
    public static double square(double d)
    {
        d = d * d;
        return d;
    }
}
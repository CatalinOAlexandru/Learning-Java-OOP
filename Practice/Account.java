public class Account
{
	//instance variables
	private double balance;
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
	public void withdraw(double amount) 
	{
		balance -=amount;
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
	public void close() 
	{
		balance = 0.0;
	}
}
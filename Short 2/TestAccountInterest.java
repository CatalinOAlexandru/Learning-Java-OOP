
import java.util.*; // it imports the entire java util library and makes it available to use

public class TestAccountInterest
{
    public static void main(String[] CCTV)
    {
        Account account1 = new Account(500);
        Print("\n\n\nINFO: account1 was setup with a balance of 500");
        Account account2 = new Account(100);
        Print("INFO: account2 was setup with a balance of 100");
        
        account1.setInterest(InputDouble("\nWhat is the interest rate for account 1 ?"));
        account2.setInterest(InputDouble("\nWhat is the interest rate for account 2 ?"));
        
        Print("\nThe balance + interest for account 1 after 12 months is: ");
        PrintDouble(account1.computeInterest(12)); // Compute acc1 for 12 months
        
        Print("\nThe balance + interest for account 1 after 24 months is: ");
        PrintDouble(account1.computeInterest(24)); // Compute acc1 for 24 months
        
        Print("\nThe balance + interest for account 2 after 12 months is: ");
        PrintDouble(account2.computeInterest(12)); // Compute acc2 for 12 months
        
        Print("\nThe balance + interest for account 2 after 24 months is: ");
        PrintDouble(account2.computeInterest(24)); // Compute acc2 for 24 months
        
    }
    
    // a method which will allow me to print messages faster
    public static void Print(String p)
	{
		System.out.println(p);
		return;
	} // END Print

	// a method which will allow me to print numbers faster
	public static void PrintDouble(double pi)
	{
		System.out.print(pi);
		return;
	} // END Print

	// a method which will allow me to get a string input from the user faster
	public static String InputString(String s)
	{
		Scanner scanner = new Scanner(System.in);
		Print(s);
		return scanner.nextLine();
	} // END Input String

	// a method which will allow me to get a integer input from the user faster
	public static double InputDouble(String message)
	{
		Scanner scanner = new Scanner(System.in);
		Print(message);
		return Double.parseDouble(scanner.nextLine());
	} // END Input Integer
}

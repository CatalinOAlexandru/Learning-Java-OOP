import java.util.*; //Allows me to get input from the user

public class Market
{
    protected double Value;
    protected double HighestValue;
    protected double Volume;
    protected double M24High;
    protected double M24Low;
    
    public Market(double inValue, double inHighestValue, double inVolume, double inM24High, double inM24Low)
    {
        Value = inValue;
        HighestValue = inHighestValue;  
        Volume = inVolume;
        M24High = inM24High;
        M24Low = inM24Low;
    }
    public double getValue()
    {
        return Value;
    }
    public double getHighestValue()
    {
        return HighestValue;
    }
    public double getVolume()
    {
        return Volume;
    }
    public double getM24High()
    {
        return M24High;
    }
    public double getM24Low()
    {
        return M24Low;
    }
    
    public double buy(double Amount, double capital, String marketName){ //under construction
        Double buyMarket = Amount * getValue();
        String ans;
        ans = InputString("Are you sure you want to buy " +Amount+ " units of " +marketName+ " for " +buyMarket+" USD? Write YES to continue.");
        if(ans.equalsIgnoreCase("yes"))
        {
            System.out.print("We are processing a transaction worth: " + buyMarket);
            capital = capital - buyMarket;
            if(capital < 0)
            {
                capital = capital + buyMarket;
                System.out.println("\nSorry, but you dont have enoght money to buy " + Amount + " coin(s).");
            }
            else
            {
                System.out.println("\n\nYou now own " + Amount + " which are worth " + buyMarket + " USD");
                System.out.println("Your new capital is: " + capital);
            }
        }
        else
        {
            System.out.println("\nWe cancelled your transaction. You were not charged.");
        }
        return capital;
    }
    
    public double sell(double Amount, double capital, String marketName, Double SharesOwned){ //under construction
        Double sellMarket = Amount * getValue();
        String ans;

        if((SharesOwned - Amount) < 0)
        {
            System.out.println("Sorry, but you dont have enough Coins/Shares to procede with this transaction");
            return -9999.01; //used in simulator.java as a confirmation that the transaction failed
        }
        else {
            ans = InputString("Are you sure you want to sell " + Amount + " units of " + marketName + " for " + sellMarket + " USD? Write YES to continue.");
            if (ans.equalsIgnoreCase("yes")) {
                System.out.print("We are processing a transaction worth: " + sellMarket);
                capital = capital + sellMarket;

                System.out.println("Your new capital is: " + capital);
            } else {
                System.out.println("\nWe cancelled your transaction. You were not charged.");
            }
            return capital;
        }
    }
    
    public static String InputString(String s)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);
        return scanner.nextLine();
    } // END Input String
}

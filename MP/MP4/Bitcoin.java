/* Author - Catalin Alexandru
Mini Project
*/

public class Bitcoin extends Crypto
{
    /*protected double BitcoinValue = 8009.22;
    protected double BitcoinHighestValue = 20105.76;
    protected double BitcoinVolume = 5000000.54;
    protected double Bitcoin24High = 9045.01;
    protected double Bitcoin24Low = 6922.32;
*/  
    public Bitcoin()
    {
        super(8009.22, 20105.76, 10047800000.2, 9045.01, 9622.32);
    }
    /*
    public double buy(double Amount, double capital){ //under construction
        Double buyBitcoin = Amount * getValue();
        System.out.print("We are processing a transaction worth: " + buyBitcoin);
        capital -= buyBitcoin;
        if(capital < 0)
        {
            capital += buyBitcoin;
            System.out.println("Sorry, but you dont have enoght money to buy " + Amount + " coins");
        }
        else
        {
            System.out.println("You now own " + Amount + " which are worth " + buyBitcoin + " USD");
        }
            return capital;
    }
    
    public double sell(double Amount, double capital){ //under construction
        Double sellBitcoin = Amount * getValue();
        System.out.print("We are processing a transaction of " + sellBitcoin);
        capital += sellBitcoin;
        if(Amount <= 0)
        {
            capital -= sellBitcoin;
            System.out.print("Sorry but the number must be bigger than 0");
        }
        else
        {
            System.out.println("You sold " + Amount + " coins which are worth " + sellBitcoin + " USD");
        }
            return capital;
    }
    */
}

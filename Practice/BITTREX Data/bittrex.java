import bittrex;

public class bittrex
{
	// PUBLIC
    public static void main(String[] args) 
    {
    
	    bittrexData data = new bittrexData();
	    
	    data.set(bittrexAPI.getMarkets());
	    
	    for(int b = 0; b < data.size(); b++) 
	    {
		    System.out.println( data.get( b , "BTC-LTC") );
	    }
	    
	    /* OUTPUT
	      BTC-LTC
	      BTC-DOGE
	      ...
	    */
     }
}
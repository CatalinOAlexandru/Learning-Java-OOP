import java.util.*; //Allows me to get input from the user
public class Simulator
{
    public static void main(String[] CCTV)
    {
        Print("\nWelcome to the Stock Market");
        
        String name = InputString("What is your name?");
        double money = InputDouble("How much money do you have?");
        Portofolio user1 = new Portofolio(name, money);
        Print("Your account is fully setup!");
        
        Print("\nThese are the Markets you can invest: Crypto | Technology | Metals");
        
        boolean rightInput = false; // boolean created so we can see whether the user has entered the right input 
        while(rightInput==false)    //While statement has been added in case that the users enter the wrong input.
        {
            String ans = InputString("Which stock market do you want to trade?");
            if(ans.equalsIgnoreCase("crypto")) 
            {
                Print("You have selected the Crypto-Currency Market.\n");
                rightInput=true; //right input
                Crypto(user1);
                System.exit(0);
            }
            else if(ans.equalsIgnoreCase("technology"))
            {
                Print("You have selected the Technology Market.\n");
                rightInput=true; //right input
                Technology();
                System.exit(0);
            }
            else if(ans.equalsIgnoreCase("metals"))
            {
                System.out.println("You have selected the Metals Market.\n");
                rightInput=true; //right input
                Metals();
                System.exit(0);
            }
            else
            {
                System.out.println("You have entered the wrong input, let's try that again.");
            }
        }
        
    }
    
    public static void Crypto(Portofolio user1)
    {
       String ans;
       Crypto Coin1;
       while(true)
       {
           ans = InputString("Which Crypto-Currency do you want to invest in? Bitcoin | Litecoin | Ethereum");
           if(ans.equalsIgnoreCase("bitcoin"))
           {
               Coin1 = new Bitcoin();
               break;
           }
           else if(ans.equalsIgnoreCase("litecoin"))
           {
                Coin1 = new Bitcoin(); // needs change
                break;
           }
           else if(ans.equalsIgnoreCase("bitcoin"))
           {
                Coin1 = new Bitcoin(); // needs change
                break;
           }
           else  
           {
                Print("Sorry, we dont support this coin at this moment. Please try again.");
                  
           }
       }
               
       Print("Statistics:");
       System.out.println("Current Value: "+Coin1.getCryptoValue());
       System.out.println("Highest Value recorded: "+Coin1.getCryptoHighestValue());
       System.out.println("Highest Value in the last 24 hours: "+Coin1.getCrypto24High());
       System.out.println("Lowest Value in the last 24 hours: "+Coin1.getCrypto24Low());
       
       int coinsToBuy = InputInt("\nHow many Bitcoins do you want to buy?");
       Double newCapital = Coin1.buy(coinsToBuy, user1.getUserCapital());
       user1.setBitcoin(coinsToBuy);
       
    }
    
    public static void Technology()
    {Print("This market is not ready to be used.");}
    
    public static void Metals()
    {Print("This market is not ready to be used.");}
    
    // a method which will allow me to print messages faster
    public static void Print(String p)
    {
        System.out.println(p);
        return;
    } // END Print
    // a method which will allow me to print numbers faster
    public static void PrintInt(int pi)
    {
        System.out.println(pi);
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
    public static int InputInt(String message)
    {
        Scanner scanner = new Scanner(System.in);
        Print(message);
        return Integer.parseInt(scanner.nextLine());
    } // END Input Integer
    
    public static double InputDouble(String message)
    {
        Scanner scanner = new Scanner(System.in);
        Print(message);
        return Double.parseDouble(scanner.nextLine());
    } // END Input Integer
}
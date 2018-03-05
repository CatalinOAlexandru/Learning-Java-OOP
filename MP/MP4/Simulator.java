import java.util.*; //Allows me to get input from the user

//import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;
public class Simulator
{
    public static void main(String[] START)
    {
        Print("\nWelcome to the Stock Market");

        String name = InputString("What is your name?");
        double money;
        while(true)
        {   
            try
            {
                money = InputDouble("How much money (USD) do you have?");
                break;
            }
            catch(Exception e)
            {
                Print("ERROR: Wrong Value. Please input a sum of money.");
            }
        }
        Portofolio user1 = new Portofolio(name, money);
        Print("Your account is fully setup!");
            
        Print("\nThese are the Markets you can invest: Crypto | Technology | Cars");
            
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
            else if(ans.equalsIgnoreCase("technology") || ans.equalsIgnoreCase("tech"))
            {
                Print("You have selected the Technology Market.\n");
                rightInput=true; //right input
                Technology(user1);
                System.exit(0);
                }
                else if(ans.equalsIgnoreCase("cars"))
                {
                    System.out.println("You have selected the Car Manufacturers Market.\n");
                    rightInput=true; //right input
                    Cars(user1);
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
        Market Coin1;
        while(true)
        {
            ans = InputString("In which Crypto-Currency do you want to invest in? Bitcoin(BTC) | Litecoin(LTC) | Ethereum(ETH)");
            if(ans.equalsIgnoreCase("bitcoin") || ans.equalsIgnoreCase("btc"))
            {
                Coin1 = new Bitcoin();
                ans = "Bitcoin";
                break;
            }
            else if(ans.equalsIgnoreCase("litecoin") || ans.equalsIgnoreCase("ltc"))
            {
                    Coin1 = new Litecoin(); 
                    ans = "Litecoin";
                    break;
            }
            else if(ans.equalsIgnoreCase("ethereum") || ans.equalsIgnoreCase("eth"))
            {
                    Coin1 = new Ethereum();
                    ans = "Ethereum";
                    break;
            }
            else  
            {
                    Print("Sorry, we dont support this coin at this moment. Please try again.");
                    
            }
        }
               
        Print("\nStatistics at this moment:");
        System.out.println("Current Value: "+Coin1.getValue());
        System.out.println("Highest Value recorded: "+Coin1.getHighestValue());
        System.out.println("Highest Value in the last 24 hours: "+Coin1.getM24High());
        System.out.println("Lowest Value in the last 24 hours: "+Coin1.getM24Low());
        
        // Marketing Stage 1
        buyShares(user1, ans, Coin1); // the account is on 0, so we need to buy something.
       
        // Marketing Stage 2
        while(true)
        {
            String ansContinue = InputString("\nDo you want to do any other transactions?");
            if(ansContinue.equalsIgnoreCase("yes") || ansContinue.equalsIgnoreCase("y"))
            {
                continueTransaction(user1, ans, Coin1);
                break;
            }
            else if(ansContinue.equalsIgnoreCase("no") || ansContinue.equalsIgnoreCase("n"))
            {
                Print("\nThank you for using the App\n");
                System.exit(0);
            }
            else
            {
                Print("Please answer with Yes/No");
            }
        }

    }
    
    public static void buyShares(Portofolio user1, String ans, Market share)
    {
        int SharesToBuy;
        while(true)
        {
           try
           {
               SharesToBuy = InputInt("\nHow many "+ans+" coins/shares do you want to buy?");
               break;
           }
           catch(Exception e)
           {
               Print("ERROR: Wrong value. Please input a number.");
           }
        }
        Double newCapital;
        if(ans.equals("Bitcoin")) {
            newCapital = share.sell(SharesToBuy, user1.getUserCapital(), ans);
            user1.setBitcoin(SharesToBuy);}
        else if(ans.equals("Litecoin")){
            newCapital = share.sell(SharesToBuy, user1.getUserCapital(), ans);
            user1.setLitecoin(SharesToBuy);}
        else if(ans.equals("Ethereum")){
            newCapital = share.sell(SharesToBuy, user1.getUserCapital(), ans);
            user1.setEthereum(SharesToBuy);}
        else if(ans.equals("Porsche")){
            newCapital = share.sell(SharesToBuy, user1.getUserCapital(), ans);
            user1.setPorsche(SharesToBuy);}
        else if(ans.equals("Wolkswagen")){
            newCapital = share.sell(SharesToBuy, user1.getUserCapital(), ans);
            user1.setWolkswagen(SharesToBuy);}
        else if(ans.equals("Audi")){
            newCapital = share.sell(SharesToBuy, user1.getUserCapital(), ans);
            user1.setAudi(SharesToBuy);}
        else if(ans.equals("Apple")){
            newCapital = share.sell(SharesToBuy, user1.getUserCapital(), ans);
            user1.setApple(SharesToBuy);}
        else if(ans.equals("Google")){
            newCapital = share.sell(SharesToBuy, user1.getUserCapital(), ans);
            user1.setGoogle(SharesToBuy);}
        else if(ans.equals("Samsung")){
            newCapital = share.sell(SharesToBuy, user1.getUserCapital(), ans);
            user1.setSamsung(SharesToBuy);}
        else
            System.out.println("There was an Error. The value was not saved into your account.");
    }

    public static void sellShares(Portofolio user1, String ans, Market share)
    {
        int SharesToSell;
        while(true)
        {
           try
           {
               SharesToSell = InputInt("\nHow many "+ans+" coins/shares do you want to sell?");
               break;
           }
           catch(Exception e)
           {
               Print("ERROR: Wrong value. Please input a number.");
           }
        }
        Double newCapital;
        if(ans.equals("Bitcoin")) {
            newCapital = share.sell(SharesToSell, user1.getUserCapital(), ans);
            user1.setBitcoin(SharesToSell);}
        else if(ans.equals("Litecoin")){
            newCapital = share.sell(SharesToSell, user1.getUserCapital(), ans);
            user1.setLitecoin(SharesToSell);}
        else if(ans.equals("Ethereum")){
            newCapital = share.sell(SharesToSell, user1.getUserCapital(), ans);
            user1.setEthereum(SharesToSell);}
        else if(ans.equals("Porsche")){
            newCapital = share.sell(SharesToSell, user1.getUserCapital(), ans);
            user1.setPorsche(SharesToSell);}
        else if(ans.equals("Wolkswagen")){
            newCapital = share.sell(SharesToSell, user1.getUserCapital(), ans);
            user1.setWolkswagen(SharesToSell);}
        else if(ans.equals("Audi")){
            newCapital = share.sell(SharesToSell, user1.getUserCapital(), ans);
            user1.setAudi(SharesToSell);}
        else if(ans.equals("Apple")){
            newCapital = share.sell(SharesToSell, user1.getUserCapital(), ans);
            user1.setApple(SharesToSell);}
        else if(ans.equals("Google")){
            newCapital = share.sell(SharesToSell, user1.getUserCapital(), ans);
            user1.setGoogle(SharesToSell);}
        else if(ans.equals("Samsung")){
            newCapital = share.sell(SharesToSell, user1.getUserCapital(), ans);
            user1.setSamsung(SharesToSell);}
        else
            System.out.println("There was an Error. The value was not saved into your account.");
    }

    public static void userPortofolio(Portofolio user1)
    {
        Print("\nAccount registered on the name of " + user1.getUserName());
        Print("Owns the following:");
        Print("Bitcoin: " + user1.getBitcoin());
        Print("Litecoin: " + user1.getLitecoin());
        Print("Ethereum: " + user1.getEthereum());
        Print("Apple: " + user1.getApple());
        Print("Google: " + user1.getGoogle());
        Print("Samsung: " + user1.getSamsung());
        Print("Porsche: " + user1.getPorsche());
        Print("Volkswagen: " + user1.getVolkswagen());
        Print("Audi: " + user1.getAudi());
        Print(" ");
    }

    public static void continueTransaction(Portofolio user1, String ans, Market share)
    {
        String action;
        while(true)
        {
            action = InputString("What do you want to do? Buy/Sell/Statistics/Portofolio/Exit");
            if(action.equalsIgnoreCase("buy"))
            {
                buyShares(user1, ans, share);
            }
            else if(action.equalsIgnoreCase("sell"))
            {
                sellShares(user1, ans, share);
            }
            else if(action.equalsIgnoreCase("portofolio"))
            {
                userPortofolio(user1);
            }
            else if(action.equalsIgnoreCase("exit"))
            {
                Print("\nThank you for using the App\n");
                System.exit(0);
            }
            else
            {
                Print("That's a wrong input. Please try again.");
            }  
        }
    }

    public static void Cars(Portofolio user1)
    {
       String ans;
       Market car1;
       while(true)
       {
           ans = InputString("In which car manufacturers do you want to invest in? Porsche | Volkswagen | Audi");
           if(ans.equalsIgnoreCase("Porsche"))
           {
               car1 = new Porsche();
               ans = "Porsche";
               break;
           }
           else if(ans.equalsIgnoreCase("Volkswagen") || ans.equalsIgnoreCase("vw"))
           {
                car1 = new Volkswagen(); 
                ans = "Volkswagen";
                break;
           }
           else if(ans.equalsIgnoreCase("Audi"))
           {
                car1 = new Audi();
                ans = "Audi";
                break;
           }
           else  
           {
                Print("Sorry, we dont support this car manufacturer at this moment. Please try again.");
                  
           }
       }
               
       Print("\nStatistics:");
       System.out.println("Current Value: "+car1.getValue());
       System.out.println("Highest Value recorded: "+car1.getHighestValue());
       System.out.println("Highest Value in the last 24 hours: "+car1.getM24High());
       System.out.println("Lowest Value in the last 24 hours: "+car1.getM24Low());
       
       // Marketing Stage 1
       buyShares(user1, ans, car1); // the account is on 0, so we need to buy something.
       
       // Marketing Stage 2
       while(true)
       {
           String ansContinue = InputString("\nDo you want to do any other transactions?");
           if(ansContinue.equalsIgnoreCase("yes") || ansContinue.equalsIgnoreCase("y"))
           {
               continueTransaction(user1, ans, car1);
               break;
           }
           else if(ansContinue.equalsIgnoreCase("no") || ansContinue.equalsIgnoreCase("n"))
           {
               Print("\nThank you for using the App\n");
               System.exit(0);
           }
           else
           {
               Print("Please answer with Yes/No");
           }
       }
    }
    
    public static void Technology(Portofolio user1)
    {
       String ans;
       Market tech1;
       while(true)
       {
           ans = InputString("In which car manufacturers do you want to invest in? Apple | Samsung | Google");
           if(ans.equalsIgnoreCase("Apple"))
           {
               tech1 = new Apple();
               ans = "Apple";
               break;
           }
           else if(ans.equalsIgnoreCase("Samsung"))
           {
                tech1 = new Samsung(); 
                ans = "Samsung";
                break;
           }
           else if(ans.equalsIgnoreCase("Google"))
           {
                tech1 = new Google();
                ans = "Google";
                break;
           }
           else  
           {
                Print("Sorry, we dont support this Technology company at this moment. Please try again.");
                  
           }
       }
               
       Print("\nStatistics:");
       System.out.println("Current Value: "+tech1.getValue());
       System.out.println("Highest Value recorded: "+tech1.getHighestValue());
       System.out.println("Highest Value in the last 24 hours: "+tech1.getM24High());
       System.out.println("Lowest Value in the last 24 hours: "+tech1.getM24Low());
       
       // Marketing Stage 1
       buyShares(user1, ans, tech1); // the account is on 0, so we need to buy something.
       
       // Marketing Stage 2
       while(true)
       {
           String ansContinue = InputString("\nDo you want to do any other transactions?");
           if(ansContinue.equalsIgnoreCase("yes") || ansContinue.equalsIgnoreCase("y"))
           {
               continueTransaction(user1, ans, tech1);
               break;
           }
           else if(ansContinue.equalsIgnoreCase("no") || ansContinue.equalsIgnoreCase("n"))
           {
               Print("\nThank you for using the App\n");
               System.exit(0);
           }
           else
           {
               Print("Please answer with Yes/No");
           }
       }
    }
    
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
import java.util.*; //Allows me to get input from the user
public class Simulator
{
    public static void main(String[] START)
    {
        Print("\nWelcome to the Stock Market");
        
        String name = InputString("What is your name?");
        double money = InputDouble("How much money (USD) do you have?");
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
           ans = InputString("In which Crypto-Currency do you want to invest in? Bitcoin | Litecoin | Ethereum");
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
               
       Print("Statistics:");
       System.out.println("Current Value: "+Coin1.getValue());
       System.out.println("Highest Value recorded: "+Coin1.getHighestValue());
       System.out.println("Highest Value in the last 24 hours: "+Coin1.getM24High());
       System.out.println("Lowest Value in the last 24 hours: "+Coin1.getM24Low());
       
       int SharesToBuy = InputInt("\nHow many "+ans+" coins do you want to buy?");
       Double newCapital = Coin1.buy(SharesToBuy, user1.getUserCapital(), ans);
       if(ans.equalsIgnoreCase("Bitcoin"))
            user1.setBitcoin(SharesToBuy);
       else if(ans.equalsIgnoreCase("litecoin"))
            user1.setLitecoin(SharesToBuy);
       else if(ans.equalsIgnoreCase("Ethereum"))
            user1.setEthereum(SharesToBuy);
       else
            System.out.println("ERROR 1: Your order was not registered");
       
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
               
       Print("Statistics:");
       System.out.println("Current Value: "+car1.getValue());
       System.out.println("Highest Value recorded: "+car1.getHighestValue());
       System.out.println("Highest Value in the last 24 hours: "+car1.getM24High());
       System.out.println("Lowest Value in the last 24 hours: "+car1.getM24Low());
       
       int SharesToBuy = InputInt("\nHow many "+ans+" shares do you want to buy?");
       Double newCapital = car1.buy(SharesToBuy, user1.getUserCapital(), ans);
       if(ans.equalsIgnoreCase("Porsche"))
            user1.setPorsche(SharesToBuy);
       else if(ans.equalsIgnoreCase("Volkswagen"))
            user1.setWolkswagen(SharesToBuy);
       else if(ans.equalsIgnoreCase("Audi"))
            user1.setAudi(SharesToBuy);
       else
            System.out.println("ERROR 1: Your order was not registered");
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
               
       Print("Statistics:");
       System.out.println("Current Value: "+tech1.getValue());
       System.out.println("Highest Value recorded: "+tech1.getHighestValue());
       System.out.println("Highest Value in the last 24 hours: "+tech1.getM24High());
       System.out.println("Lowest Value in the last 24 hours: "+tech1.getM24Low());
       
       int SharesToBuy = InputInt("\nHow many "+ans+" shares do you want to buy?");
       Double newCapital = tech1.buy(SharesToBuy, user1.getUserCapital(), ans);
       if(ans.equalsIgnoreCase("Apple"))
            user1.setApple(SharesToBuy);
       else if(ans.equalsIgnoreCase("Samsung"))
            user1.setSamsung(SharesToBuy);
       else if(ans.equalsIgnoreCase("Google"))
            user1.setGoogle(SharesToBuy);
       else
            System.out.println("ERROR 1: Your order was not registered");
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
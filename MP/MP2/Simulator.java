import java.util.Scanner; //Allows me to get input from the user
public class Simulator
{
    public static void main(String[] CCTV)
    {
        Print("Welcome to the Stock Market\nThese are the Markets:\nCrypto\nTechnology\nMetals");
        boolean rightInput = false; // boolean created so we can see whether the user has entered the right input 
        String userChoice;
        while(rightInput==false)    //While statement has been added in case that the users enter the wrong input.
        {
            String ans = InputString("\nWhich stock market do you want to trade?");
            if(ans.equalsIgnoreCase("crypto")) 
            {
                System.out.println("You have selected the Crypto-Currency Market.");
                userChoice = "Crypto-Currency";
                Crypto cryp1 = new Crypto();
                rightInput=true; //right input
            }
            else if(ans.equalsIgnoreCase("technology"))
            {
                System.out.println("You have selected the Technology Market.");
                userChoice = "Technology";
                Technology tech1 = new Technology();
                rightInput=true; //right input
            }
            else if(ans.equalsIgnoreCase("metals"))
            {
                System.out.println("You have selected the Metals Market.");
                userChoice = "Metals";
                Metals meta1 = new Metals(); 
                rightInput=true; //right input
            }
            else
            {
                System.out.println("You have entered the wrong input, let's try that again");
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
}
import java.util.Scanner; //Allows me to get input from the user
public class Simulator
{
    public static void main(String[] CCTV)
    {
        System.out.println("Welcome to the Stock Market");
        System.out.println("These are the Markets:");
        System.out.println("Crypto");
        System.out.println("Technology");
        System.out.println("Metals");
        boolean rightInput = false; // boolean created so we can see whether the user has entered the right input 
        while(rightInput==false)    //While statement has been added in case that the users enter the wrong input.
        {
            System.out.println("\nWhich stock market do you want to trade?");

            Scanner scanner = new Scanner(System.in);
            String ans = scanner.nextLine();


            if(ans.equalsIgnoreCase("crypto")) 
            {
                System.out.println("You have selected the Crypto-Currency Market.");
                Crypto cryp1 = new Crypto();
                rightInput=true; //right input
            }
            else if(ans.equalsIgnoreCase("technology"))
            {
                System.out.println("You have selected the Technology Market.");
                Technology tech1 = new Technology();
                rightInput=true; //right input
            }
            else if(ans.equalsIgnoreCase("metals"))
            {
                System.out.println("You have selected the Metals Market.");
                Metals meta1 = new Metals(); 
                rightInput=true; //right input
            }
            else
            {
                System.out.println("You have entered the wrong input, let's try that again");
                rightInput=false; //wrong input, the program will ask the user again.
            }
        }
    }
}
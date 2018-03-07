import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    private static ArrayList all = new ArrayList<Info>();
    
    public static void main(String[] args) throws IOException
    {
        int numgreater = 0;
        fileinput(all);
        numgreater = check(args, numgreater);
        finalnum(args, numgreater);
    }
    
    public static void finalnum(String[] args, int numgreater)
    {
        System.out.println("There are " + numgreater + " capitals that have a greater population than " + args[0]);
    }
    
    public static int check(String[] args, int greater)
    {
        try{
            greater = compare(args);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You have entered an invalid argument");
            System.exit(0);
        }
        return greater;
    }
    
    public static int compare(String[] args)
    {
        int poptofind = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 0; i < all.size(); i++)
        {
            int poplist = ((Info) all.get(i)).getPopulation();
            if (poptofind <= poplist)
            {
                sum = sum + 1;
            }
        
        }
        return sum;
    }

    public static void fileinput(ArrayList<Info> all) throws IOException
    {
      BufferedReader inputFile = new BufferedReader(new FileReader("Capitals.txt"));
      Scanner scanner = new Scanner(new File("Capitals.txt"));
      String city = "";
      int pop = 0;
      String con = "";

        while (scanner.hasNextLine())
        {
          Scanner scanner2 = new Scanner(scanner.nextLine());
          while (scanner2.hasNext()) 
          {
              city = scanner2.next();
              pop = Integer.parseInt(scanner2.next());
              con = scanner2.next();
          }
        
          //System.out.println(city + " " + pop + " " + con);
          
          Info info = new Info(city, pop, con);
          all.add(info);

        }
      inputFile.close();
      
    }
}

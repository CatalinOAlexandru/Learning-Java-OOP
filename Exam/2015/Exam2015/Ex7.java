import java.util.*;
import java.io.*;

public class Ex7 
{
    public static ArrayList<Assessment> readAssessment(String fName)
    {
        try
        {
            ArrayList<Assessment> newAssessment = new ArrayList<Assessment>();
            BufferedReader inputStream = new BufferedReader(new FileReader(fName));
            String readLine = inputStream.readLine();
            
            while(readLine != null)
            {
                String[] splitter = readLine.split(" ");
                newAssessment.add(new Assessment(splitter[0]+" s"+splitter[1], Double.parseDouble(splitter[2])));
            }
            
            return newAssessment;
        }
        catch(IOException e)
        {
            System.out.println("IO Error");
            return null;
        }
    }
}
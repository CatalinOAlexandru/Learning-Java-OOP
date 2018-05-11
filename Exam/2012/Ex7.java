import java.util.*;
import java.io.*;

public class Ex7 {

    public static void AverageMarks(String fName, String pname)throws IOException {
        BufferedReader inputStream = new BufferedReader(new FileReader(fName));
        String readLine = inputStream.readLine();
        int total=1;
        boolean found = false;
        
        while(readLine != null)
        {
            if(readLine.startsWith(pname)==true)
            {
                String[] splitter = readLine.split(" ");
                for(int j=1; j<splitter.length; j++)
                {
                    total = total*Integer.parseInt(splitter[j]);
                    found = true;
                }
                total = total / (splitter.length-1);
                System.out.println(total);
                break;    
            }
            else
            {readLine = inputStream.readLine();}
        }
        
        if(found==false)
        {System.out.print(pname + "No such name");}
        
        inputStream.close();
    }
    
    public static void main(String[] args) throws IOException
    {
        AverageMarks("data.txt", "Ali");
        System.exit(0);
    }

}
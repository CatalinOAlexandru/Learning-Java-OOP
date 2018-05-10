import java.io.*;

public class Ex7 {
    public static NationalMessage nationalMessage(String fName){
        try
        {
            BufferedReader inputStream = new BufferedReader(new FileReader(fName));
            String readLine = inputStream.readLine();
            while(readLine != null)
            {
                String[] splitter = readLine.split(" ");
                boolean first = splitter[0].startsWith("UK");
                boolean second = splitter[1].startsWith("UK");
                if(first==true && second==true)
                {
                    NationalMessage something = new NationalMessage(splitter[0], splitter[1], splitter[2]);
                    return something;
                }
            }
            return null;
        }
        catch(IOException e)
        {
            System.out.println("IO Error"); 
            return null;
        }
    }
}
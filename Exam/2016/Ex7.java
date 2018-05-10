import java.util.*;
import java.io.*;   

public class Ex7 {

    public static ArrayList<Record> readRecords(String fName)
    {
        try
        {
            BufferedReader inputStream = new BufferedReader(new FileReader(fName));
            ArrayList<Record> object = new ArrayList<Record>();
            
            String readLine = inputStream.readLine();
            while(readLine != null)
            {
                String[] splitter = readLine.split(" ");
                object.add(new Record(splitter[0], Integer.parseInt(splitter[1])));
                readLine = inputStream.readLine();
            }
            
            return object;
        }
        catch(IOException e)
        {
            System.out.println("Problem reading file: Error");
            return null;
        }
    }
      
    public static void main(String[] args){ //you can use this main method to test your code
        try{
            ArrayList<Record> result=readRecords("dati.txt");
                for (int i=0;i<result.size();i++){
                    System.out.print(result.get(i).getID()+" "+result.get(i).getLength()+" ");
                }
                System.out.println();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
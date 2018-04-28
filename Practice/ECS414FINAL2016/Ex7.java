import java.util.*;
import java.io.*;   

public class Ex7 {

    public static ArrayList<Record> readRecords(String fName) throws IOException
    {
        ArrayList<Record> object = new ArrayList<Record>();
        BufferedReader inputStream = new BufferedReader(new FileReader(fName));
        
        String read = inputStream.readLine();
        String spitted[];
        while(read != null)
        {
            System.out.println("1st read start");
            System.out.println(read);
            System.out.println("1st read end");
            
            String splitted[]=read.split(" ");
            System.out.println(splitted[0]);
            System.out.println(splitted[1]);
            
            System.out.println("start to read again");
            read = inputStream.readLine();
            System.out.println("end to read again");
            
            System.out.println("2st read start");
            System.out.println(read);
            System.out.println("2st read end");
            //read =null;
        }
        return object;
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
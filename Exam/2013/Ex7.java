import java.io.*;

public class Ex7 {

    public static String logSecrets(String fName){
        try
        {
            BufferedReader inputStream = new BufferedReader(new FileReader(fName));
            String readLine = inputStream.readLine();
            String data="";
            while(readLine != null)
            {
                String[] splitter = readLine.split(" ");
                if(splitter[0].equals("SECRET"))
                    data = data + splitter[1]+" ";
                readLine = inputStream.readLine();
            }
            return data;
        }
        catch(IOException e)
        {return("IO Error");}
    }
    
    public static void main(String[] args){ //you can use this main method to test your code
        System.out.println(logSecrets("data.txt"));
    }

}
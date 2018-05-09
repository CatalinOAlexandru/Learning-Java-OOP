import java.util.*;
import java.io.*;
public class Ex8
{
   public static void addNonce(Account acc, String fName) throws IOException
   {
       String name = acc.getName();
       String pass = acc.getPassword();
       
       BufferedReader inputStream = new BufferedReader(new FileReader(fName));
       String readLine = inputStream.readLine();
       
       while(readLine != null)
       {
           String splitted[] = readLine.split(" ");
           if(name.equals(splitted[0]))
           {
               String newPass = splitted[1] + pass;
               acc.setPassword(newPass);
               return;
           }             
           
           readLine = inputStream.readLine();
       }
       System.out.println("user not found");
    }
    
   public static void main(String[] args) throws IOException
   {
       Account acc=new Account("Mark","b","e");
       addNonce(acc,"dati.txt");
       
    }
 
}

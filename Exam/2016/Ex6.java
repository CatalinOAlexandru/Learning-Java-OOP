import java.util.*;
import java.io.*;
import java.lang.*;

public class Ex6 {

 public static ArrayList<Record>  extractRecord (ArrayList<Record> r1,ArrayList<Record> r2) 
 {
     ArrayList<Record> combined = new ArrayList<Record>();
     
     for(int i=0; i<r1.size(); i++)
     {
         System.out.println("check r1");
         String check = (r1.get(i).getID()).toString();
         System.out.println(check);
         if((check.startsWith("X"))==true)
            {combined.add(r1.get(i));System.out.println("add r1");}
     }
     
     for(int i=0; i<r2.size(); i++)
     {
         System.out.println("check r2");
         String check = (r2.get(i).getID()).toString();
         System.out.println(check);
         boolean tt = check.startsWith("X");
         if(tt==true)
            {combined.add(r2.get(i));System.out.println("add r2");}
     }
     
     return combined;
 }

    
 public static void main(String[] args){ // you can use this main method to test your code
        ArrayList<Record> r1 = new ArrayList<Record>();
        r1.add(new Record("Smith",60));
        r1.add(new Record("XGreen",50));
        ArrayList<Record> r2 = new ArrayList<Record>();
        r2.add(new Record("XDoor",70));
        r2.add(new Record("Mary",80));
        ArrayList<Record> combined = extractRecord (r1, r2);
        for (int i=0; i<combined.size();i++){
           System.out.print(combined.get(i).getID()+" ");
        }
    }
}
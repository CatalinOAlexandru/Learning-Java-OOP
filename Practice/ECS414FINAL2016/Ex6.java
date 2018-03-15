import java.util.*;
import java.lang.String.*;

public class Ex6 
{
    public static ArrayList<Record>  extractRecord (ArrayList<Record> r1,ArrayList<Record> r2) 
    {
        ArrayList<Record> finaldata = new ArrayList<Record>();
        for (int i=0; i <= r1.size(); i++) {
            if(r1.get(i).charAt(0) == "X")
            finaldata.add(r1.getname());
        }


        for (int i=0; i <= r1.size(); i++) {
            r2.get(index).getname.charat(0);
            finaldata.add(r2.getname());
        }

        return finaldata;
        
        //st1.startsWith(st2)
        //char charAt(int index)
        
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
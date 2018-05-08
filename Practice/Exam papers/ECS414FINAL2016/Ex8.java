import java.util.*;
 public class Ex8 {

    public static ArrayList<Record> sortRecords(ArrayList<Record>  rec){
        

    }
    public static void main(String[] args){ //you can use this main method to test your code
        ArrayList<Record>  recs= new ArrayList<Record> ();
        recs.add(new Record("John",60));
        recs.add(new Record("Paul",30));
        recs.add(new Record("Ali",35));
        ArrayList<Record> recss= sortRecords(recs);
        for (int i=0;i<recs.size();i++)
        {
            System.out.print(recss.get(i).getID()+" "+recss.get(i).getLength()+" ");
        }
    }
}
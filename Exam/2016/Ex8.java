import java.util.*;
 public class Ex8 {

  public static ArrayList<Record> sortRecords(ArrayList<Record>  rec)
  {
      String[] name = new String[rec.size()];
      int[] len = new int[rec.size()];
      
      for(int i=0; i<rec.size(); i++)
      {
          name[i] = rec.get(i).getID();
          len[i] = rec.get(i).getLength();
      }
      
      for(int pass=0; pass<=len.length-1; pass++)
      {
	 for(int i=0; i<len.length-1; i++)
	 {
		if(len[i]>len[i+1])
		{
		    int temp = len[i+1];
		    len[i+1] = len[i];
		    len[i] = temp;
		    
		    String temp2 = name[i+1];
		    name[i+1] = name[i];
		    name[i] = temp2;
		}
	}
     }
     
     ArrayList<Record> newRecord = new ArrayList<Record>();
     for(int i=0; i<rec.size(); i++)
     {
         newRecord.add(new Record(name[i], len[i]));
     }
     
     return newRecord;
  }
  public static void main(String[] args){ //you can use this main method to test your code
        ArrayList<Record>  recs= new ArrayList<Record> ();
        recs.add(new Record("John",60));
        recs.add(new Record("Paul",30));
        recs.add(new Record("Ali",35));
        ArrayList<Record> recss= sortRecords(recs);
        for (int i=0;i<recs.size();i++){
        System.out.print(recss.get(i).getID()+" "+recss.get(i).getLength()+" ");
    }
  }
}
import java.util.*;

public class Ex6 {

     public static ArrayList<Record>  extractRecord (ArrayList<Record> r1,ArrayList<Record> r2) 
     {
            ArrayList<Record> object = new ArrayList<Record>();
            System.out.println("poz 1");
            String st1 = "";
            String st2 = "X";
            if(r1.size() == 0 || r2.size() == 0)
            {
                System.out.println("Error");
                return null;
            }
            else
            {
                System.out.println("poz 2");
                for(int i=0; i<r1.size(); i++)
                {
                    System.out.println("poz 3");
                    st1 = String.valueOf(r1.get(i).getID());
                    System.out.println("check st1: "+st1);
                    System.out.println("check st2: "+st2);
                    boolean check = st1.startsWith(st2);
                    if(check ==true)
                    {
                        object.add(r1.get(i));
                        System.out.println("poz 3.1");
                    }
                    else {System.out.println("poz 3.2");}
                }
                
                for(int i=0; i<r2.size(); i++)
                {
                    System.out.println("poz 4");
                    st1 = String.valueOf(r2.get(i).getID());
                    System.out.println("check st1: "+st1);
                    System.out.println("check st2: "+st2);
                    boolean check = st1.startsWith(st2);
                    if(check ==true)
                    {
                        object.add(r2.get(i));
                        System.out.println("poz 4.1");
                    }
                    else {System.out.println("poz 4.2");}
                }
            }
            return object;
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
               System.out.println(combined.get(i).getID()+" ");
            }
        }
}
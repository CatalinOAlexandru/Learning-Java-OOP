import java.util.*;

public class Ex6 {

    public static String peopleClearance (ArrayList<Clearance> clearances) {
        try
        {
            String people ="";
            for(int i=0; i<clearances.size(); i++)
            {
                if(clearances.get(i) instanceof HighClearance)
                {
                    people = people +" "+clearances.get(i).getName();
                }
            }
            return people;
        }
        catch(NullPointerException e)
        {return("Error");}
    }
    
    public static void main(String[] args){ // you can use this main method to test your code
        ArrayList<Clearance> clear= new ArrayList<Clearance>();
        clear.add(new HighClearance("Mike"));
        clear.add(new HighClearance("John"));
        System.out.println(peopleClearance(clear));
    }
}
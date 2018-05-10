import java.util.*;

public class Ex8 {

    public static ArrayList<Clearance> raiseClearance(ArrayList<Clearance> clearances, String pname){
        ArrayList<Clearance> newClear = new ArrayList<Clearance>();
        for(int i=0; i<clearances.size(); i++)
        {
            int counter=0;
            if(clearances.get(i) instanceof LowClearance && clearances.get(i).getName().equals(pname)&&counter==0)
            {
                newClear.add(new HighClearance(clearances.get(i).getName()));
                counter++;
            }
            else
                newClear.add(clearances.get(i));
        }
        return newClear;
    }
    
    public static void main(String[] args)
    { //you can use this main method to test your code
    
        ArrayList<Clearance> clear= new ArrayList<Clearance>();
        clear.add(new HighClearance("Mike"));
        clear.add(new LowClearance("John"));
        ArrayList<Clearance> clear2= raiseClearance(clear,"John");
        for (Clearance a:clear2)
            System.out.print(a.getName()+" "+a.isAuthorized());
    }
}
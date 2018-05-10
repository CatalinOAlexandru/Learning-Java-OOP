import java.util.*;
public class Ex8 
{
    public static String namesFail(ArrayList<Assessment> assessmentList)
    {
        String names="";
        for(int i=0; i<assessmentList.size();i++)
        {
            if(assessmentList.get(i).getMark()<40)
                names=names+" "+assessmentList.get(i).getStudent();
        }
        return names;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Assessment> assessmentList= new ArrayList<Assessment> ();
        assessmentList.add(new Assessment("John",60));
        assessmentList.add(new Assessment("Paul",30));
        assessmentList.add(new Assessment("Ali",35));
        System.out.print(namesFail(assessmentList) );
    }
}
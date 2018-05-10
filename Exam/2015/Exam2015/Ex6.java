import java.util.*;

public class Ex6 
{
    public static ArrayList<Assessment> combineAssessments(ArrayList<Coursework> cw,ArrayList<FinalExam> exam) {
        try
        {
            ArrayList<Assessment> combined = new ArrayList<Assessment>();
            
            if(cw.size() != exam.size())
            {
                System.out.println("Missing Student");
                return null;
            }
            
            for(int i=0; i<cw.size(); i++)
            {
                double mark = (cw.get(i).getPercentage() * cw.get(i).getMark()) + (exam.get(i).getPercentage() * exam.get(i).getMark());
                combined.add(new Assessment(cw.get(i).getStudent(), mark));
                
            }
            
            return combined;
        }
        catch(Exception e)
        {
            System.out.println("Error");
            return null;
        }
    }
    
    public static void main(String[] args)
    { 
        ArrayList<Coursework> cw = new ArrayList<Coursework>();
        cw.add(new Coursework("John Smith",60,0.5,0));
        cw.add(new Coursework("Mary Green",50,0.5,0));
        
        ArrayList<FinalExam> exam = new ArrayList<FinalExam>();
        exam.add(new FinalExam("John Smith",70,0.5,false));
        exam.add(new FinalExam("Mary Green",80,0.5,false));
        
        ArrayList<Assessment> combined = combineAssessments ( cw, exam);
        for (int i=0; i<exam.size();i++)
        {
            System.out.print(combined.get(i).getStudent()+" "+combined.get(i).getMark()+" ");
        }
    }
}
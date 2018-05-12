
import java.util.*;
 public class Ex8 {

    public void distinctStud(ArrayList<Student> a){
        String names="";
        for(int i=0; i<a.size(); i++)
        {
            int[] marks = a.get(i).getMarks();
            double average=0;
            double total=0;
            for(int j=0; j<marks.length; j++)
            {
                total = total+marks[j];
                average = total/marks.length;
            }
            //System.out.println(names);
            if(average > 70)
                names = names+a.get(i).getName()+" ";
            //System.out.println(names);
        }
        System.out.println(names);
    }
    
    public static void main(String [] args)
    {
        ArrayList<Student> a = new ArrayList<Student>();
        int [] john = {40,70};
        int [] mary = {100, 60, 80};
        int [] molly = {50, 100, 75, 50, 100};
        a.add(new Student("John", "1991", john));
        a.add(new Student("Mary", "1998", mary));
        a.add(new Student("Molly", "1997", molly));
        
        Ex8 test = new Ex8();
        test.distinctStud(a);
        
    }
}

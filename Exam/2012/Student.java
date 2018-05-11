
public class Student extends Person
{
    private int[] Marks;
   
    public Student(String name,String dateofbirth, int[] marks)
    {
        super(name, dateofbirth);
        Marks = marks;
    }

    int[] getMarks()
    {return Marks;}
    
    void updateMarks(int mar)
    {
        for(int i=0; i<Marks.length; i++)
        {
            if(Marks[i]==0)
                {
                    Marks[i]=mar; 
                    break;
                }
        }
    }
}

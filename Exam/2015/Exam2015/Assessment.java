public class Assessment
{
    private String student;
    protected double mark;
    
    public Assessment(String sstudent, double mmark) 
    {
        student =sstudent;
        mark =mmark;
    }
    
    public String getStudent(){
        return student;
    }
    
    public double getMark(){
        return mark;
    }
    
    public void setMark(double newmark){
        mark= newmark;
    }
}
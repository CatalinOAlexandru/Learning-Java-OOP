import java.util.*;

public class FinalExam extends Assessment
{
    private double percentage;
    private boolean resit;

    public FinalExam(String sstudent, double mmark, double ppercentage, boolean rresit)
    {
        super(sstudent, mmark);
        percentage = ppercentage;
        resit = rresit;
    }

    public double getPercentage()
    {return percentage;}
    
    public boolean getResit()
    {return resit;}
    
    public double getMark()
    {
        if(resit==false)
            return mark;
        else
        {
            if(mark<40)
                return mark;
            else
                return 40;
        }
    }
}

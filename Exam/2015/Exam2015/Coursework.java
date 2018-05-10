import java.util.*;

public class Coursework extends Assessment
{
    // instance variables - replace the example below with your own
    private double percentage;
    private boolean hurdle;

    public Coursework(String sstudent, double mmark, double ppercentage, int ctype)
    {
        super(sstudent, mmark);
        percentage = ppercentage;
        
        if(ctype==0 || ctype==1 || ctype==2)
            hurdle=false;
        else
            hurdle=true;
    }

    public double getPercentage()
    {return percentage;}
    
    public boolean getHurdle()
    {return hurdle;}
}

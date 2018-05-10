
public class HighClearance extends Clearance
{
    private String logs;
    
    public HighClearance(String pname)
    {
        super(pname, true);
        logs = "";
    }
    
    public void setSecret(String sec)
    {
        super.setSecret(sec);
        logs = logs +" "+sec;
    }
    
    public String getLogs()
    {return logs;}
}

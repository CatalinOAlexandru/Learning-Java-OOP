
public class NationalMessage extends Message
{
    private boolean isNational;

    public NationalMessage(String ssender, String rreceiver, String ccontent)
    {
        super(ssender, rreceiver, ccontent);
        boolean send = ssender.startsWith("UK");
        boolean receive = rreceiver.startsWith("UK");
        
        if(send==true && receive==true)
            isNational=true;
        else
            isNational=false;
    }

    public boolean getIsNational()
    {return isNational;}
}

public class Message
{
    private String sender;
    private String receiver;
    private String content;
    
    public Message(String ssender, String rreceiver, String ccontent){
        sender=ssender;
        receiver=rreceiver;
        content=ccontent;
    }
    
    public String getSender(){
        return sender;
    }
    
    public String getReceiver(){
        return receiver;
    }
    
    public String getContent(){
        return content;
    }
}
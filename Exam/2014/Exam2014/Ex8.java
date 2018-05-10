import java.util.*;

public class Ex8 {
    public static String fromSender(ArrayList<Message> messageList, String pname){
        String content="";
        for(int i=0; i<messageList.size(); i++)
        {
            if(messageList.get(i).getSender().equals(pname))
                content = content + messageList.get(i).getContent();
        }
        return content;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Message> messageList= new ArrayList<Message>();
        messageList.add(new Message("UKMark","UKJohn","message1 "));
        messageList.add(new Message("John","Don","ah"));
        messageList.add(new Message("UKMark","UKJohn","message2 "));
        System.out.print(fromSender(messageList, "UKMark") );
    }
}
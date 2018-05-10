import java.util.*;

public class Ex6 {
    public static int countNational (ArrayList<Message> messageList) {
        if(messageList.size()==0)
        {
            System.out.println("Error");
            return -1;
        }
        
        int count=0;
        for(int i=0; i<messageList.size(); i++)
        {
            if(messageList.get(i) instanceof NationalMessage)
            {
                NationalMessage newMess = new NationalMessage(messageList.get(i).getSender(), messageList.get(i).getReceiver(), messageList.get(i).getContent());
                if(newMess.getIsNational() == true)
                    count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args){ 
        ArrayList<Message> messageList = new ArrayList<Message>();
        messageList.add(new NationalMessage("UKJohn","UKMark","aa"));
        messageList.add(new NationalMessage("UKJohn","FRJean","aa"));
        messageList.add(new Message("Mike","John","aa"));
        System.out.println(countNational(messageList));
    }
}
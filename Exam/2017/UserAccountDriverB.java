import java.util.*;
public class UserAccountDriverB
{
   public static void main(String[] args){
       UserAccount u1 = new UserAccount("xdf","wes","deaf");
       UserAccount u2 = new UserAccount("jon","wes","deaf");
       u1.addFriend(u2);
       UserAccount friend=u1.getFriends().get(0);
       if (args[0].equals("1"))
       {System.out.println(friend.getName());}
       //should print "jon"}
       if (args[0].equals("2"))
       {u1.removeFriend(u2);
       System.out.println(u1.getFriends().size());}
        
      // should print 0
    }
}
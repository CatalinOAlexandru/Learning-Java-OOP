import java.util.*;
public class Ex7
{

public static void suspendAccount(String x, ArrayList<UserAccount>  usersList, ArrayList<UserAccount>  suspendedUsersList){
   System.out.println("user list size: "+usersList.size());
   UserAccount acc;
    for(int i=0; i<usersList.size(); i++)
   {
       System.out.println("Get user: "+i);
       acc = usersList.get(i);
       ArrayList<String> posts = acc.getPosts();
       for(int j=0; j<posts.size(); j++)
       {
           System.out.println("Print post: "+posts.get(j));
           if(posts.get(j).equals(x))
                {
                    suspendedUsersList.add(acc);
                    usersList.remove(acc);
                    i--;
                    
                }
       }
   }
   
}
    
public static void main(String[] args){
   ArrayList<UserAccount>  usersList=new ArrayList<UserAccount> ();
   UserAccount user1=new UserAccount("a1","b1","e1");
   user1.addPost("x");
   UserAccount user2=new UserAccount("a2","b2","e2");
   user2.addPost("y");
   usersList.add(user1);
   usersList.add(user2);
   ArrayList<UserAccount> suspendedUsersList=new ArrayList<UserAccount> ();
   System.out.println("Suspend start");
   suspendAccount("x", usersList,suspendedUsersList);
   System.out.println("Print suspended");
   System.out.println(suspendedUsersList.get(0).getName());
   System.out.println("Print userList");
   System.out.println(usersList.get(0).getName());
}
}

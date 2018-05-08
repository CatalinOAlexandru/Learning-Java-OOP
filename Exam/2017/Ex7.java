import java.util.*;
public class Ex7
{

public static void suspendAccount(String x, ArrayList<UserAccount>  usersList, ArrayList<UserAccount>  suspendedUsersList){
   
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
   suspendAccount("x", usersList,suspendedUsersList);
   System.out.println(suspendedUsersList.get(0).getName());
   System.out.println(usersList.get(0).getName());
}
}

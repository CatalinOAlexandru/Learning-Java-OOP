import java.util.*;
public class UserAccountDriverA 
{
   public static void main(String[] args){
       UserAccount u = new UserAccount("xdf","wes","deaf");
       u.addPost("dsf");
       ArrayList<String> p=u.getPosts();
       System.out.println(p.get(0));
       //should print "dsf"
    }
}
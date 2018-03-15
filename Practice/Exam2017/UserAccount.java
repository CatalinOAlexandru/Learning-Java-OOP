import java.util.*;

public class UserAccount extends Account
{
    private  ArrayList<String> posts;
    private  ArrayList<UserAccount> friends;
    
    public UserAccount(String name, String password, String email)
    {
        super(name, password, email);
        ArrayList<String> APosts = new ArrayList<String>();
        ArrayList<UserAccount> AFriends = new ArrayList<UserAccount>();
        posts = APosts;
        friends = AFriends;
    }
    
    public ArrayList<String> getPosts()
    {
        return posts;
    }
    public ArrayList<UserAccount> getFriends()
    {
        return friends;
    }
    
    public boolean addPost(String post)
    {
        return posts.add(post);
    }
    public boolean addFriend(UserAccount friend)
    {
        return friends.add(friend);
    }
    public boolean removeFriend(UserAccount friend)
    {
        return friends.remove(friend);
    }
}

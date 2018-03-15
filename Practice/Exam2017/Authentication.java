import java.util.*;
public interface Authentication
{
    public String toyHash(String s);
    Account verify(String name, String  password, ArrayList<Account> usersList);

}

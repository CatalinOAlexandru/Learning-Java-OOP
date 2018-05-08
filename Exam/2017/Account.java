
public class Account
{
    private String name;
    private String password;
    private String email;
    
    public Account(String nname, String ppassword, String eemail){
        name=nname;
        password=ppassword;
        email=eemail;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setPassword(String newPassword){
        password=newPassword;
    }
    
    public void setName(String newName){
        name=newName;
    }
    
    public void setEmail(String newEmail){
        email=newEmail;
    }
}

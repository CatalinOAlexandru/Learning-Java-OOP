public class Clearance
{
    private String name;
    private String SECRET="some secret data";
    private boolean highLevel;
    private boolean authorized;
    
    public Clearance(String pname, boolean l)
    {
        name = pname;
        highLevel =l;
        if (highLevel) 
            authorized=true; 
        else 
            authorized=false;
    }
    
    public boolean isHighLevel(){
        return highLevel;
    }
    
    public boolean isAuthorized(){
        return authorized;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSecret(){
        if (authorized) 
            return SECRET; 
        else 
            return "non-authorized";
    }
    
    public void setSecret(String sec){
        if (authorized) 
            SECRET=sec;
    }

}
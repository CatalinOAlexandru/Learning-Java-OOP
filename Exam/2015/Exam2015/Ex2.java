public class Ex2 {
    
    private String name;
    private String status;
    
    public Ex2(String personName, int mark)
    {
        name = personName;
        if(mark>40)
            status="pass";
        else
            status="fail";    
    }
    
    public String getValues(){
        return ""+name+" "+status;
    }
    
    public static void main(String arg[]){ // you can use the main method to test 
        System.out.println((new Ex2("John",40)).getValues());
    }
}
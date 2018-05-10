public class Ex2 {
    private String name;
    private String status;
    
    public Ex2(String personName, int age)
    {
        name = personName;
        if(age>=18)
            status="can vote";
        else
            status="cannont vote";
    }
    
    public String getValues(){
        return ""+name+status;
    }
    
    public static void main(String arg[]){
        System.out.println((new Ex2("John",40)).getValues());
    }
}

public class Ex2
{ 
    String name;
    int yearOfBirth;
    boolean senior=false;
    
    public Ex2(String nname, int year){
        name = nname;
        yearOfBirth = year;
        if((2016 - year)>70)
            senior = true;
    }
    
     public String getValues(){
        return ""+name+" "+yearOfBirth+" "+senior;
    }
    public static void main(String arg[]){ // you can use the main method to test your code
        System.out.println((new Ex2("John",1940).getValues()));
    }
}

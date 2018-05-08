public class Ex2 {

private String studentName;
private double marks;

    
    
    public String getValues(){
        return ""+studentName+" "+marks;
    }
    public static void main(String arg[]){ // you can use the main method to test your code
        System.out.println((new Ex2("John",40,50)).getValues());
    }

}

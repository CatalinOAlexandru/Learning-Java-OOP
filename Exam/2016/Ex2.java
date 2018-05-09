public class Ex2 {

private String studentName;
private double marks;

    public Ex2(String sName, double courseworkMarks, double examMarks)
    {
        studentName = sName;
        marks = 0.4* courseworkMarks + 0.6* examMarks;
    }
    
    public String getValues(){
        return ""+studentName+" "+marks;
    }
    public static void main(String arg[]){ // you can use the main method to test your code
        System.out.println((new Ex2("John",40,50)).getValues());
    }

}

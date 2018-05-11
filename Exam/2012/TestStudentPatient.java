//this is a test class for Question 5

public class TestStudentPatient
{

public static void main(String[] args)
{   
    Patient p = new Patient("n","d","m" );
    System.out.println(p.getMedicalHistory());
    p.updateMedicalHistory("med");
    System.out.println(p.getMedicalHistory());
    System.out.println("");
    int[] a = {3, 6, 0};
    Student s= new Student("n","d",a);
    
    for(int i=0; i<s.getMarks().length; i++)
    {System.out.println(s.getMarks()[i]);}
    
    s.updateMarks(22);
    for(int i=0; i<s.getMarks().length; i++)
    {System.out.println(s.getMarks()[i]);} 
}
}

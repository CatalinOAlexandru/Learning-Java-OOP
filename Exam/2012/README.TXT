**********************
WRITE YOUR EXAM NUMBER HERE: 

**********************
IMPORTANT READ CAREFULLY 
**********************

1- There are nine questions in this paper. Answer ALL NINE questions.

2- Edit your code in java files in the BlueJ project, NOT in this file.

3- SAVE your work regularly. It is your responsibility to save it.

4- DO NOT use JOptionPane in the exam.

5- DO NOT change any of the code apart from what is specified in a 
  question. Failing to comply may result in your exam not counting. 
  DO NOT IMPORT additional packages.
  
6- NEVER change methods names and the type and order of parameters
  specified in the question: if the question asks to write a method with 
  signature
      public void Foo(int n, double d)
  then writing: public void foo(int n, double d) will be wrong 
  (f should be capital) and public void Foo(double d, int n) 
  will also be wrong (parameter int should be before parameter double).
  To avoid spelling mistakes you may copy and paste method names from the question.
  
7- Check carefully that the output of your program is EXACTLY the one 
  required by the exercises. For example if asked to print a string s 
  (e.g. "Wrong argument"), print exactly  that string i.e. use 
  System.out.println("Wrong argument"), 
  do not modify the output string.
  
8- NEVER write two classes in the same java file.

9- The Appendix contains help for some methods that can be used in the exam. 
  Notice that not all of these methods will be needed to answer the questions.



**********************
Question 1 [6 Marks]
**********************

In the following class some of the instance variables are wrongly declared: 
Modify only the types in declarations so that the class will compile 
( do not modify the name of the variables or their initial values):



public class Ex1 {

private float x='h';         //modify only the type
private short y=3.14;        //modify only the type
private char s ="double";    //modify only the type
private Account c =false;    //modify only the type

    public void getValuesA(){
    System.out.println(x+" "+y+" ");    
    }

    public void getValuesB(){
    System.out.println(s+" "+c);
    }

}


**********************
Question 2 [6 Marks]
**********************

Insert in the following class a constructor that will initialize the 
instance variables and sum them putting the result in the variable res
so that for example the statement 
(new Ex2(5,40)).getValues() 
will print 
"The result is 45"

public class Ex2 {

private int x;
private int y;
private int res;

    //add the constructor here

    public void getValues(){
    System.out.println("The result is "+res);
    }

}



**********************
Question 3 [9 Marks]
**********************

Consider the following Accumulator class with a missing method 
'prodA(int m)' 
which is supposed to return the product of all elements of the array A 
if such product is less than or equal to m and return m otherwise.
 

For example if A is the array {2,4,3} then
prodA(2) will return 2
prodA(0) will return 0
prodA(50) will return 24


(Hint: the length of an array A is given by A.length)

Insert the code for the body of the method prodA where
marked.

----------

public class Accumulator {
    private int[] A;

    public Accumulator(int[] X) {
        A= new int[X.length];
        for (int i=0; i<X.length; i++)
            A[i] = X[i];
    }

    public int prodA(int m) {
        // insert your code here
    }

}




**********************
Question 4 [7 Marks]
**********************

Fill in the class method main of the class Ex4 so that the program
takes three command line arguments and print the string "yes" if 
the arguments are three integers and are even numbers. The program should print "no" 
if the arguments are three integers and one or more of the three arguments is an odd number.

If the number of command line arguments is not three then the 
program should print "Error"

If any of the three command line arguments is not an integer, a 
NumberFormatException must be handled, and the program should 
print "Wrong argument".

(Hint: to convert Strings to integers use Integer.parseInt(String x)  )


For example 
java Ex4 3 20 23 will print the string "no"
java Ex4 6 4 10 will print the string "yes"
java Ex4 two 4 7 will print  "Wrong argument"
java Ex4 1    will print "Error"
java Ex4 3.14 will print "Error"

public class Ex4 {

  public static void main(String[] args) {
            
  }
}



**********************
Question 5 [12 Marks]
**********************

Consider the following class:

public class Person
{
private String Name;
private String DateOfBirth;

public Person(String n, String d)
{
 Name=n;
 DateOfBirth=d;
}

String getName(){
 return Name;
}

String getDateOfBirth(){
 return DateOfBirth;
}

}


Write two subclasses of the Person class: Patient and Student

The subclass Patient has the additional instance variable
private String MedicalHistory;

The constructor of Patient has signature
public Patient(String name,String dateofbirth, String medicalhistory)
and will initialise the instance variables of the class Patient and 
the superclass Person.

Patient has also the methods

String getMedicalHistory()
which returns the value of the variable MedicalHistory

and the method

void updateMedicalHistory(String med)
which will append the string med to the variable MedicalHistory

so if  MedicalHistory has value "aa" then calling 
updateMedicalHistory("bb") will result in MedicalHistory="aabb"

=====

The subclass Student has the additional instance variable
private int[] Marks;

The constructor of Student has signature
public Student(String name,String dateofbirth, int[] marks )
and will initialise the instance variables of the class Student 
and the superclass Person

Student has also the methods

int[] getMarks()
which returns the value of the variable Marks

and the method
void updateMarks(int mar)

which will put the integer mar in the first zero position of 
the array Marks, so if Marks has value [45,50,0] then updateMarks(60) 
will result in Marks=[45,50,60]

(hint: you can use the keyword break to exit a loop)

NOTE: you can test your code by using the class TestStudentPatient included in the project. If 
TestStudentPatient doesn't compile you have made same syntax error or mispelled some method name.

**********************
Question 6 [13 Marks]
**********************
Notice: this exercise involves the use of Generics.

In the program below, the code in the method HistAndMarks is missing. 
Write the code for this method, which takes as arguments two vectors P 
and S (with P a vector of Patients and S a vector of Students)
and returns the number of persons with the same name in the two vectors 
(ie the number of those who are both students and patients).

For example,
- If the vector S contains only one Student object and P 
one Patient object both with name "John" then HistAndMarks will return 1.
- If the vector S contains five Student objects and P three Patient 
objects and one Student has name John, one Patient has name John,
one Student has name Mary, one Patient has name Mary, and all other 
names mismatch then HistAndMarks will return 2.

You should handle the NullPointerException in case one of the the vectors 
is null. Use the following code when catching the exception:
  System.out.println("Error");
  System.exit(0);
  return 0;
  
For example:  
- If the vector S is empty HistAndMarks should print "Error" 
and terminate.

(Hint: you can use the construct 'for (Student m: S )' to visit the 
vector S. Similar for visiting patients)

import java.util.*;
 public class Ex6 {

  public static int HistAndMarks (Vector<Patient>  P, Vector<Student>  S) {

  }
}



**********************
Question 7 [15 Marks]
**********************

In the following class Ex7 write the code for the following method:

    public void AverageMarks(String fName, String pname)

The method must:
- open the file with the name passed in fName. This is a text file
containing on each line a name and a sequence of integers, for instance

Jules 50 60 40
Ali 45 70 70 90
Emma 45 54 

- the method should read the file until it finds a line beginning
with the string pname. It should then read the numbers on that
line and print their average.
- Finally the method should the close the file fName.
However,
- if the argument pname is not in the file, 
  then the method should print the string pname followed by 
  a single space and the string "No such name"

To test your program, use the file "data.txt" (available in your current 
directory).ooo

As an example, if "data.txt" is
    Jules 50 60 40
    Ali 45 70 70 90
    Emma 45 54 
then
    AverageMarks("data.txt","Jules") should print "50.0"
    AverageMarks("data.txt","Ali") should print "68.75"
    AverageMarks("data.txt","Neil") should print  "Neil No such name"

    Notice: the average should be a double, not an integer.
    
 (Hint: the statement: String[] lines=line.split(" ");   
will put in the array lines the words in the string line separated 
by an empty space, e.g. if line is the string "Emma 4 5 6" then after  
String[] lines=line.split(" "); 
lines[0] is "Emma", lines[1] is "4", lines[2] is "5", etc)

----------

import java.io.*;

public class Ex7 {

    public void AverageMarks(String fName, String pname){

    }

}



**********************
Question 8 [12 Marks]
**********************
**********************
Notice: in this exercises we will use Generics.

Add to the class Ex8 the code for the following method

    public void distinctStud(ArrayList<Student> a)
    
which takes as an argument an ArrayList of Student objects a 
(as defined in Question 5) and prints on screen the names of the 
Student objects in the ArrayList whose average marks are over 70
(This mean you have to compute the average of the numbers in the array marks
in each Student object).
   
For example, if the ArrayList a contains three Student objects, 
the first with name "John" and average marks 65, the second one 
with name "Mary" with average marks 80, the third one with name "Molly" 
with average marks 75 then:
distinctStud(a) 
will print on screen: "Mary Molly " 
(all in one line separated by a single space; a trailing space is acceptable)

(Hint: you can use the construct   
for (Student m: a ) 
to visit the arraylist a)

import java.util.*;
 public class Ex8 {

    public void distinctStud(ArrayList<Student> a){
    }
}



**********************
Question 9 [ 20 Marks]
**********************

Consider the following interfaces

public interface DegreeEligible{
 public void hasEnoughUnits(Student a);
}

public interface DrugEligible{
 public void hasPrescription(Patient a);
}

Part A) Write two classes named CheckDegree and CheckDrug with
CheckDegree implementing DegreeEligible and CheckDrug implementing DrugEligible.

CheckDegree has a constructor with signature
public CheckDegree()
and similarly 
CheckDrug has a constructor with signature
public CheckDrug()

In CheckDegree the method hasEnoughUnits(Student a) will 
check if the argument Student a has more than 8 marks higher than 40
and if so will print "Eligible: " followed by the name of that Student. 
If the argument Student a has less than 8 marks higher than 40
then it will print "Fail: " followed by the name of that Student

For example: 
- If c1 is an instance of CheckDegree and st is an instance of Student 
whose name is "Jack" and has marks [40, 45, 50, 70, 40, 40, 70, 80, 90] 
then 
c1.hasEnoughUnits(st);
will print "Eligible: Jack"
- If c1 is an instance of CheckDegree and st is an instance of 
Student whose name is "Jack"  and has 
marks [5, 10, 30, 10, 40, 40, 70, 80, 10] then 
c1.hasEnoughUnits(st);
will print "Fail: Jack"


About the class CheckDrug:
In CheckDrug the method hasPrescription(Patient a) will check if 
the argument Patient a has a medical history of length greater than 0 
and if so will print "Authorized: " followed by the name of that 
Patient as stored in the object.
if the argument has an empty medical history it will print "Rejected: " 
followed by the name of that Patient as stored in the object.

- If c1 is an instance of CheckDrug and pa is an instance of 
Patient whose name is "Jack" and MedicalHistory="diabetes"
c1.hasPrescription(pa);
will print "Authorized: Jack"
- If c1 is an instance of CheckDrug and pa is an instance of 
Patient whose name is "Jack" and MedicalHistory=""
c1.hasPrescription(pa);
will print "Rejected: Jack"

(Part A is worth 12 marks, 6 for CheckDegree and 6 for CheckDrug)

------------
Part B) Write a class called AllChecks implementing both interfaces and 
containing also the method

public void Check(Person a)

The method Check will check if the person a is an instance of the 
Student class and in that case will call the method
hasEnoughUnits defined as in the previous part and also check if 
the person a is an instance of the Patient class and in 
that case will call the method hasPrescription defined as 
in the previous part.
 
Hence if a is an Person object with name Jack and Jack is a Patient 
then  Check(a) will call hasPrescription.
if Jack is a Student then  Check(a)  will call hasEnoughUnits 

(Part B is worth 8 marks)

  
  
  **********************  END OF EXAMINATION   **********************
  ****************************************************************** 

  ********************** 
  **********************     APPENIDX     **********************
**********************  DOCUMENTATION   **********************
(you may need only some of these methods)
**********************
SOME USEFUL VECTOR METHODS
add(Object o)
    Appends the specified element to the end of this Vector.

elementAt(int index)
    Returns the component at the specified index.

int indexOf(Object elem)
    Searches for the first occurence of the given argument, 
    testing for equality using the equals method.

size()
    Returns the number of components in this vector.

**********************
To check if an object is an instance of a class c use the operator 
instanceof
o instanceof c will return true if o is an instance of c and false 
otherwise.

**********************
Integer.parseInt(String s)
Parses the string argument as an integer. Throws NumberFormatException 
if the string does not contain a parsable integer.

**********************
% is the Remainder operator. (n % m) returns the remainder of the division
of n by m, e.g. 3 % 2 = 1

**********************
To generate a double random number between 0 and 1 you can use
Math.random()

**********************
To get an integer number that shows the number of elements in an array a, 
you can use a.length

**********************
SOME FILE READING CONSTRUCTORS AND METHODS

FileReader(String fileName)
    Creates a new FileReader, given the name of the file to read from.

BufferedReader(Reader in)
    Create a buffering character-input stream that uses a default-sized 
input buffer.

String readLine()
    Read a line of text.

**********************
SOME USEFUL STRING METHODS

char charAt(int index)
    Returns the character at the specified index.   

boolean equals(Object anObject)
    Compares this string to the specified object.  

int indexOf(int ch)
    Returns the index within this string of the first occurrence 
    of the specified character.  

int lastIndexOf(String str)
    Returns the index within this string of the rightmost occurrence 
    of the specified substring.  

int length()
    Returns the length of this string.  

String substring(int beginIndex, int endIndex)
    Returns a new string that is a substring of this string.  

String trim()
    Returns a copy of the string, with leading and trailing 
    whitespace omitted







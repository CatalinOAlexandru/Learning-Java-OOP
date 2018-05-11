**********************
WRITE YOUR EXAM NUMBER HERE: 

**********************
IMPORTANT
**********************

- There are nine questions in this paper. Answer ALL NINE questions.
- Edit your code in java files in the BlueJ project, NOT in this file
- SAVE your work regularly. It is your responsibility to save it.
- DO NOT use JOptionPane in the exam.
- DO NOT change any of the code apart from what is specified in a 
  question. Failing to comply may result in your exam not counting. 
  for example DO NOT IMPORT additional packages.
- NEVER change methods names and type and order of parameters from how they are
  specified in the question: if the question ask to write a method with signature
  public void Foo(int n, double d)
  then writing: public void foo(int n, double d) will be wrong (should be capital f)
  and public void Foo(double d, int n) will also be wrong (parameter int should be before
  parameter double)
- Check carefully that the output of your program is EXACTLY the one 
  required by the exercises. For example if asked to print a string s 
  (e.g. "Wrong argument"), print exactly  that string i.e. use System.out.println("Wrong argument"), 
  do not modify the output string.
- NEVER write two classes in the same java file.
- The Appendix contains help for some methods that can be used in the exam. 
  Notice that not all of these methods will be needed to answer the questions.



**********************
Question 1 [6 Marks]
**********************

In the following class some of the instance variables are wrongly declared: 
Modify only the types in declarations so that the class will compile 
( do not modify the name of the variables or their initial values):



public class Ex1 {

private int x='h';      //modify only the type
private boolean y=3.14;     //modify only the type
private double s ="double";       //modify only the type
private float c =false;    //modify only the type

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

Insert in the following class a contructor that will initialize the instance variables, 
so that for example the statement (new Ex2("Mark",25,"London")).getValues() will print 
"My name is Mark. I am 25. I live in London "

public class Ex2 {

private String s;
private  int x;
private String t;

    //add the constructor here

    public void getValues(){
    System.out.println("My name is "+s+". I am "+x+". I live in "+t);
    }

}



**********************
Question 3 [9 Marks]
**********************

Consider the following class Accumulator with a missing method 'getSumOverM(int m)' 
which is supposed to return the sum of all elements of the array A which are greater or equal to m.
 
If no element in A is greater or equal to m then the method should return 0. 
For example if A is the array {2,4,3} then
getSumOverM(3) will return 7
getSumOverM(2) will return 9
getSumOverM(5) will return 0


(Hint: the length of an array A is given by A.length)

Insert the code for the body of the method getSumOverM.

----------

public class Accumulator {
    private int[] A;

    public Accumulator(int[] X) {
        A= new int[X.length];
        for (int i=0; i<X.length; i++)
            A[i] = X[i];
    }

    public int getSumOverM(int m) {
        . . .
    }

}




**********************
Question 4 [7 Marks]
**********************

Fill in the class method main of the class Ex4 with code that 
take two command line arguments and sum them.

If any command line arguments is not an integer, a NumberFormatException 
must be handled, and the program will print "Wrong argument".

If the number of command line arguments is not two then the program will print "Error"

(Hint: to convert Strings to integers use Integer.parseInt(int x)  )


For example 
java Ex4 3 20 will print  23
java Ex4 6 4 will print 10
java Ex4 two 4 will print  "Wrong argument"
java Ex4 1  will print "Error"


public class Ex4 {

  public static void main(String[] args) {
            
  }
}



**********************
Question 5 [12 Marks]
**********************

Consider the following class:


public class SecurityRights
{
private boolean right;
private boolean canreadSecret;
String SECRET="the secret is 42";


public SecurityRights(boolean r)
{
 right =r;
 if (r) canreadSecret=true; else canreadSecret=false;
}

boolean getRight(){
 return right;
}

boolean canReadSecret(){
 return canreadSecret;
}

String getSecret(){
 if (canreadSecret) return SECRET; else return "access denied";
}

}


Write two subclasses of the SecurityRights class. 
HighRights, LowRights
both classes have an additional instance variable
private String name;

The constructor of HighRights has signature
public HighRights(String n)
and will initialise the string name and the instance variable named 'right' in the superclass to true


The constructor of LowRights has signature
public LowRights(String n)
and will initialise the string name and the instance variable named 'right' in the superclass to false

both subclasses have a getter for the variable name with signature
String getName()

So if high is an instance of HighRights then 
high.getSecret(); 
should return "the secret is 42"

and if low is an instance of LowRights then
low.getSecret(); 
should return "access denied"


**********************
Question 6 [13 Marks]
**********************
Notice: in this exercises we will NOT use Generics

In the following program, the code in the method CountHighs is missing. 
Write the code for this method, which takes as argument the vector m  and 
returns the number of objects in the vector that are instances of HighRights

The method should also:
- check that the elements extracted from the vector are indeed instances 
  of the classes HighRights or LowRights. If an element is not an instance of such classes, 
  then the method should return -1. 
  
- handle the NullPointerException in case the vector is null. Use the following 
  code when catching the occurring exception:
  System.out.println("Error");
  System.exit(0);
  return 0;

  (Hint: 
1- use m.size() to get the number of elements in the vector m
2- use the keyword instanceof to check if an object is an instance of a class)

For example, 
if the vector m contains only two HighRights objects and one LowRights objects then CountHighs(m) will return 2
if the vector m contains only two HighRights objects and one String objects then CountHighs(m) will return -1
if the vector m contains only five LowRights objects no HighRights objects then CountHighs(m) will return 0

  
import java.util.*;
@SuppressWarnings( "unchecked" ) public class Ex6 {

    public static int CountHighs (Vector m) {

    }
}



**********************
Question 7 [15 Marks]
**********************
(This exercise simulates a basic password check:)

In the following class Ex7 write the code for the following method:

    public void findPassw(String fName, String pname, String pwd)

The method must:
- first open the file fName and 
- then look in the file for the string pname and check if the first string after pname is equal to the string pwd;
if it is true it will print the string pname followed by "OK"; if it is false it will print the string pname 
followed by "DENIED".
- Finally it will the close the file fName.

However,
- if the argument pname is not in the file, 
  then the method should print the string pname followed by "No such name"

To test your program, use the file "data.txt" (available in your current directory), each line of which 
contains two strings, the first string is a name the second string is the password.

As an example, if "data.txt" is
    Jules aww
    Ali 45uut
    Emma werdestein2
then
    findPassw("data.txt",Ali, 45uut) will print "Ali OK"
    findPassw("data.txt",Ali, 45uut99) will print "Ali DENIED"
    findPassw("data.txt",Neil,lk) will print "Neil No such name"

 (Hint: the statement: String[] lines=line.split(" ");   
    will put in the array lines the word in the string line separated by an empty space, e.g. if line is
    "Emma werdestein2" then after  String[] lines=line.split(" "); lines[0] is "Emma" and lines[1] is "werdestein2")
----------

import java.io.*;

public class Ex7 {

    public void findPassw(String fName, String pname, String pwd){
        . . .
    }

}



**********************
Question 8 [12 Marks]
**********************
**********************
Notice: in this exercises we will use Generics.
Add to the class Ex8 the code for the following method

    public void printHighUsers(ArrayList<SecurityRights> a)
    
which takes as an argument an ArrayList of SecurityRights objects a 
(as defined in Question 5) and prints on screen the names of the HighRights objects in the ArrayList
   
For example, if the ArrayList a contains three SecurityRights objects, the first being a LowRights with 
name "John", the second one a HighRights with name "Mary" and the third one a HighRights with name "Keith" then:
printHighUsers(a) will print on screen: "Mary Keith"

(Hint: you can use the construct  for (SecurityRights m: a ) to visit the arraylist m)

import java.util.*;
 public class Ex8 {

    public void printHighUsers(ArrayList<SecurityRights> a){
    }
}



**********************
Question 9 [ 20 Marks]
**********************

Consider the following interfaces

public interface HighClearance{
 public void hasHighRight(SecurityRights a);
}

public interface LowClearance{
 public void hasLowRight(SecurityRights a);
}

-A) Write two classes named Checker1 and Checker2 each implementing both interfaces.
Checker1 has a constructor with signature
public Checker1()
and similarly 
Checker1 has a constructor with signature
public Checker2()

in Checker1 the method hasHighRight(SecurityRights a) will check if the argument 
is an instance of HighRights and if so will print "1checkHigh: " followed by the name of that HighRights object.
if the argument is not an instance of HighRights it will print "1checkHigh: DENIED".
The method hasLowRight(SecurityRights a)  will check if the argument 
is an instance of LowRights and if so will print "1checkLow: " followed by the name of that LowRights object.
if the argument is not an instance of LowRights it will print "1checkLow: OK".

The class Checker2 is similar:
in Checker2 the method hasHighRight(SecurityRights a) will check if the argument 
is an instance of HighRights and if so will print "2checkHigh: " followed by the name of that HighRights object.
if the argument is not an instance of HighRights it will print "2checkHigh: DENIED".
The method hasLowRight(SecurityRights a)  will check if the argument 
is an instance of LowRights and if so will print "2checkLow: " followed by the name of that LowRights object.
if the argument is not an instance of LowRights it will print "2checkLow: OK".

For example 
if c1 is an instance of Checker1 and h is an instance of HighRights whose name is "Jack" then 
c1.hasHighRight(h);
will print "1checkHigh: Jack"
if c1 is an instance of Checker1 and l is an instance of LowRights whose name is "Jack" then 
c1. hasLowRight(l);
will print "1checkLow: Jack"
if c1 is an instance of Checker1 and l is an instance of LowRights whose name is "Jack" then 
c1. hasHighRight(l);
will print "1checkHigh: DENIED"

(This part is worth 12 marks)

-B) Write a class called AllChecks with the following class method:

public static void Check(SecurityRights a, SecurityRights b)

In the Check method one instance c1 of Checker1 is created and 
hasHighRight(a) and hasLowRight(b)  are called on c1 (in this order);
then one instance c2 of Checker2 is created and the hasHighRight(a) method and hasLowRight(b)  
are called on c2(in this order)
 
 Hence if a is an HighRights object with name Jack and b is a LowRights object with name Paul then
 Check(a,b) will print
 "1checkHigh: Jack 1checkLow: Paul 2checkHigh: Jack 2checkLow: Paul "

 (This part is worth 8 marks)

  
  
  **********************  END OF EXAMINATION   **********************


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
To check if an object is an instance of a class c use the operator instanceof
o instanceof c will return true if o is an instance of c and false otherwise.

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
    Create a buffering character-input stream that uses a default-sized input buffer.

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







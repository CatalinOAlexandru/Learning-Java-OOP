**********************
WRITE YOUR EXAM NUMBER HERE: 

**********************
IMPORTANT READ CAREFULLY
**********************

 1- There are nine questions in this paper. Answer ALL NINE questions.
 2- Edit your code in java files in the BlueJ project, NOT in this file
 3- SAVE your work regularly. It is your responsibility to save it.
 4- DO NOT use JOptionPane in the exam.
 5- DO NOT change any of the code apart from what is specified in a 
  question. Failing to comply may result in heavy penalties. 
 6- DO NOT IMPORT additional packages.
 7- NEVER change method names and the type and order of parameters
  specified in the question: if the question asks to write a method with 
  signature
      public void Foo(int n, double d)
  then writing: public void foo(int n, double d) will be wrong 
  (f should be capital) and public void Foo(double d, int n) 
  will also be wrong (parameter int should be before parameter double)
 8- Check carefully that the output of your program is EXACTLY the one 
  required by the exercises. For example if asked to print a string s 
  (e.g. "Wrong argument"), print exactly  that string i.e. use 
  System.out.println("Wrong argument"), 
  do not modify the output string.
 9- NEVER write two classes in the same java file.
10- If a question provides some code to test your code, to pass those tests is not a guarantee that you will get marks; 
the tests usually only guarantee that you have made no syntax errors
11- The Appendix contains help for some methods that can be used in the exam. 
  Notice that not all of these methods will be needed to answer the questions. 
  If available on the machine you are also allowed to use the java api documentation
12- ONLY use System.exit(0) if the question says so. Never use System.exit with any other argument
  e.g. NEVER use System.exit(-1)


**********************
Question 1 [6 Marks]
**********************

In the following class some of the instance variables are wrongly declared: 
Modify only the types in declarations so that the class will compile 
(do not modify the name of the variables or their initial values):

public class Ex1 {

private Student y='h';     //modify only the type
private float x="hello";      //modify only the type
private Account c =false;    //modify only the type
private int s ="double";       //modify only the type

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

Insert in the following class a constructor that will initialise the instance variables studentName and marks. 
The constructor has three arguments: a string sName and two doubles courseworkMarks and examMarks; studentName is initialized by sName. 
The instance  variable marks is initialized in the constructor according to the formula
marks = 0.4* courseworkMarks + 0.6* examMarks

For example 
the statement (new Ex2("John",40,50)).getValues() will return  "John 46.0”
the statement (new Ex2("John",50,60)).getValues() will return  "John 56.0”

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



**********************
Question 3 [9 Marks]
**********************

Consider the following Accumulator class with missing code for the method 
'twiceSumA()'. 
twiceSumA should return the sum of the elements of the array A multiplied by 2.
 
For example if A is the array {2,4,3,5,8} then twiceSumA() will return 44
if A is the array  {10,5,1}  twiceSumA() will return 32

(Hint: the length of an array A is given by A.length)
    
Insert the code for the body of the method twiceSumA.

----------

public class Accumulator {
    private int[] A;

    public Accumulator(int[] X) {
        A= new int[X.length];
        for (int i=0; i<X.length; i++)
            A[i] = X[i];
    }

    public int twiceSumA() {
      
    }
    
     public static void main(String args[]){ // you can use the main method to test your code
        
      int[]  A = {2,4,3,5,8};
      
      int r=new Accumulator(A).twiceSumA(); //change argument to test different cases
      System.out.println(r);
    }

}



**********************
Question 4 [7 Marks]
**********************

Fill in the class method main of class Ex4 with code that multiplies three command line arguments
if these are numbers of type double.
If the user provides three command line arguments then the product of the command line arguments should be printed.
if the user provides less than three or more than three command line arguments the program should print
"number of arguments invalid" and terminate (you can test for the number of arguments with args.length for this purpose).
If one of the three command line arguments is not a number the program should print “invalid operation” and terminate (you can use NumberFormatException for this purpose).

Notice hence that 
java Ex4 aa bb cc         will print “invalid operation”  
but 
java Ex4 aa bb cc dd       will print "number of arguments invalid" 
because invalid operation is only when there are three arguments and not all are numbers

other examples
java Ex4 3             will print  "number of arguments invalid"
java Ex4 3 2 2         will print  12.0
java Ex4 3.0 2.0 2.0         will print  12.0
java Ex4 5 1           will print "number of arguments invalid"
java Ex4 3 2 2  5 6    will print ”number of arguments invalid"
java Ex4               will print ”number of arguments invalid"

public class Ex4 {

  public static void main(String[] args) {
            
  }
}


hint:  use Double.parseDouble(String s)   to (attempt to)  convert a string to a double 

**********************
Question 5 [12 Marks]
**********************

Consider the following class:

public class Record
{
   private String ID;
   private int length;

   
   public Record(String iid, int len) {
       ID =iid;
       length =len;
    }
    
   public String getID(){
       return ID;      
    }
    
    public int getLength(){
       return length;      
    }

}

Write a subclass of the Record class called MovieRecord

MovieRecord has two instance variables:
String genre
and
String[] keywords

The constructor of MovieRecord has signature
      public MovieRecord(String iid, int len, String gen, String[] keys )
this constructor will initialize the instance variables in the class and its superclass. 

The class MovieRecord has getters for the instance variables genre and keywords called getGenre() and getKeywords() respectively.

MovieRecord has also a method getRating with signature 

public int getRating()

this method will return 16 if the array keywords contains the keyword "violence", else it will return 0.
For example if keywords is defined as follows
String[] keyws={"a","violence"};
then 
System.out.println(new MovieRecord("a",1,"b",keyws).getRating());
will print 16

**********************
Question 6 [13 Marks]
**********************

In the following program, the code in the method extractRecord is missing. 
Write the code for this method, which takes as arguments: ArrayList<Record> r1,ArrayList<Record> r2, 
and returns an ArrayList<Record> object, containing all records in r1 and r2 whose ID starts with the character "X"

For example if r1 contains two records with IDs "Smith" and "XGreen" and r2 contains two records with IDs "XDoor" and "Mary"
then the method will return an arraylists with the two records with ID "XGreen" and "XDoor"

The method should also:
  
- handle the the case of any of the arguments being null. In that case the method
should print "Error" and return null


import java.util.*;

public class Ex6 {

    public static ArrayList<Record>  extractRecord (ArrayList<Record> r1,ArrayList<Record> r2) {

        }

    
 public static void main(String[] args){ // you can use this main method to test your code
        ArrayList<Record> r1 = new ArrayList<Record>();
        r1.add(new Record("Smith",60));
        r1.add(new Record("XGreen",50));
        ArrayList<Record> r2 = new ArrayList<Record>();
        r2.add(new Record("XDoor",70));
        r2.add(new Record("Mary",80));
        ArrayList<Record> combined = extractRecord (r1, r2);
        for (int i=0; i<combined.size();i++){
           System.out.print(combined.get(i).getID()+" ");
        }
    }
}


Hint: you can use st1.startsWith(st2)  to test if the string sr1 starts with the prefix st2

**********************
Question 7 [15 Marks]
**********************

In the class Ex7 write the code for the method readRecords(String fName). The method will return an ArrayList<Record> object 
whose elements are Record objects which are created using the ID and length from each line of the file fName.
Each line of the file fName has the following structure:
Id len

As an example, if "dati.txt" is
    John  60
    Anna  80
then
    readRecords("dati.txt") will return an ArrayList<Record> object whose elements are two Record objects, the first created with
new Record(“John”, 60) and the second created with new Record(“Anna”, 80)

However,

- if an IOException occurs, the method should print "Problem reading file: Error" and return null

To test your program, use the file "dati.txt" (available in your current 
directory), each line of which contains two strings. dati.txt consists of the following three lines
A 20
B 30
C 40


 Hint: 
     the statement: String[] lines=line.split(" ");   
    will put in the array lines the words in the string line separated  by an empty space, e.g. if line is
    "John 1000" then after  String[] lines=line.split(" "); 
    lines[0] is "John", lines[1] is "1000")

----------

import java.util.*;
import java.io.*;   

public class Ex7 {

    public static ArrayList<Record> readRecords(String fName){

    }
      
    public static void main(String[] args){ //you can use this main method to test your code
        try{
            ArrayList<Record> result=readRecords("dati.txt");
                for (int i=0;i<result.size();i++){
                    System.out.print(result.get(i).getID()+" "+result.get(i).getLength()+" ");
                }
                System.out.println();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}


**********************
Question 8 [12 Marks]
**********************

In the following program, the code in the method sortRecords is missing. 
Write the code for this method, which takes as argument the ArrayList of Record objects rec and returns the 
ArrayList of Record objects rec sorted by the length.
    
For example, if rec contains three Records objects the first with ID John and length 60, the second with ID Paul 
and length 30, the third with ID Ali and length 35 then sortRecords(rec) will return the arraylist where 
the first Record has with ID Paul and length 30, the second has ID Ali and length 35 and the 
third one has ID John and length 60

import java.util.*;
 public class Ex8 {

    public static ArrayList<Record> sortRecords(ArrayList<Record>  rec){
       
    }
  public static void main(String[] args){ //you can use this main method to test your code
        ArrayList<Record>  recs= new ArrayList<Record> ();
        recs.add(new Record("John",60));
        recs.add(new Record("Paul",30));
        recs.add(new Record("Ali",35));
        ArrayList<Record> recss= sortRecords(recs);
        for (int i=0;i<recs.size();i++){
        System.out.print(recss.get(i).getID()+" "+recss.get(i).getLength()+" ");
    }
  }
}


**********************
Question 9 [ 20 Marks]  
**********************


Write a subclass of Record called SecureRecord.
The constructor SecureRecord  has signature
public SecureRecord(String id, int len, String key)

the constructor calls the constructor of the superclass on an encrypted id as explained below.

To encrypt and decrypt the class SecureRecord has three class methods with the following signatures:

    public static int[] encrypt(String content,String key)
    
    public static String decrypt(int[] content,String key)
    
    public static String makeString(int[] content)


The method encrypt adds to the i-th character c in the string content (seen as the integer (int)c)
 the i%key.length() character (also seen as an integer) in the string key (% is the modulus operator)

for example if content is "b" and the key is "x" then the encryption is:  (int)'b'+(int)'x'= 98+120=218

for example encrypt("hello","mum") should return the array 'h'+'m', 'e'+'u', 'l'+'m', 'l'+'m', 'o'+'u' resulting in the array
{213,218,217,217,228}

The method decrypt is the inverse of encrypt, i.e. should subtract from the i-th element c of the array the i%key.length() integer in the string key and convert the resulting integer into a character that is then concatenated with the previous characters.

For example decrypt({213,218,217,217,228},"mum") should return the string "hello"

you should verify that decrypt(encrypt("hello","mum"),"mum")="hello",
i.e. decrypt is the inverse of encrypt.

Finally the method makeString should take an array of integers and return a string given by the concatenation of the character representation of all elements in the array, 
for example makeString({103,105,107,110}) will return the string "gikn"

The constructor of SecureRecord will then pass as ID to the super constructor the element makeString(encrypt(id,key)) 
and the second argument of super will be len

(this part is worth 12 marks)


b)
Write a class called ProcessSecureRecords with a method with signature

    public static ArrayList<Record> decryptRecords(ArrayList<Record>  rec, String key)

this method takes an ArrayList of Records objects rec and generates an ArrayList of Records objects whose elements are the 
decryption of the object in rec that are instance of SecureRecord


For example if the ArrayList recs is defined as follows
       ArrayList<Record> recs=new ArrayList<Record>();
        recs.add(new SecureRecord("papa",10,"mum"));
        recs.add(new SecureRecord("dude",10,"mum"));
        recs.add(new SecureRecord("dreade",100,"mum"));
        recs.add(new Record("papa1",10));  
        recs.add(new Record("papa2",100));      

then decryptRecords(recs,"mum") will return the arraylist 
{new Record("papa",10),new Record("dude",10),new Record("dreade",10)}

DO not write a constructor for ProcessSecureRecords (so that java will insert the default empty constructor)

HINT: for decryptRecords you can use the class method decrypt from SecureRecord;
you may also want to define an additional method in ProcessSecureRecords with signature     
public static int[] fromString(String content)
which is the "inverse' of the method makeString in SecureRecord (fromString is helpful because the ID is a string while
decrypt requires an int[])

(this part is worth 8 marks)



  
  **********************     APPENDIX     **********************
  **********************  DOCUMENTATION   **********************
(you may need only some of these methods)
**********************
SOME USEFUL ARRAYLIST METHODS
boolean add(E e)
          Appends the specified element to the end of this list.
 void   add(int index, E element)
          Inserts the specified element at the specified position in this list.

get(int index)
          Returns the element at the specified position in this list.

size()
    Returns the number of components in this list.

set(int index, E element)
Replaces the element at the specified position in this list with the specified element.

remove(int index)
Removes the element at the specified position in this list.

remove(Object o)
Removes the first occurrence of the specified element from this list, if it is present.

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

to read a file until its last line you should check if the line is null, e.g. if the current line of the file is in the String line then you can use

while(line != null) ...

**********************
SOME USEFUL STRING METHODS

char charAt(int index)
    Returns the character at the specified index.   


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





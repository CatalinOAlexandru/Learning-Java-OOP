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
7- NEVER change methods names and the type and order of parameters
specified in the question: if the question asks to write a method with 
signature
public void Foo(int n, double d)
then writing: public void foo(int n, double d) will be wrong 
(f should be capital) and public void Foo(double d, int n) 
will also be wrong (parameter int should be before parameter double)
8- Check carefully that the output of your program is EXACTLY the one 
required by the exercises. For example if asked to print a string s 
(e.g. "Wrong argument"), print exactly that string i.e. use 
System.out.println("Wrong argument"), 
do not modify the output string.
9- NEVER write two classes in the same java file.
10- If a question provide some code to test your code, to pass those tests is not a guarantee that you will get marks; the tests usually only guarantee that 
you have made no syntax errors
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
( do not modify the name of the variables or their initial values):

public class Ex1 {

private Account y=10.05; //modify only the type
private char[] x='h'; //modify only the type
private int c =false; //modify only the type
private float s ="double"; //modify only the type

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

Insert in the following class a constructor that will initialise the instance variables name and status. 
The constructor has two arguments: a string personName and an integer age; name is initialized by personName.
About the instance variables status: if age is less than 65 the constructor initializes the instance variable status to "is of working age" 
otherwise the constructor initializes the instance variable status to "is of retirement age".
For example 
the statement (new Ex2("John",40)).getValues() will return "John is of working age"
the statement (new Ex2("John",80)).getValues() will return "John is of retirement age"

public class Ex2 {

private String name;
private String status;


public String getValues(){
return ""+name+status;
}
public static void main(String arg[]){ // you can use the main method to test your code
System.out.println((new Ex2("John",40)).getValues());
}

}

**********************
Question 3 [9 Marks]
**********************

Consider the following Accumulator class with missing code for the method 
'getOverM(int m)'. 
getOverM should return the index of the first element of the array A whose 
value is greater or equal to m.

If no element in A has index greater or equal to m then the method 
should return -1. 
For example if A is the array {2,4,3,5,8} then
getOverM(3) will return 1
getOverM(2) will return 0
getOverM(7) will return 4
getOverM(20) will return -1


(Hint: the length of an array A is given by A.length)

Insert the code for the body of the method getOverM.

----------

public class Accumulator {
private int[] A;

public Accumulator(int[] X) {
A= new int[X.length];
for (int i=0; i<X.length; i++)
A[i] = X[i];
}

public int getOverM(int m) {

}

public static void main(String args[]){ // you can use the main method to test your code

int[] A = {2,4,3,5,8};

int r=new Accumulator(A).getOverM(3); //change argument to test different cases
System.out.println(r);
}

}


**********************
Question 4 [7 Marks]
**********************

Fill in the class method main of class Ex4 with code that 
create an array of size 3 containing strings and fills it with command line arguments.
The user should provide at least two command line arguments.
If the user provides two or three command line arguments then the second element of the
array should be printed.
However if the user provides more than three command line arguments an 
ArrayIndexOutOfBoundsException should be thrown and the program should print
"Too many arguments".


For example 
java Ex4 A B C will print the string "B"
java Ex4 A B will print the string "B"
java Ex4 A B C D will print the string "Too many arguments"

public class Ex4 {

public static void main(String[] args) {

}
}


**********************
Question 5 [12 Marks]
**********************

Consider the following class:

public class Clearance
{
private String name;
private String SECRET="some secret data";
private boolean highLevel;
private boolean authorized;

public Clearance(String pname, boolean l)
{
highLevel =l;
if (highLevel) authorized=true; else authorized=false;
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
if (authorized) return SECRET; else return "non-authorized";
}

public void setSecret(String sec){
if (authorized) SECRET=sec;
}

}

Write two subclasses of the Clearance class. 
HighClearance, LowClearance

The constructor of LowClearance has signature
public LowClearance(String pname)
this constructor will initialise the string name in the superclass to pname and the instance variable named 'highLevel' in the superclass to false

The constructor of HighClearance has signature
public HighClearance(String pname)
this constructor will initialise the string name in the superclass to pname and the instance variable named 'highLevel' in the superclass to true

So if high is an instance of HighClearance then 
high.getSecret(); 
should return "some secret data"

and if low is an instance of LowClearance then
low.getSecret(); 
should return "non-authorized"

Also the class HighClearance 
1) has an additional variable with signature
private String logs;
2) overrides the super class method setSecret with
public void setSecret(String sec)
which first call the super class method setSecret with the argument sec and then
add to the variable logs the string sec.

Hence if high is an instance of HighClearance and logs has value "the secret so far" then after
high.setSecret("new secret");

the variable SECRET in the superclass should have value "new secret" and the variable logs in high should be updated
to "the secret so far new secret" 
(notice the space between "the secret so far" and "new secret")

the class HighClearance has a getter method for the variable logs with signature

public String getLogs()

**********************
Question 6 [13 Marks]
**********************

In the following program, the code in the method peopleClearance is missing. 
Write the code for this method, which takes as argument the ArrayList clearances and 
returns the names of people in clearances that are instances of HighClearance

The method should also:

- handle the NullPointerException in case the vector is null. Use the following code when catching the occurring exception:
return("Error");

(Hint: 
1- use m.size() to get the number of elements in the ArrayList m
2- use the keyword instanceof to check if an object is an instance of a class)

For example, 
-if clearances contains only two HighClearance objects the first with name "Mark" and the second with name "John" then peopleClearance will return the string
"Mark John" (in that order)
-if clearances contains one HighClearance object and one LowClearance objects and the HighClearance object has name "Mark" then peopleClearance will return 
the string "Mark"
-if clearances is null peopleClearance will return the string "Error"


import java.util.*;

public class Ex6 {

public static String peopleClearance (ArrayList<Clearance> clearances) {

}
public static void main(String[] args){ // you can use this main method to test your code
ArrayList<Clearance> clear= new ArrayList<Clearance>();
clear.add(new HighClearance("Mike"));
clear.add(new HighClearance("John"));
System.out.println(peopleClearance(clear));
}
}


**********************
Question 7 [15 Marks]
**********************

In the class Ex7 write the code for the method logSecrets(String fName)

The method must:
- first open the file fName and 
- then look in each line in the file if the line begins with the word "SECRET" and in that case add the following word to the string to return

However,

- if an IOException occurs, 
then the method should return "IO Error"

To test your program, use the file "data.txt" (available in your current 
directory), each line of which contains two strings,

As an example, if "data.txt" is
John nosecret
SECRET meeting
SECRET 300
then
logSecrets("data.txt") will return "meeting 300"

(Hint: the statement: String[] lines=line.split(" "); 
will put in the array lines the word in the string line separated 
by an empty space, e.g. if line is
"John 1000" then after String[] lines=line.split(" "); 
lines[0] is "John" and lines[1] is "1000")
----------

import java.io.*;

public class Ex7 {

public static String logSecrets(String fName){

}

public static void main(String[] args){ //you can use this main method to test your code
System.out.println(logSecrets("data.txt"));
}

}

**********************
Question 8 [12 Marks]
**********************


Add to the class Ex8 (below) the code for the following method

public ArrayList<Clearance> raiseClearance(ArrayList<Clearance> clearances, String pname)

which takes as arguments an ArrayList of Clearance objects named clearances and a String pname and returns an ArrayList containing the same elements as 
in clearances apart from the first occurrence of a LowClearance object with name equal to pname which is replaced with a HighClearance object with the same name.

For example, if the ArrayList clearances contains three Clearance objects, the first is a LowCLearance 
object with name "John", the second is a LowCLearance object with name "Mark",
the third is a HighCLearance object with name "John", then

raiseClearance(clearances, "Mark")

will return the ArrayList with three Clearance objects, the first is a LowCLearance 
object with name "John", the second is a HighCLearance object with name "Mark",
the third is a HighCLearance object with name "John". Hence only the second element has changed: it was 
a LowCLearance object with name "Mark" and it has become a HighCLearance object with name "Mark".

Notice: the method raiseClearance doesn't modify the ArrayList clearances but creates a new ArrayList where each element comes either from clearances 
is a new HighCLearance object


import java.util.*;
public class Ex8 {

public static ArrayList<Clearance> raiseClearance(ArrayList<Clearance> clearances, String pname){


}
public static void main(String[] args){ //you can use this main method to test your code

ArrayList<Clearance> clear= new ArrayList<Clearance>();
clear.add(new HighClearance("Mike"));
clear.add(new LowClearance("John"));
ArrayList<Clearance> clear2= raiseClearance(clear,"John");
for (Clearance a:clear)
System.out.print(a.getName()+" "+a.isAuthorized());
}
}


**********************
Question 9 [ 20 Marks] 
**********************

Consider the following interfaces

public interface SecretAct{
public String noDisclosure();
}

public interface National{
public String passport();
}

a) 
Write a subclass of Clearance called TopClearance implementing both interfaces. Apart from implementing both interfaces TopClearance will be the same as 
HighClearance, i.e. the constructor 
public TopClearance(String pname)
will initialise the superclass name to pname and set highLevel to true.

The method noDisclosure in TopClearance will return a sequence of the symbol '*' as long as the secret in Clearance.
Hence if for example top is the name of an instance of TopClearance and top.getSecret() is "magic" then 
top.noDisclosure() will return "*****" because "magic" has length 5.

The method passport in TopClearance will return the first two characters of the name in Clearance.
Hence if for example top is the name of an instance of TopClearance and top.getName() is "Mark" then 
top.passport() will return "Ma".

(This part is worth 8 marks)

b)
Define Clearance as an interface, i.e. define an interface called ClearanceInterface whose method signature is the same as Clearance. 
Now define a class called HighClear implementing ClearanceInterface and having the same behaviour as HighClearance, so HighClear has a constructor
public HighClear(String pname)

if high is an instance of HighClear 
and the variable name has value "Mark" and the variable SECRET has value "some secret" then
high.getSecret() will return "some secret"
high.isAuthorized() and high.isHighLevel() will both return true
high.getName() will return "Mark"
high.setSecret("a new secret")
will update the value of SECRET to "a new secret"

(This part is worth 12 marks)



********************** APPENIDX **********************
********************** DOCUMENTATION **********************
(you may need only some of these methods)
**********************
SOME USEFUL ARRAYLIST METHODS
boolean add(E e)
Appends the specified element to the end of this list.
void add(int index, E element)
Inserts the specified element at the specified position in this list.

get(int index)
Returns the element at the specified position in this list.

size()
Returns the number of components in this list.

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
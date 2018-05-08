**********************
WRITE YOUR EXAM NUMBER HERE: 


**********************
IMPORTANT READ CAREFULLY
**********************

 1- There are nine questions in this paper. Answer ALL NINE questions.
 2- Edit your code in the java files in the BlueJ project, NOT in this file
 3- you need to click the "Start Exam" button when you start the exam, this is very important.
 Save regularly your work by clicking "save" in the bluej project menu 
 (however never use "save as" and change the name of the bluej project, just click "save").
 When you finish the exam, save the bluej project, click "quit" the bluej project and then click  "Quit Exam" button,
 4- Never use JOptionPane, never use System.Exit(-1) (or any other number different from 0, i.e. only System.Exit(0) is allowed).
 5- DO NOT change any of the code apart from what is specified in a question. Failing to comply may result in heavy penalties. 
 6- DO NOT IMPORT additional packages apart from packages from the java standard API.
 7- NEVER change method names and the type and order of parameters
  specified in the question: for example if the question asks to write a method with 
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
10- You have available the java documentation: to access it using bluej click "Help->Java Class Libraries"



**********************
Question 1 [6 Marks]
**********************

In the following class some of the instance variables are wrongly declared: 
Modify only the types in declarations so that the class will compile 
(do not modify the name of the variables or their initial values):

----------
public class Ex1 {

private int y='h';     //modify only the type
private double x="hello";      //modify only the type
private Account c ='c';    //modify only the type
private int s =3.4;       //modify only the type

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

Insert in the following class a constructor that will initialise the instance variables name, yearOfBirth and senior. 
The constructor has two arguments: a string nname and an integer year; name is initialized by nname. yearOfBirth is initialized
to year.
The instance  variable senior is initialized in the constructor to true if the difference between 2016 and year is >70,
otherwise senior is initialized to false;

For example 
the statement (new Ex2("John",1940)).getValues() will return  "John 1940 true”
the statement (new Ex2("John",2000)).getValues() will return  "John 2000 false”


----------
public class Ex2
{ 
    String name;
    int yearOfBirth;
    boolean senior=false;
    
    public Ex2(String nname, int year){
        
    }
    
     public String getValues(){
        return ""+name+" "+yearOfBirth+" "+senior;
    }
    public static void main(String arg[]){ // you can use the main method to test your code
        System.out.println((new Ex2("John",1940).getValues()));
    }
}


**********************
Question 3 [10 Marks]
**********************

Consider the following Accumulator class with missing code for the method 
SumA(int n). 
SumA should return the sum of the elements of the array A up to n-th element and then add n to the total sum.
 
For example if A is the array {2,4,3,5,8} then SumA(3) will return 12, because (2+4+3)+3=12

(Hint: the length of an array A is given by A.length)
    
Insert the code for the body of the method SumA.

----------
{
    private int[] A;

    public Accumulator(int[] X) {
        A= new int[X.length];
        for (int i=0; i<X.length; i++)
            A[i] = X[i];
    }

    public int SumA(int n) {
       
    }
    
     public static void main(String args[]){ // you can use the main method to test your code
        
      int[]  A =  {2,4,3,5,8};
      
      int r=new Accumulator(A).SumA(3); //change argument to test different cases
      System.out.println(r);
    }
}




**********************
Question 4 [10 Marks]
**********************

Fill in the class method main of class Ex4 with code that:
check if there are three command line arguments. If there are not three command line arguments the method will print
"number of arguments invalid" and finish.
If there are three command line arguments the method will check if the first command line argument is "1": 
if so it will then print the concatenation of the second and third command line argument.
If the first command line argument is instead "2" then the method will print the concatenation of the third 
and second command line argument.
If the first command line argument is neither "1" nor "2" the method will  print "undefined"

For example:
java Ex4 a             will print  "number of arguments invalid"
java Ex4 3 4 5 6 7     will print  "number of arguments invalid"
java Ex4 3 a b         will print  "undefined"
java Ex4 1 a b         will print  ab
java Ex4 2 a b         will print  ba

----------
public class Ex4 {

  public static void main(String[] args) {
            
  }
}




**********************
Question 5 [15 Marks]
**********************

Consider the following class:


public class Account
{
    private String name;
    private String password;
    private String email;
    
    public Account(String nname, String ppassword, String eemail){
        name=nname;
        password=ppassword;
        email=eemail;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setPassword(String newPassword){
        password=newPassword;
    }
    
    public void setName(String newName){
        name=newName;
    }
    
    public void setEmail(String newEmail){
        email=newEmail;
    }
}


Write a subclass of the Account class called UserAccount

UserAccount has two instance variables:
 private  ArrayList<String> posts;
 private  ArrayList<UserAccount> friends;

The constructor of UserAccount has signature
     public UserAccount(String name, String password, String email)
this constructor will initialize the instance variables in the superclass and initialize the instance variables posts and 
friends with two new empty arraylists.

(You can think of UserAccount as the account of a social network user who has a list of friends and writes posts on the social network)

The class UserAccount has getters for the instance variables posts and 
friends called getPosts() and getFriends() respectively, with signatures
public ArrayList<String> getPosts()
and
public ArrayList<UserAccount> getFriends()

The class UserAccount has also a method to add a post to the ArrayList of posts, and a method to add a friend to the ArrayList of friends. 
These methods have the following signatures:

public boolean addPost(String post)
public boolean addFriend(UserAccount friend)

(use the arraylist method "add" to add a post or a friend. The method "add" has return type boolean hence the methods have boolean return type)

The class UserAccount has also a method  
public boolean removeFriend(UserAccount friend)

which will remove the UserAccount object friend (the arguments of the method) from the list of friends (use the arraylist method "remove")

You can use the provided classes UserAccountDriverA and UserAccountDriverB to test your code.


**********************
Question 6 [10 Marks]
**********************

In the following program, the code in the method lookForFriend is missing. 
Write the code for this method, which takes as arguments: String name, UserAccount user, 
and returns a UserAccount object, which is the first UserAccount objects in the list of friends of UserAccount user 
which has that name.
If there is no friend with that name then lookForFriend will print "no such friend" and return null.

For example is user1 is a UserAccount object whose list of friends have name "John","Mark","Lara" then:

lookForFriend("Mark",user1) will return the second object in user1 friends list (as the second object has name "Mark")
lookForFriend("Lara",user1) will return the third object in user1 friends list (as the third object has name "Lara")
lookForFriend("Peggy",user1) will print "no such friend" and return null.

----------
import java.util.*;
public class Ex6
{

public static UserAccount lookForFriend(String name,UserAccount user){
      
}
public static void main(String[] args){
   ArrayList<UserAccount>  usersList=new ArrayList<UserAccount> ();
   UserAccount user1=new UserAccount("a1","b1","e1");
   UserAccount user2=new UserAccount("a2","b2","e2");
   user2.addFriend(user1);
   UserAccount friend= lookForFriend("a1", user2);
   System.out.println(friend.getName());

}
}




**********************
Question 7 [11 Marks]
**********************

In the class Ex7 write the code for the method 
public static void suspendAccount(String x, ArrayList<UserAccount>  usersList, ArrayList<UserAccount>  suspendedUsersList)

This method suspends the user accounts (from a list of user accounts usersList) of users who have the string “x” 
as one of their posts,
 i.e. remove the "guilty" user accounts from usersList and append them to suspendedUsersList

For example if usersList has users user1 and user2, and if user2 has post "x" as one of his posts then 
suspendAccount("x", usersList,suspendedUsersList)

will remove user2 from usersList and add user2 to suspendedUsersList.

The method will also handle a generic exception and if an exception occur it will print "Problem occurred"



----------
import java.util.*;
public class Ex7
{

public static void suspendAccount(String x, ArrayList<UserAccount>  usersList, ArrayList<UserAccount>  suspendedUsersList){
   
}
public static void main(String[] args){
   ArrayList<UserAccount>  usersList=new ArrayList<UserAccount> ();
   UserAccount user1=new UserAccount("a1","b1","e1");
   user1.addPost("x");
   UserAccount user2=new UserAccount("a2","b2","e2");
   user2.addPost("y");
   usersList.add(user1);
   usersList.add(user2);
   ArrayList<UserAccount> suspendedUsersList=new ArrayList<UserAccount> ();
   suspendAccount("x", usersList,suspendedUsersList);
   System.out.println(suspendedUsersList.get(0).getName());
   System.out.println(usersList.get(0).getName());
}
}


**********************
Question 8 [12 Marks]
**********************

Write the code in the method 
   public static void addNonce(Account acc, String fName)
   
This method reads from a file fName. Each line of the file consists of two strings:
name nonce

the method look in the file for a line whose first string matches the name of the account and then
concatenated the string nonce to the password of the account.
If no string in the file matches the account name the method will print "user not found"

For example if the file name is "dati.txt" and it consists of the following lines

John aswxx
Mark swdfrt
Peggy wwwret

then if acc1 is an Account object with name "Peggy" and password "pwdrrt" then

addNonce(acc1, "dati.txt")

will change the password of acc1 to pwdrrtwwwret

if  acc2 is an Account object with name "John" and password "123ss" then

addNonce(acc2, "dati.txt")
will change the password of acc2 to 123ssaswxx

if  acc3 is an Account object with name "Don" and password "sw222" then

addNonce(acc2, "dati.txt")
 will print "user not found"
 
(the file "dati.txt" is available in your directory)
 
The method should also handle exceptions and if an exception occur should print "Problem: addNonce"
 
----------
import java.util.*;
import java.io.*;
public class Ex8
{
   public static void addNonce(Account acc, String fName){
   
    }
   public static void main(String[] args){
       Account acc=new Account("a","b","e");
       addNonce(acc,"dati.txt");
       
    }
 
}


**********************
Question 9 [ 20 Marks]  
**********************
**********************

Consider the interface named Authentication

import java.util.*;
public interface Authentication
{
    public String toyHash(String s);
    Account verify(String name, String  password, ArrayList<Account> usersList);

}


Write a class Authenticate which implement the interface Authentication.
Don't write any constructor for this class.

In Authenticate the method 
public String toyHash(String s)
will perform the following operation:
given the string s it creates a string res as follows:
res is declared of type long and has initial value 1.
Then, within a loop over the length of s, at the i-th loop iteration compute res as follows: 
multiply previous value of res with the i-th character of s, add to this the i-th character of s and take the 
remainder of all this with the constant Long.MAX_VALUE.
(For example if at the i-th iteration the character of s is 'g' then you should compute res= ((res*'g')+'g')% Long.MAX_VALUE  )

at the end the method will return the string res (convert res from long to string)

to test:

toyHash("ashhhskk") should return the string "33213712300247031"

(this part is worth 6 marks)

----------------
the method 
public Account verify(String name1, String  password1, ArrayList<Account> usersList)

will go through usersList until it finds an Account object whose name is equal to name1, and in that case 
it will compute toyHash of password1, and if the value of toyHash of password1 is equal to that Account password 
then it will return that Account object.
If no matching account is found (either because the name or the password)
then it will print "Authentication failed" and will return null.

For example if usersList contains an Account object with name "john" with password "33213712300247031" then
verify("john",  "ashhhskk", usersList)
should return that object

(this part is worth 7 marks)

----------------
Add to the class Authenticate a method
    public static String checkStrength(String  password, ArrayList<String> commonPasswords)
    
this static method return "no" followed by a space and then the string password 
if the string password is equal to one string in commonPasswords
or
if the string password where all occurences of the character '0' converted to the character 'o' is equal to one string in commonPasswords
or 
if the string password where all occurences of the character '3' converted to the character 's' is equal to one string in commonPasswords

in the other cases the method will return "yes" followed by a space and then the string password 

For example the following code 

        ArrayList<String> commonPasswords=new ArrayList<String> ();
        commonPasswords.add("boss");
        System.out.println(checkStrength("boss",commonPasswords));
        System.out.println(checkStrength("b0ss",commonPasswords));
        System.out.println(checkStrength("bo3s",commonPasswords));
        System.out.println(checkStrength("bo33",commonPasswords));
        System.out.println(checkStrength("23dud",commonPasswords));

       should print 
       
       no boss
       no b0ss
       no bo3s
       no bo33
       yes 23dud

(this part is worth 7 marks)





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





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
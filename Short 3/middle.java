/* Author - Catalin Alexandru
This file was created as a start template
*/

import java.util.*; // it imports the entire java util library and makes it available to use

public class middle
{  
    // Program starting point
    public static void main (String[] cctv)
    {
        if(cctv.length == 3)
        {
            System.out.println("Error. Please insert exactly 3 numbers.\n");
            System.exit(0);
        }
       
        double number[]= new double[3];
        number[0] = Double.parseDouble(cctv[0]);
        number[1] = Double.parseDouble(cctv[1]);
        number[2] = Double.parseDouble(cctv[2]);
        
        middle(number);
    }   // END Main
    
    public static void middle(double number[])
    {
        int a = 0;
        double temp;
        boolean sorted = false;
        while(!sorted)
        {
            a=0;
            sorted = true;
            while(a+1<number.length)
            {
                if(number[a]>number[a+1])
                {
                    temp = number[a+1];
                    number[a+1] = number[a];
                    number[a] = temp;
                }
                a=a+1;
            }
        }
        System.out.println(number[1]+" is in the middle of "+number[0]+" and "+number[2]);
        System.exit(0); 
    }
}    // END class 
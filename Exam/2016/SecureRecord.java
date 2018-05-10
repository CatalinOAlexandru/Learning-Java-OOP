import java.util.*;
public class SecureRecord extends Record
{

    //public SecureRecord(String id, int len, String key)
    //{
        
    //}

    public void encrypt(String text, String secret){
        int tmpSecret = 0;
        ArrayList<Integer> tmp = new ArrayList<>();
        for(char ch : text.toCharArray()){

            tmp.add((int)ch + (int)secret.charAt(tmpSecret));

            tmpSecret++;
            if(tmpSecret > secret.length()){
                tmpSecret = 0;
            }
        }

        System.out.println("ARRAY OF SECRET ENCRYPT");
        for(int numba : tmp){
            System.out.println(numba);
        }

    }

    public void decrypt(int[] text, String secret){
        int tmpSecret = 0;
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int values : text){

            tmp.add(values - (int)secret.charAt(tmpSecret));

            tmpSecret++;
            if(tmpSecret > secret.length()){
                tmpSecret = 0;
            }
        }

        System.out.println("ARRAY OF SECRET DECRYPT");
        for(int values : tmp){
            System.out.print((char) values);
        }
        
    }

    public static void main(String[] args) {

        new SecureRecord().encrypt("ass", "rip");
        new SecureRecord().decrypt(new int[]{211,220,227}, "rip");


    }
    
    public static String makeString(int[] content)
    {
        
    }
}

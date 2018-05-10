public class Ex4 {

    public static void main(String[] args) {
        String[] input = new String[3];
        try
        {
            input[0]=args[0];
            
            if(args.length == 2)
            {
                input[1]=args[1];
                System.out.println(input[1]);
            }
            else if(args.length ==3)
            {
                input[1]=args[1];
                input[2]=args[2];
                System.out.println(input[1]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {System.out.println("Too many arguments");}
        
        
    }
}
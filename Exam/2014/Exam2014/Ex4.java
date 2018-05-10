public class Ex4 {
    public static void main(String[] args) {
        try
        {
            if(args.length>3)
                System.out.println("Too many arguments");
            else if(args.length==1)
                System.out.println(args[0]);
            else if(args.length==2 || args.length==3)
                System.out.println(args[0] +" "+args[1]);
            else
                System.out.println("Not enoght arguments");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {}
    }
}
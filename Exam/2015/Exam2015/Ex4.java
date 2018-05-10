public class Ex4 {
    
    public static void main(String[] args) {
        if(args.length<1 || args.length>3)
        {
            System.out.println("number of arguments invalid");
            System.exit(0);
        }
        
        try
        {
            if(args.length==1)
                System.out.println(args[0]);
            else if(args.length==2)
            {
                System.out.println((Double.parseDouble(args[0])*(Double.parseDouble(args[1]))));            
            }
            else if(args.length==3)
            {
                System.out.println((Double.parseDouble(args[0])*(Double.parseDouble(args[1])*(Double.parseDouble(args[2])))));
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("invalid operation");
            System.exit(0);
        }
    }
}
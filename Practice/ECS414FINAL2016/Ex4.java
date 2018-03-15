public class Ex4 {

  public static void main(String[] args) {
        if(args.length != 3)
        {
            System.out.println("Number of arguments invalid");
            System.exit(0);
        }
         
        double no1 = 0;
        double no2 = 0;
        double no3 = 0;
        try
        {
            no1 = Double.parseDouble(args[0]);
            no2 = Double.parseDouble(args[1]);
            no3 = Double.parseDouble(args[2]);
        }
        catch(Exception E)
            {
                System.out.println("invalid operation");
                System.exit(0);
            }
            
        System.out.println(no1 * no2 * no3);
  }
}
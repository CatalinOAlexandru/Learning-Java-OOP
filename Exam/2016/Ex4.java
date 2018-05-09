public class Ex4 {

  public static void main(String[] args) 
  {
      if(args.length < 3 || args.length > 3)
      {
          System.out.println("number of arguments invalid");
          System.exit(0);
      }
      
      Double a = 0.0;
      Double b = 0.0;
      Double c = 0.0;
      
      try
      {
          a = Double.parseDouble(args[0]);
          b = Double.parseDouble(args[1]);
          c = Double.parseDouble(args[2]);
      }
      catch(Exception e)
      {
          System.out.println("invalid operation");
          System.exit(0);
      }
      
      double product = a * b * c;
      System.out.println(product);
      
  }
}
public class Ex4 {

  public static void main(String[] args) {
      
      if(args.length < 3 || args.length > 3)
        System.out.println("number of arguments invalid");
      else
      {
          try
          {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            
            double product = a * b * c;
            System.out.println(product);
          }
          catch(NumberFormatException e)
          {
              System.out.println("invalid operation");
          }
      }
      
  }
}
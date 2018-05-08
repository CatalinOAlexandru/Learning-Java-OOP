public class Ex4 {

  public static void main(String[] args) {
      if(args.length>3 || args.length<3)
      {
          System.out.println("number of arguments invalid");
          System.exit(0);
      }
            
      String a=args[0];
      String b=args[1];
      String c=args[2];
      
      if(a.equals("1"))
          System.out.println(b+c);
      else if(a.equals("2"))
          System.out.println(c+b);
      else
          System.out.println("undefined");
      
  }
}

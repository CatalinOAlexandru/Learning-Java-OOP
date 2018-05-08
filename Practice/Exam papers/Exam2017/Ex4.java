public class Ex4 {

  public static void main(String[] args) {
      if(args.length < 3 || args.length > 3)
      {
          System.out.println("number of arguments invalid");
          System.exit(0);
      }
      if(args[0].equals("1"))
      {
          System.out.println(args[1]+args[2]);
      }
      else if(args[0].equals("2"))
      {
          System.out.println(args[2]+args[1]);
      }
      else
          System.out.println("undefined");
  }
}

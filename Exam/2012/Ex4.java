public class Ex4 {

  public static void main(String[] args) {
     int a=0;;
     int b=0;
     int c=0;
     
     if(args.length != 3)
     {  
         System.out.println("Error");
         System.exit(0);
     }
     
      try
     {
         a = Integer.parseInt(args[0]);
         b = Integer.parseInt(args[1]);
         c = Integer.parseInt(args[2]);
     }
     catch(NumberFormatException e)
     {System.out.println("Wrong argument"); System.exit(0);}
     
     
      if((a & 1)==0 && (b & 1)==0 && (c & 1)==0) 
     { //even... 
         System.out.println("yes");
     } 
     else 
     { //odd... 
         System.out.println("no");
     }
  }
}
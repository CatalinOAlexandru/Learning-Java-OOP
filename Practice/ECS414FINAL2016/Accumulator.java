public class Accumulator {
    private int[] A;

    public Accumulator(int[] X) {
        A= new int[X.length];
        for (int i=0; i<X.length; i++)
            A[i] = X[i];
    }

    public int twiceSumA() {
        int number = 0;
      for(int i=0; i<A.length; i++)
      {
 
          number = A[i] * 2;
         
      }
      return number;
    }
    
     public static void main(String args[]){ // you can use the main method to test your code
        
      int[]  A = {2,4,3,5,8};
      
      int r=new Accumulator(A).twiceSumA(); //change argument to test different cases
      System.out.println(r);
    }

}
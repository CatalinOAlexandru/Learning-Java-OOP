public class Accumulator {
    
    private int[] A;
    
    public Accumulator(int[] X) {
        A= new int[X.length];
        for (int i=0; i<X.length; i++)
        A[i] = X[i];
    }
    
    public int getOverM(int m) {
        int last = A[(A.length)-1];
        if(m<last)
            return last;
        else
            return -1;
    }
    
    public static void main(String args[]){ // you can use the main method to test your
        int[] A = {2,4,3,5,8};
        int r=new Accumulator(A).getOverM(8); //change argument to test different cases
        System.out.println(r);
    }
}
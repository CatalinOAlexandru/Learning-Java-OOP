public class Accumulator {
    private int[] A;

    public Accumulator(int[] X) {
        A= new int[X.length];
        for (int i=0; i<X.length; i++)
            A[i] = X[i];
    }

    public int prodA(int m) {
	int res=1;
        for(int i=0; i<A.length; i++)
	{
	    res = res + A[i];
	}
	return res;
    }

}
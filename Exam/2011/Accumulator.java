public class Accumulator {
    private int[] A;

    public Accumulator(int[] X) {
        A= new int[X.length];
        for (int i=0; i<X.length; i++)
            A[i] = X[i];
    }

    public int getSumOverM(int m) {
        . . .
    }

}
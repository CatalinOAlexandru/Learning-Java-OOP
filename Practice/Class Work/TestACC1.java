public class TestACC1
{
    public static void main(String[] param)
    {
        ACC1 acc = new ACC1();
        acc.deposit(100);
        acc.withdraw(50);
        System.out.println(acc.getBalance());
    }
}
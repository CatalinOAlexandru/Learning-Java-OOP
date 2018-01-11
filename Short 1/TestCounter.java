class TestCounter
{
	public static void main(String[] cctv)
	{
		Counter ctr = new Counter();
		ctr.increment();
		System.out.println("The object ctr store the value of " + ctr.getValue());
		ctr.reset();
	}
}
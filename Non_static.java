class Non_static
{
	{
		System.out.println("this is non-static block");
		
	}
	int x=sun();
	static int sun()
	{
		System.out.println("this is sun");
		return 10;
		}
	public static void main(String args[])
	{
		System.out.println("main function");
		Non_static n=new Non_static();
		System.out.println(n.x);
	}
	
}

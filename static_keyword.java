class demo
{
	static 
	{
		System.out.println("static block first");
	}
	
	public static void main(String args[])
	{
		System.out.println("this is an main block");
		demo h=new demo();
		System.out.println("value of d=>"+d+"value of e=>"+h.e+"value of d=>"+h.f);
	}


	
	static int fun()
	{
		System.out.println("this is static fun");
		return 20;
	}
	static int d=fun();
	
	
	int gun()
	{
		System.out.println("this is an non static");
		return 50;
	}
	
	int e=gun();
	
	static int run()
	{
		System.out.println("this is an static fun with non static");
		return 60;
	}
	int f=run();
}
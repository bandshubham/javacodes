class Test
{

static
{
System.out.println("this is static block from class1");	
}

static int fun()
{
	System.out.println("this is an fun ");
	return 30; 
}

protected static int t=fun();
}
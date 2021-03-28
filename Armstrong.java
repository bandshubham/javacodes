class Armstrong
{
	public static int myMethod(int num,int count1) 
 {
	int mul=1;
	int power=count1;
	while(power!=0)
	{
		mul=mul*num;
		power--;
	}
	return mul;
 }
 
 public static void main(String[] args)
 {
  int no=Integer.parseInt(args[0]);
	int n=0;
	int a=0;
	int count=0;
	int mul=0;
	int count1=0;
	int total_no=0;
	int i=1;

	n=no;
	count=0;
	while(n!=0)
	{
	n=n/10;
	count++;
	}

	total_no=0;
	n=no;
	while(n!=0)
	{
		a=n%10;
		n=n/10;
		mul=1;
		count1=count;
		mul=myMethod(a,count);
		total_no=total_no+mul;	
	}

	if(total_no==no)	
	{
	
	System.out.println(no+"its an armstrong no");
	System.out.println("prime of "+total_no+"is :");
	
	
	 for(i=1;i<total_no;i++)
	 {
		 if((total_no%i)==0)
		 {
		  System.out.println(i);
		 }
	 }
    }
	else
	{
	System.out.println(no+"its not an armstrong no");
	}
}

	

 }
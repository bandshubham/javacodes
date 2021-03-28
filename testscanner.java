import java.util.Scanner;
import java.io.Console;
import java.io.IOException;
class Testscanner
{
	public static void main(String args[]) throws IOException
	{
	 
	Scanner sc=new Scanner(System.in);
	Console c=System.console();
	 
	    System.out.println("enter name of user");
		
		String name=sc.nextLine();
	
		System.out.println("enter user id");
		
		int id=sc.nextInt();
		
		System.out.println("enter password");
		
		System.out.println(c.readPassword());
		
		System.out.println("enter salary");
		
		double salary=sc.nextDouble();
		
		
		System.out.println("enterd user data is");
		
		System.out.println("user name is "+name);
		
		System.out.println("user id is "+id);
		
		
		
		System.out.println("user salary is "+salary);
		
	}
}
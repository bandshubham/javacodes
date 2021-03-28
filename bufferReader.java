import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Testbuffer
{
	public static void main(String args[]) throws IOException
	{
	 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 
	 
	    System.out.println("enter name of user");
		
		String name=br.readLine();
	
		System.out.println("enter user id");
		
		int id=Integer.parseInt(br.readLine());
		
		System.out.println("enter password");
		
		String password=br.readLine();
		
		System.out.println("enter salary");
		
		double salary=Double.parseDouble(br.readLine());
		
		
		System.out.println("enterd user data is");
		
		System.out.println("user name is "+name);
		
		System.out.println("user id is "+id);
		
		System.out.println("user password is "+password);
		
		System.out.println("user salary is "+salary);
		
	}
}
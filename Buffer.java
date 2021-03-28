import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Test
{
	public static void main(String args[])throws IOException
	{
		
		System.out.println("enter the name here");
		

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String s=br.readLine();
		
		System.out.println("new printed element are "+s);
	}
	}


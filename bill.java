import java.util.Scanner;

class Lightbill
{  
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int unit=0;
		int rent=150;
		
		int amount=0;
		System.out.println("enter the unit of bill");
		unit=sc.nextInt();
		
		
		
	     if(unit<=100)
		 {
			 amount=unit*3;
			 amount=amount+rent;

		 }
		 
		 else if(unit<=200)
		 {
			 amount=100*3;
			 unit=unit-100;
			 amount=amount+(unit*5)+rent;
		 }
		 else if(unit<=300)
		 {
			 amount=100*3;
			 unit=unit-100;
			 amount=amount+(100*5);
			 unit=unit-100;
			 amount=amount+(unit*7)+rent;
		 }
		 else if(unit>300)
		 {
			 amount=100*3;
			  
			 unit=unit-100;
			 amount=amount+(100*5);
			
			 unit=unit-100;
			 amount=amount+(100*7);
			  
			 unit=unit-100;
			 amount=amount+(unit*10)+rent;
			  
		 }
		
		System.out.println("Your bill for this month is ");
		System.out.println(amount);
	}
	
}
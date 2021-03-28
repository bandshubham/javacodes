import java.io.*;
import java.util.*;

class String_len
{
  public static void main(String args[])
  {
	  int count=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter string");
	  String str= sc.nextLine();              //reads string   
	  System.out.print("You have entered: "+str);        
	  
	  for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;    
        }
		
		System.out.println("count of element is "+count);
	}
}
import java.util.*;

class Parent{
	
	private String p_name;
    private int age;

	
	Bike b=new Bike();
	public void set_p_name(String name)
	{ 	
		
		this.p_name=name;
	}
	public void set_age(int age)
	{
		this.age=age;
	}
	
	
		
		
}

class Student{
String s_name;
int age;
int Class;




public static void main(String args[])
{
	Parent p=new Parent();
	Student s=new Student();
	System.out.println("enter parent detail");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter parent name");
	p.set_p_name();
}
 
public void set_s_name(String name)
{
	this.s_name=name;
}

public void set_age(int age)
{
	this.age=age;
}

public void set_Class(int Class)
{
	this.Class=Class;
}


}

class Bike{

String bike_name;
int chessay_no;


public void set_bike_name(String B_name)
{

	this.bike_name=B_name;
}

public void set_chessay_no(int no)
{
	this.chessay_no=no;
}


}


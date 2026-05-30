import java.util.*;
class Employee
{
	void name1()
	{
		System.out.println("Name is Harsha");
	}
	void name2()
	{
		System.out.println("Name is Achari");
	}
	void name3()
	{
		System.out.println("Name is Hemanth");
	}
}
class Salary extends Employee
{
	void salary()
	{
		System.out.println("Salary per month is 45000");
	}
}
class Work extends Salary
{
	void work1()
	{
		System.out.println("This person belongs to Developing..");
	}
	void work2()
	{
		System.out.println("This person belongs to Testing..");
	}
	void work3()
	{
		System.out.println("This person belongs to Training..");
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		Work w = new Work();
		w.name1();
		w.salary();
		w.work1();
		w.name2();
		w.salary();
		w.work2();
		w.name3();
		w.salary();
		w.work3();
	}
}
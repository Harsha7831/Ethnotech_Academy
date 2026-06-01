import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fac = Fact(n);
		System.out.println(fac);
	}
	public static int Fact(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		return n*Fact(n-1);
	}
}
import java.util.*;
class Temperature
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] temp = new int[n];
		for(int i=0;i<n;i++)
		{
			temp[i] = sc.nextInt();
		}
		int highest = 0;
		for(int i=0;i<n;i++)
		{
			if(temp[i]>highest)
			{
				highest = temp[i];
			}
		}
		System.out.println("Highest Temperature:"+highest);
		int lowest = temp[0];
		for(int i=1;i<n;i++)
		{
			if(temp[i]<lowest)
			{
				lowest = temp[i];
			}
		}
		System.out.println("Lowest Temperature:"+lowest);
		int total = 0;
		for(int i=0;i<n;i++)
		{
			total = total + temp[i];
		}
		int avg = total / n;
		System.out.println("Average:"+avg);
		int count = 0;
		for(int i=0;i<n;i++)
		{
			if(temp[i]>35)
			{
				count++;
			}
		}
		System.out.println("No.of hot days are:"+count);
	}
}

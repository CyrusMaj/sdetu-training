package Assignments;

public class Assignment_01 
{
	public static void main(String[] args)
	{
		System.out.println(rangeSum(5));
		System.out.println(fact(5));
		
		int[] numSet = {1, 5, 3, 4, 2};
		
		System.out.println(min(numSet));
		System.out.println(avg(numSet));
		System.out.println(max(numSet));
	}
	
	public static int rangeSum(int n)
	{
		int sum = 0;
		
		for (int i = 1; i <= n; i++)
		{
			sum = sum + i;
		}
		return sum;
	}
	
	public static int fact(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		
		else if (n == 1)
		{
			return 1;
		}
		
		else
		{
			return (fact(n-1) * n);
		}
	}
	
	//3 functions
	public static int min(int[] array)
	{
		int Min = array[0];

		for(int i = 0; i <= array.length; i++)
		{
			if (Min > i)
			{
				Min = array[i];
			}
			else
			{
				Min = Min;
			}
		}
		return Min;
	}
	
	public static int avg(int[] array)
	{
		int Avg = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			Avg = Avg + array[i];
		}
		
		Avg = Avg/array.length;
		return Avg;
	}
	
	public static int max(int[] array)
	{
		int Max = 0;

		for(int i = 0; i < array.length; i++)
		{
			if (Max < array[i])
			{
				Max = array[i];
			}
			else
			{
				Max = Max;
			}
		}
		return Max;
	}
}

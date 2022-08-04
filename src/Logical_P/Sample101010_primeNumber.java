package Logical_P;

public class Sample101010_primeNumber 
{
	public static void main(String[] args) 
	{
		int num=10;
		int count=0;
		
		for(int i=2; i<num; i++) 
		{
			if(num%i==0) 
			{
				count++;
				break;
			}
		}
		if(count==1) 
		{
			System.out.println("given number is not a prime number");
		}
		else 
		{
			System.out.println("given number is a prime number");
		}
		
	}

}

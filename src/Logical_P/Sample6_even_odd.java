package Logical_P;

import java.util.Scanner;

public class Sample6_even_odd
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter num: ");
		int num=scan.nextInt();
		
		if(num%2==0) 
		{
			System.out.println("given number is even");
		}
		else 
		{
			System.out.println("given number is odd");
		}
		
	}

}

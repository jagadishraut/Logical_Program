package Logical_P;

import java.util.Scanner;

public class Demo3_fact_of_num
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter num: ");
		int num=scan.nextInt();  //5
		
		int fact = 1;
		
		for(int i=num; i>=1; i--) 
		{
			fact=fact*i;    //1*5=5,5*4=20,20*3=60,60*2=120,120*1=120
		}
		System.out.println(fact);
		
	}

}

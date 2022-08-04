package Logical_Program1;

import java.util.Scanner;

public class Accept_Input_from_User
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num1: ");
		int num1 = scan.nextInt();
		
		System.out.println("enter num2: ");
		int num2=scan.nextInt();
		
		System.out.println(num1+num2);
	}

}

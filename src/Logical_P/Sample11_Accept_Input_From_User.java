package Logical_P;

import java.util.Scanner;

public class Sample11_Accept_Input_From_User
{
	public static void main(String[] args) 
	{
		Scanner Scan=new Scanner(System.in);
		
		System.out.println("enter num1: ");
		int num1 = Scan.nextInt();
		
		System.out.print("enter num2: ");
		int num2=Scan.nextInt();
		
		System.out.println("enter num3: ");
		int num3=Scan.nextInt();
		
		System.out.println(num1+num2+num3);
	}

}

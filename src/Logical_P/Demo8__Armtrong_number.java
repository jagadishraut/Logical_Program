package Logical_P;

public class Demo8__Armtrong_number 
{
	public static void main(String[] args)
	{
		int  orgnum=153;  //1+125+27=153
		int sum=0;  //125
		
		for(int i=orgnum; i>0; i=i/10)  //153/10=15.3, 15/10=1.5, 1/10=1
		{
			int rev=i%10; //
			sum=sum+(rev*rev*rev); // 0+27=27, 27+125=152, 152+1=153  
		}
		if(orgnum==sum) 
		{
			System.out.println("given number "+orgnum+" is an Armstrong number");
		}
		else 
		{
			System.out.println("given number"+orgnum+"is not an Armstrong number");
		}
		
	}

}

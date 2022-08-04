package Logical_P;

public class Sample88_IMP_Armstrong_Number 
{
	public static void main(String[] args)
	{
		int orgnum=153;
		int sum=0;
		
		for(int i=orgnum; i>0; i=i/10) 
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		if(orgnum==sum) 
		{
			System.out.println("given number " + orgnum +" is a armstrong");
		}
		else 
		{
			System.out.println("given number"+orgnum+"is not a armstrong");
		}
	}

}

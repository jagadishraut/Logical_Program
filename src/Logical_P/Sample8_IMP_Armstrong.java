package Logical_P;

public class Sample8_IMP_Armstrong
{
	public static void main(String[] args) 
	{
		int OrgNum=153;
		int sum=0;
		
		for(int i=OrgNum; i>0; i=i/10) 
		{
			int rem = i%10;
			sum=sum+(rem*rem*rem);
			
		}
		if(OrgNum==sum) 
		{
			System.out.println("given number " + OrgNum + " is a armstrong");
		}
		else 
		{
			System.out.println("given number "+ OrgNum +" is a armstrong");
		}
		
	}

}

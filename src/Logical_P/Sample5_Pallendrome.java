package Logical_P;

public class Sample5_Pallendrome
{
	public static void main(String[] args)
	{
		String org="madam";
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--) 
		{
			rev=rev+org.charAt(i);
		}
		System.out.println("original String: "+org);
		System.out.println("reverse String: "+rev);
		
		if(org.equals(rev)) 
		{
			System.out.println("given String is pallendrome");
		}
		else 
		{
			System.out.println("given String is not a Pallendrome");
		}
		
	}

}

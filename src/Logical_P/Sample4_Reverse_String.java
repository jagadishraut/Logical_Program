package Logical_P;

public class Sample4_Reverse_String
{
	public static void main(String[] args)
	{
		String org="abcd";
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--) 
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(org);
		System.out.println(rev);
		
	}

}

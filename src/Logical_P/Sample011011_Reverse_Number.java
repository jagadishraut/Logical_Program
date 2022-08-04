package Logical_P;

public class Sample011011_Reverse_Number
{
	public static void main(String[] args) 
	{
		int orgnum=112233;
		
		String org=Integer.toString(orgnum);
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--) 
		{
			rev=rev+org.charAt(i);
		}
		int revnum = Integer.parseInt(rev);
		
		System.out.println(revnum);
		
	}

}

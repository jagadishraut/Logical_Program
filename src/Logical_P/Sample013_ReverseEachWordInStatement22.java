package Logical_P;

public class Sample013_ReverseEachWordInStatement22
{
	public static void main(String[] args)
	{
		String s1="my name is abc";
		
		String[] ar=s1.split(" ");
		
		for(int i=0; i<=ar.length-1; i++) 
		{
			String org=ar[i];
			System.out.println(findReverseofGivenString(org));
		}
		
	}
	public static String findReverseofGivenString(String org) 
	{
		String rev=" ";
		
		for(int j=org.length()-1; j>=0; j--) 
		{
			rev=rev+org.charAt(j);
		}
		return rev;
		
	}

}

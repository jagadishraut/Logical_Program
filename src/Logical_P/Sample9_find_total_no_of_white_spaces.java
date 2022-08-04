package Logical_P;

public class Sample9_find_total_no_of_white_spaces
{
	public static void main(String[] args)
	{
		String str="a b   c d ";
		int count=0;
		
		for(int i=0; i<=str.length()-1; i++) 
		{
			char str1=str.charAt(i);
			
			if(str1==' ') 
			{
				count++;
			}
			
		}
		System.out.println("no of spaces in given String: "+count);
		
	}

}

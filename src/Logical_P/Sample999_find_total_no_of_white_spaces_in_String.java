package Logical_P;

public class Sample999_find_total_no_of_white_spaces_in_String
{
	public static void main(String[] args)
	{
		String s1="a b   c d ";
		int count=0;
		
		for(int i=0; i<=s1.length()-1; i++) 
		{
			char str=s1.charAt(i);
			
			if(str==' ') 
			{
				count++;
			}
		}
		System.out.println("no of spaces in given String"+count);
		
	}

}

package Logical_P;

public class Demo6_reverse_String 
{
	public static void main(String[] args)
	{
		String orgcha="shubham";
		String revcha=" ";
		                            // 2>=0
		for(int i=orgcha.length()-1; i>=0; i--) 
		{
			 revcha=revcha+orgcha.charAt(i); //0+m=m,m+a=ma,ma+h=mah
		}
		System.out.println(orgcha);
		System.out.println(revcha);
		
	}

}

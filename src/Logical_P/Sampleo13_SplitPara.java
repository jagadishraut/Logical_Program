package Logical_P;

public class Sampleo13_SplitPara
{
	public static void main(String[] args) 
	{
		String s1="my name is abc";
		String[] ar=s1.split(" ");
		System.out.println(ar[2]);
		
		System.out.println("----------");
		
		for(int i=0; i<=ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}
		
	}

}

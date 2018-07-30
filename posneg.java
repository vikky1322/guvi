import java.util.*;
import java.lang.*;
import java.io.*;

class Posneg
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>0)
		{
			System.out.println("Positive");
		}
		else if(n<0)
		{
			System.out.println("Negitive");
		}	
		else if(n==0)
		{
			System.out.println("Zero");
		}
		
	}
}

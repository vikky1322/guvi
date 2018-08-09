import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m,sum=0;
		for(m=1;m<=n;m++)
		{
			sum+=m;
		}
		System.out.println(sum);
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch>='a'&&ch<='z')
		System.out.println("Alphabet");
		else
		System.out.println("No");
	}
}

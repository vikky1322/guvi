class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else if(n>0)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}

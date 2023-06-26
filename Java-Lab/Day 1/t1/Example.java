class Example{
	public static void main(String args[])
	{
		//System.out.print("Welcome Omar");
		if(args.length ==0)
		{
			System.out.print("Empty argument");
		}
		else
		{
			for(int i=0;i<args.length;i++)
			System.out.println(args[i]);
		}
	}
}
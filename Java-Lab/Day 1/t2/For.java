class For{
	public static void main(String args[])
	{
		int i,count;
		try
		{
			count=Integer.parseInt(args[1]);
			for(i=0;i<count;i++)
			{
				System.out.println(args[0]);
			}
		}
		catch(Exception ex)
		{
   			System.out.print("Don`t Accept float");
		}
			
	}
}
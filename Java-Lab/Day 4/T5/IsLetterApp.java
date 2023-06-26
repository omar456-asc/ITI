interface CheckString
{
	boolean isLettersOrNot(String word);
}

class MyApp
{
	public static void main(String args[])
	{
		if(args.length!=0)
		{
		String word=args[0];
		CheckString checker=(s)->
		{
			char ch=' ';
			int i=0;
			while(i<s.length()&&Character.isLetter(s.charAt(i)))
			{
				i++;
			}
				if(i<s.length())
				{
					return false;
				}
				else
				{
					return true;
				}	
		};
	boolean flag=checker.isLettersOrNot(word);
	if(flag==true)
	{
		System.out.print("The String is alphabets only");
	}
	else
	{
		System.out.print("The String is not alphabets only");
	}
		}
		else
		{
			System.out.println("Not Acceptable");
		}
	}

}
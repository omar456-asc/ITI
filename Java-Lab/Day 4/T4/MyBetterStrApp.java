@FunctionalInterface
interface BetterString<String>
{
	Integer Better(String str1,String str2);
}
class MyApp
{
	public static void main(String args[])
	{
		String string1="Omar";
		String string2="Mahmoud";
		BetterString<String> isbetter = (str1,str2) -> str1.compareTo(str2);
		int condtion;
		condtion=isbetter.Better(string1,string2);
		if(condtion>=0)
		{
			System.out.println(string1);	
		}
		else
		{
			System.out.println(string2);
		}
	}
}	
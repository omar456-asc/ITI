import java.util.StringTokenizer;
class Str
{
	public static void main(String args[])
	{
		StringTokenizer str=new StringTokenizer("develops people and ITI house of develope and ITI for people","ITI");
		System.out.println("There are "+str.countTokens()+"Tokens");
	}
}
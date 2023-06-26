import java.util.function.Function;
class Centigrade implements Function<Integer,Float>
{
	public Float apply(Integer centigrade)
	{
		float fahern=((centigrade*9)/5)+32;
		return fahern;
		   
	}
}
class ConvertTemp
{
	public static void main(String args[])
	{
		try
		{
		Function<Integer,Float> convert = new Centigrade();
		int centigrade=Integer.parseInt(args[0]);
		float fahern= convert.apply(centigrade);
		System.out.println("The Fahernheit ="+fahern);
		System.out.println();
		}
		catch(Exception ex)
		{
			System.out.print("Not Acceptable");
		}
	}
}
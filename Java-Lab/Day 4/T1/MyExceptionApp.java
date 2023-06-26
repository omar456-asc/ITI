import java.lang.Math;
class NegativeException extends Exception
{
	public NegativeException()
	{
		super("The Result can`t be negative, you can't enter negative number");
	}
	public NegativeException(String message)
	{
		super(message);
	}
}
class TestNegativeExceptions
{
	double DivideTest(double Numerator,double Denominator) throws NegativeException
	{
		if(Denominator >0)
		{ 
			double Result= Numerator/Denominator;
			return Result;
		}
		else
		{ 
			throw new NegativeException("The Result Can`t Be Zero");
		}
	}
	double MultiplyTest(double Num1,double Num2) throws NegativeException
	{
		double Result= Num1*Num2;
		if(Result >=0)
		{ 
			return Result;
		}
		else
		{ 
		throw new NegativeException();
		}					
	}
	double SqrtTest(double Num1,double Num2) throws NegativeException
	{
		double Result= Num1-Num2;
		if(Result >=0)
		{ 
			return (Math.sqrt(Result));
		}
		else
		{ 
		throw new NegativeException();
		}
	}
	
}
class MyApp
{
	public static void main(String args[])
	{
		//System.out.println(args.length);
		if(args.length!=0)
		{
		TestNegativeExceptions Try=new TestNegativeExceptions();
		double Num1=Double.parseDouble(args[0]);
		double Num2=Double.parseDouble(args[1]);
		try
		{
			System.out.println("The Division Result = "+ Try.DivideTest(Num1,Num2));
			System.out.println("The Multiplication Result = "+ Try.MultiplyTest(Num1,Num2));
			System.out.println("The square root Result = "+ Try.SqrtTest(Num1,Num2));
		}
		catch(NegativeException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
		System.out.println("Thank you for using the app");
		}
		}
		else
		System.out.print("Thanks");
	}
}
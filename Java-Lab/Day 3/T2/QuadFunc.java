import java.util.function.Function;
import java.lang.Math;
class Cofficient
{
	public double a,b,c;
}
class Roots
{
	public double root1,root2;
}
class Solve2NDDeg implements Function<Cofficient,Roots>
{
	public Roots apply(Cofficient cof)
	{
		double sign=(cof.b*cof.b-4*cof.a*cof.c);
		Roots roots = new Roots();
		Double check=Math.sqrt(sign);
		boolean res =check.isNaN();
		if(res)
		{
			return null;
		}
		if(sign>0)
		{
			roots.root1=(-cof.b+Math.sqrt(sign))/(2*cof.a);
			roots.root2=(-cof.b-Math.sqrt(sign))/(2*cof.a);
			return roots;
		}
		else if(sign == 0)
		{
			roots.root1=-cof.b/(2*cof.a);
			roots.root2=roots.root1;
			return roots;
		}
		else if(sign<0)
		{
			return null;
		}
		return null;
	}
}
class myApp
{
	public static void main(String args[])
	{
		Function<Cofficient,Roots> solve = new Solve2NDDeg();
		Cofficient cofficient = new Cofficient();
		Roots result= new Roots();
		cofficient.a=1;
		cofficient.b=-4;
		cofficient.c=3;
		result=solve.apply(cofficient);
		if(result==null)
		{
			System.out.print("Not Acceptable");
		}
		else
		{
		System.out.println("Root 1="+result.root1+"Root2 ="+result.root2);
		}
	}
}
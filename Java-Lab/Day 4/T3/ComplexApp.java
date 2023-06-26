import java.math.BigDecimal;
class Complex <T extends BigDecimal, R extends BigDecimal>{
	T real;
	R imag;
	Complex(T r, R i)
	{
		real = r;
		imag = i;
	}
	public String toString()
	{
		StringBuffer sb= new StringBuffer();
		sb.append(real);
		sb.append('+');
		sb.append(imag);
		sb.append('i');
		return sb.toString();
	}
	public Complex<T, R> add(Complex<T, R> second)
	{
		return new Complex<T,R>((T)(real.add(second.real)),(R)(imag.add(second.imag)));
	}
	public Complex<T, R> subtract(Complex<T, R> second)
	{
		return new Complex<T,R>((T)(real.subtract(second.real)),(R)(imag.subtract(second.imag)));
	}
	public Complex<T, R> multiply(Complex<T, R> second)
	{
		return new Complex<T,R>((T)(real.multiply(second.real)),(R)(imag.multiply(second.imag)));
	}
}
class MyApp
{
	public static void main(String[] args) 
	{
		BigDecimal num1 = new BigDecimal(Integer.parseInt(args[0]));
		BigDecimal num2 = new BigDecimal(Integer.parseInt(args[1]));
		Complex<BigDecimal,BigDecimal> c1 = new Complex<BigDecimal,BigDecimal>(num1,num2);
		Complex<BigDecimal,BigDecimal> c2 = new Complex<BigDecimal,BigDecimal>(num1,num2);
		Complex<BigDecimal,BigDecimal> resAdd = c1.add(c2);
		Complex<BigDecimal,BigDecimal> resSub = c1.subtract(c2);
		Complex<BigDecimal,BigDecimal> resMult = c1.multiply(c2);
		System.out.println("Result of adddition equal " + resAdd);
		System.out.println("Result of sub equal " + resSub);
		System.out.println("Result of mult equal " + resMult);		
	}
}
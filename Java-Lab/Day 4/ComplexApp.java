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
		Complex<BigDecimal,BigDecimal> c1 = new Complex<BigDecimal,BigDecimal>(new BigDecimal(5),new BigDecimal(9));
		Complex<BigDecimal,BigDecimal> c2 = new Complex<BigDecimal,BigDecimal>(new BigDecimal(5),new BigDecimal(9));
		Complex<BigDecimal,BigDecimal> resAdd = c1.add(c2);
		Complex<BigDecimal,BigDecimal> resSub = c1.subtract(c2);
		Complex<BigDecimal,BigDecimal> resMult = c1.multiply(c2);
		System.out.println("Result of adddition equal " + resAdd.toString());
		System.out.println("Result of sub equal " + resSub.toString());
		System.out.println("Result of mult equal " + resMult.toString());		
	}
}
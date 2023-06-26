import java.util.Random;
class MaxMin
{
	public static int GetMin(int ar[])
	{
		int min=ar[0],i;
		int size=ar.length;
		for(i=0;i<size;i++)
		{
			if(min>ar[i])
			{
  				min=ar[i];
			}
		}
		return min;
		   		
	}
	public static int GetMax(int ar[])
	{
		int max=ar[0],i;
		int size=ar.length;
		for(i=0;i<size;i++)
		{
			if(max<ar[i])
			{
  				max=ar[i];
			}
		}
		return max;
		   		
	}
	public static int[] CreateAr(int ar[])
	{
		int Size,i;
		Random rd = new Random();
		Size=ar.length;
		for(i=0;i<Size-1;i++)
		{
			ar[i]=rd.nextInt(1000);
		}
		return ar;
	}
	public static void main(String args[])
	{
		int myArray[] = new int[1000];
		myArray=CreateAr(myArray);
		long start,end,TotalT;
		start=System.nanoTime();
		int Min=GetMin(myArray);
		System.out.println("The Minimum ="+Min);
		end=System.nanoTime();
		TotalT=end-start;
		System.out.println("Time Taken="+TotalT);
		start=System.nanoTime();
		int Max=GetMax(myArray);
		System.out.println("The Maximum ="+Max);
		end=System.nanoTime();
		TotalT=end-start;
		System.out.println("Time Taken="+TotalT);
	}
}	
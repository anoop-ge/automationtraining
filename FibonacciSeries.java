package Samples;

public class FibonacciSeries {

	public static void main(String args[])
	{
		int j=1;
		
		for (int i=0; i<1000;)
		{
			
			
			System.out.println(i);
			int temp=i;
			i=j;
			j=j+temp;
			
		}
		
	}
}

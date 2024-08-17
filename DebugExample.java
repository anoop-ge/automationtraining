package Samples;

public class DebugExample {

	public static void main(String[] args)

	{

		int pincome[] = new int[5];

		pincome[0] = 32;
		pincome[1] = 21;
		pincome[2] = 54;
		pincome[3] = 64;
		pincome[4] = 89;

		int mincome = minincome(pincome);
		System.out.println("Minimum Income is  " + mincome);

		System.out.println("----------------Before reversing--------------");

		print(pincome);

		System.out.println("----------------After reversing--------------");

		int r[] = reverse(pincome);
		print(r);
		
		print(pincome);
		
		
		
		
		
		

	}

	static void print(int[] arr) {

		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);

		}
	}

	static int minincome(int[] avalues) {

		int min_pincome = avalues[0];
		for (int i = 1; i < avalues.length; i++)
			if (min_pincome > avalues[i]) {
				min_pincome = avalues[i];

			}

		return min_pincome;
	}

	static int[] reverse(int[] avalues) {

		int n = avalues.length, tmp;
		for (int i = 0; i < n / 2; i++) {
			tmp = avalues[i];
			avalues[i] = avalues[n - i - 1];
			avalues[n - i - 1] = tmp;
		}
		return avalues;

	}
	
	
	
	
	
	
	
	{
		
		
		
	}
	

}

package Samples;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 10;
		boolean prime = primeNumber(n);

		if (prime)
			System.out.println("The given number"+n+" is prime");
		else

			System.out.println("The given number"+n+ "is not prime");

	}

	static boolean primeNumber(int n) {
		boolean isprime = true;
		for (int i = 2; i < n; i++)

		{
			if (n % i == 0)
				isprime = false;
			break;

		}
		return isprime;
	}

}

package Samples;

public class Factorial {

	public static void main(String[] args) {
		int n = 10;

		int result = factorial(n);

		System.out.println("Factorial of " + n + "is" + result);

	}

	static int factorial(int n) {
		int result = 1;

		while (n > 1) {
			result *= n;
			n--;
		}
		return result;

	}


}

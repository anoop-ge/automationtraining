
package Samples;

public class TwoDimensional {

	public static void main(String[] args) {

		float pincome[][] = new float[4][4];
		pincome[0][0] = (float) 5.8;
		pincome[0][1] = (float) 18.2;
		pincome[0][2] = (float) 5.18;
		pincome[0][3] = (float) 10;

		pincome[1][0] = (float) 25.8;
		pincome[1][1] = (float) 16.4;
		pincome[1][2] = (float) 21.2;
		pincome[1][3] = (float) 10.2;

		pincome[2][0] = (float) 25.8;
		pincome[2][1] = (float) 16.4;
		pincome[2][2] = (float) 21.2;
		pincome[2][3] = (float) 10.2;

		pincome[3][0] = (float) 5.8;
		pincome[3][1] = (float) 18.2;
		pincome[3][2] = (float) 5.18;
		pincome[3][3] = (float) 10;

		print(pincome);

		float sum = sum(pincome);
		System.out.println("Sum of diagonals is" + sum);

	}

	static void print(float[][] arr) {

		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static float sum(float[][] arr) {
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];

		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][arr.length - i - 1];

		}
		return sum;
	}
}
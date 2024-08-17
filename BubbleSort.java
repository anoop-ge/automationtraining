package Samples;

public class BubbleSort {

	public static void main(String[] args)

	{

		int pincome[] = new int[5];

		pincome[0] = 32;
		pincome[1] = 21;
		pincome[2] = 54;
		pincome[3] = 64;
		pincome[4] = 89;

		System.out.println("----------Before Sorting-----------");

		print(pincome);

		System.out.println("----------After sorting------------");
		boolean ascending = false;
		sort(pincome, ascending);

		print(pincome);

	}

	static void print(int[] arr) {

		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);

		}

	}

	static int[] sort(int[] avalues, boolean ascending) {

		for (int i = 0; i < avalues.length; i++) {
			for (int j = 0; j < avalues.length - i - 1; j++) {

				if ((ascending && avalues[j] > avalues[j + 1]) || (!ascending && avalues[j] < avalues[j + 1])) {

					int tmp = avalues[j];
					avalues[j] = avalues[j + 1];
					avalues[j + 1] = tmp;

				}

			}
		}

		return avalues;

	}

}

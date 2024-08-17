package Samples;

public class PetrolPrices {

	public static void main(String[] args) {

		int price[] = new int[6];

		price[0] = 105;
		price[1] = 104;
		price[2] = 108;
		price[3] = 107;
		price[4] = 110;
		price[5] = 106;
		

		int average = averageprice(price);
		System.out.println("Average petrol price is" + average);

	}

	static int averageprice(int[] price)

	{
		int sum=0;
		for (int i = 0; i < price.length; i++) {

			sum = sum + price[i];
		}
		int avgprice = sum/price.length;

		
		return avgprice;

	}

}

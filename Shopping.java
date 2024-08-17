package Samples;

class ShoppingCart {

	Product aprod[];
	int cindex;


	ShoppingCart() {

		aprod = new Product[3];
		cindex = 0;


	}

	Product addProduct(Product prod) {
		aprod[cindex] = prod;
		cindex++;
		return prod;

	}

	void ListProducts() {
		for (int i = 0; i < cindex; i++) {

			aprod[i].display();
		}

	}
	
	float calculatePrice() {
		
		float totalprice=0;
		for (int i=0;i<cindex;i++) {
			
			totalprice+=aprod[i].price;
			
		}
		System.out.println("Total Price is"+totalprice);
		return totalprice;
		
		
		
	}

	void emptyCart() {
		aprod = new Product[3];
		cindex = 0;

	}

}

class Product {

	int id;
	String name;
	float price;
	static int number_of_prods;

	Product() {
		id = 0;
		name = "";
		price = 0;
		number_of_prods=100;


	}

	Product(int pid, String pname, float pprice) {
		id = pid;
		name = pname;
		price = pprice;
	}
static int getNumberofProds() {
		
		return number_of_prods;


		
	}
	void display() {

		System.out.println("Product id is  " + id + "-" + "Product name is " + name);
		Product.getNumberofProds();

	}

}

public class Shopping {

	public static void main(String[] args) {
        System.out.println("Total number of prods"+Product.getNumberofProds());

		Product prd1 = new Product(100, "Mobile", 24000);
		Product prd2 = new Product(101, "Laptop", 50000);
		Product prd3 = new Product(102, "Headset", 1000);

		ShoppingCart scart = new ShoppingCart();

		scart.addProduct(prd1);
		scart.addProduct(prd2);
		scart.addProduct(prd3);
		
	scart.calculatePrice();
		

		// scart.ListProducts();
		//scart.emptyCart();

		scart.ListProducts();

		//System.out.println("Card is empty");

	}

}
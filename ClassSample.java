package Samples;





class Product {

	int id;
	String name;
	static int number_of_prods;

	Product() {
		id = 0;
		name = "";
	}

	Product(int pid, String pname) {
		id = pid;
		name = pname;
		number_of_prods=100;
	}
	
	static int getNumberofProds() {
		
		return number_of_prods;


		
	}

	void display() {

		System.out.println("Product id is  "+id+"-"+"Product name is " + name);

	}

}

public class ClassSample {

	public static void main(String[] args) {
		Product prod = new Product(101, "Furniture");
		prod.display();

        System.out.println("Total number of prods"+Product.getNumberofProds());

		Product prdobj[] = new Product[3];



		prdobj[0] = new Product(100, "Mobiles");
		prdobj[1] = new Product(100, "Laptop");
		prdobj[2] = new Product(100, "Furniture Chair");

		for (Product prd : prdobj) {

			prd.display();
		}
		

	}

}

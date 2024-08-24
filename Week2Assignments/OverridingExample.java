package product;

//inheritance is a is-a relationship.
class Product {

	int id;

	String name;

	Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {

		System.out.println("Products display");

	}

	public String toString() {

		return "ID - " + id + "  Name - " + name;

	}

	public boolean equals(Product obj1, Product obj2) {

		if (obj1.id == obj2.id)
			return true;
		else
			return false;
	}

}

class ElectronicProduct extends Product {

	ElectronicProduct(int id, String name) {
		super(id, name);

	}

	float voltage;

	void display() {

		System.out.println("Electronic product display");
	}

}

public class OverridingExample {

	public static void main(String[] args) {

		// Product obj=new ElectronicProduct();

		// obj.display();

		Product obj1 = new Product(1, "Samsung");

		Product obj2 = new Product(2, "Samsung");

		System.out.println("Product ID matches  " + obj1.equals(obj1, obj2));

		System.out.println("Object display is" + obj1.toString());

	}

}

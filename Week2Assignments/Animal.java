package p1;

public abstract class Animal {

	String name;
	String color;

	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}

	void sound() {
	}

	public static void main(String args[]) {

		Elephant el = new Elephant("el1", "black");
		System.out.println(el.color);
		el.sound();

	}

}

class Elephant extends Animal {

	public Elephant(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

	public void sound() {

		System.out.println("Elephant Sound");
	}
}

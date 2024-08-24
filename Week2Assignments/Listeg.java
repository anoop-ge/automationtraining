package com.p9;

import java.util.*;

class City {
	String name;
	long pincode;
	String state;

	@Override
	public int hashCode() {
		return Objects.hash(name, pincode, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(name, other.name) && pincode == other.pincode && Objects.equals(state, other.state);
	}

	// constructor
	public City(String name, long pincode, String state) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.state = state;
	}

	// getter, setter

	// toString

	public String toString() {

		return "City [name=" + name + ", pincode=" + pincode + ", capital_city=" + state + "]";

	}

}

public class Listeg {

	public static void main(String[] args) {

		// Create LIst
		/*
		 * List cities=new ArrayList(); //add city
		 * 
		 * cities.add(new City("City1",234,"capital1"));
		 * 
		 * cities.add(new City("City2",235,"capital2"));
		 * 
		 * cities.add(new City("City3",236,"capital3"));
		 */

		// iterates and display

		Scanner scnr = new Scanner(System.in);

		List<City> cities = new ArrayList<City>(); // add city

		cities.add(new City("City1", 234, "capital1"));

		cities.add(new City("City2", 235, "capital2"));

		cities.add(new City("City3", 236, "capital3"));

		while (true) {

			System.out.println("Please enter city name");
			String icity = scnr.next();

			System.out.println("Please enter pincode");
			long ipincode = (long) scnr.nextLong();

			System.out.println("Please enter State name");
			String istate = scnr.next();

			cities.add(new City(icity, ipincode, istate));

			System.out.println("Do you want to continue (Y/N): ");

			String ic = scnr.next();

			if (ic.equals("N") || ic.equals("n"))
				break;

		}

		cities.add(2, new City("City2", 222, "capital2"));

		cities.remove(3);
		Iterator<City> itr = cities.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}
}
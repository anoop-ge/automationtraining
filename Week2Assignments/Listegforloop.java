package com.p8;

import java.util.*;

class City {
	String name;
	long pincode;
	String state;

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

public class Listegforloop {

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

		cities.add(2, new City("City2", 222, "capital2"));

		cities.remove(3);

		/*
		 * for (City city:cities)
		 * 
		 * System.out.println(city.toString());
		 * 
		 */

		for (int i = 0; i < cities.size(); i++) {

			System.out.println(cities.get(i).toString());

		}
	}

}

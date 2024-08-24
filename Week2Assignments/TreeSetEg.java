/*Display Countries based on Descending order of the GDP*/

package com.p9;

import java.util.*;

class Country {
	private String name;
	private double gdp;

	public Country(String name, double gdp) {
		super();
		this.name = name;
		this.gdp = gdp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGdp() {
		return gdp;
	}

	public void setGdp(double gdp) {
		this.gdp = gdp;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", gdp=" + gdp + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gdp, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Double.doubleToLongBits(gdp) == Double.doubleToLongBits(other.gdp) && Objects.equals(name, other.name);
	}

}

/*To Sort GDP in Descending Order*/
public class TreeSetEg {

	public static void main(String[] args) {
//TreeSet<String> tss=new TreeSet<String>(new MyComparator() );

		TreeSet<Country> tss = new TreeSet<Country>(new Mycomparator());
		tss.add(new Country("Canada", 123.55));
		tss.add(new Country("India", 782.55));
		tss.add(new Country("USA", 777.11));

		Iterator<Country> itr = tss.iterator();
		for (; itr.hasNext();) {

			System.out.println(itr.next());
		}
	}
}

class Mycomparator implements Comparator<Country> {

	public int compare(Country c1, Country c2) {
		return (int) (c2.getGdp() - c1.getGdp());
	}

}
package p5;

import java.util.Arrays;

class Department{
	private int id;
	private String deptname;
	private String hod_name;
	
	//constructor
	public Department(int id, String deptname, String hod_name) {
		this.id = id;
		this.deptname = deptname;
		this.hod_name = hod_name;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getHod_name() {
		return hod_name;
	}

	public void setHod_name(String hod_name) {
		this.hod_name = hod_name;
	}
	
	public String toString()
	{
	

		return deptname;
	}
	
	//setter, getter methods
}
class University{
	String name;
	String address;
	Department depts[];
	public University(String name, String address, Department[] depts) {
		this.name = name;
		this.address = address;
		this.depts = depts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Department[] getDepts() {
		return depts;
	}
	public void setDepts(Department[] depts) {
		this.depts = depts;
	}
	

	public String toString(){
		
		for(int i=0;i<=depts.length;i++) {
			
			
			
			return "University"+name+"Deptname"+Arrays.deepToString(depts);
				
				
				
				
		   }
		return "";

		}
}

public class Compositioneg {
public static void main(String[] args) {
	
	Department[] dept = new Department[2];
	
	dept[0]= new Department(1,"Science","");
	dept[1]= new Department(1,"Maths","");

	
	University un1=new University("Kerala Univer","address",dept);
	
	System.out.println(un1.toString());
	

}
}



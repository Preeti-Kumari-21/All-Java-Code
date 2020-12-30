package Map;

public class Employee_to_store_in_hashmap {
	
	int empid;
	String empname;
	
	public Employee_to_store_in_hashmap(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee_to_store_in_hashmap other = (Employee_to_store_in_hashmap) obj;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee_to_store_in_hashmap [empid=" + empid + ", empname=" + empname + "]";
	}
	
	
	

}

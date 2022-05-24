package corejava.collections.list.arraylist;

import java.util.Objects;

public class Employee {
	int empId;
	String empName;
	String empAddress;
	public Employee(int empId, String empName, String empAddress) {
	
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empAddress, empId, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empAddress, other.empAddress) && empId == other.empId
				&& Objects.equals(empName, other.empName);
	}
	

}

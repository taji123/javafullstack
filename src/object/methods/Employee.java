package object.methods;

import java.util.Objects;

public class Employee {
	int empID;
	String empName;
	String empState;
	public Employee(int empID, String empName, String empState) {
		this.empID = empID;
		this.empName = empName;
		this.empState = empState;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empID, empName, empState);
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
		return empID == other.empID && Objects.equals(empName, other.empName)
				&& Objects.equals(empState, other.empState);
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empState=" + empState + "]";
	}
	
	

}

package corejava.collections.set.hashset;

import java.util.Objects;

public class Student {
	int stuId;
	String stuName;
	String stuAdress;
	public Student(int stuId, String stuName, String stuAdress) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAdress = stuAdress;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAdress=" + stuAdress + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(stuAdress, stuId, stuName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(stuAdress, other.stuAdress) && stuId == other.stuId
				&& Objects.equals(stuName, other.stuName);
	}
	
	
	
	

}

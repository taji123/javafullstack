package object.methods;

public class Student implements Cloneable{
	int stuID;
	String stuName;
	String stuState;
	public Student(int stuID, String stuName, String stuState) {
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuState = stuState;
	}
	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", stuName=" + stuName + ", stuState=" + stuState + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student st=new Student(21421, "taj", "ap");
Student s=(Student) st.clone();
System.out.println(s);
System.out.println(st);
}
}
package object.methods;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee(12223, "taji", "ap");
		Employee emp1=new Employee(12223, "taji", "ap");
System.out.println(emp.equals(emp1));//it compares hashcode of the objects solutionis override euals and hashcode method which creats hashcode for parameters.
System.out.println(emp.hashCode());
System.out.println(emp1.hashCode());
System.out.println(emp);//to get the parameters we have to override tostring method "it willdisplay in strin g representation of object".
System.out.println(emp1);
	}
}

package corejava.collections.set.hashset;
import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<Student> set=new HashSet<>();
		set.add(new Student(11, "taji", "hyd"));
		set.add(new Student(32, "taj", "delhi"));
		set.add(new Student(11, "taji", "mumbai"));
		set.add(new Student(32, "taj", "km"));
		set.add(new Student(11, "taji", "mumbai"));
		set.add(new Student(32, "taj", "km"));
		System.out.println(set);
		 
	}

}

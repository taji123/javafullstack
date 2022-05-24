package corejava.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(123, "taji", "km"));
		list.add(new Employee(2, "taj", "hyd"));
		list.add(new Employee(2,"taj","hyd"));
System.out.println(list);
list.add(2, new Employee(1223, "taji", "ap"));
list.add(3, new Employee(1223, "taji", "ap"));
list.add(5, new Employee(1223, "taji", "ap"));
System.out.println(list);
List<Employee> list1=new ArrayList<Employee>();
list1.addAll(list);
System.out.println(list1);
list1.addAll(1, list);
System.out.println(list1);
	}

}

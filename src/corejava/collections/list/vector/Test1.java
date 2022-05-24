package corejava.collections.list.vector;

import java.util.List;
import java.util.Vector;

public class Test1 {
public static void main(String[] args) {
	List<Integer> list=new Vector<>();
	list.add(1);
	list.add(2);
	list.add(1);
	list.add(1);
	list.add(2);
	list.add(1);
	System.out.println(list);
}

}

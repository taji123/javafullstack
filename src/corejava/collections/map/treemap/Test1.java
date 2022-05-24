package corejava.collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Test1 {
public static void main(String[] args) {
	Map<Integer, String> map=new TreeMap<>();
	map.put(1, "taji");
	map.put(3, "taj");
	map.put(2, "taji");
	System.out.println(map);
}
}

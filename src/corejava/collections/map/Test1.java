package corejava.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {
public static void main(String[] args) {
	/*Map<Integer, Stu> map=new HashMap<>();
	map.put(new Integer(1), new Stu(2131, "taji", "delhi"));
	map.put( new Integer(2), new Stu(314351, "taj", "hyd"));
	map.put(new Integer(3),new Stu(56352, "taji", "delhi"));
	System.out.println(map.get(2));
	System.out.println(map);
	map.put( (4), new Stu(2131, "taji", "delhi"));
	map.put(  (5), new Stu(314351, "taj", "hyd"));
	map.put( (6),new Stu(56352, "taji", "delhi"));
	System.out.println(map);*/
	Map<Int, Stu> map1=new HashMap<>();
	map1.put(new Int(131, "taj"), new Stu(515362153, "taji", "hyd"));
	map1.put(new Int(1311, "taj"), new Stu(515362, "taji", "delhi"));
System.out.println(map1);
Set<Entry<Int, Stu>>  entries=map1.entrySet();
Iterator<Entry<Int, Stu>> iterator=entries.iterator();
while(iterator.hasNext()) {
	Entry<Int, Stu> entry=iterator.next();
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());
}

}

}

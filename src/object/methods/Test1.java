package object.methods;

import java.lang.reflect.Constructor;

public class Test1 {

	public static void main(String[] args)  {
	Student st=new Student(21421, "taj", "ap");
	Student st1=new Student(21421, "taj", "ap");
	Class  CLS=st.getClass();
System.out.println(CLS.getName());
 System.out.println(CLS.getClassLoader());
  Constructor[] con=CLS.getDeclaredConstructors();
  for(Constructor c:con) {
System.out.println(c);
  }

	}

}

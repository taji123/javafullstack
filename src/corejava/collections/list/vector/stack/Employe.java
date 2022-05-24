package corejava.collections.list.vector.stack;

import java.util.Stack;
import java.util.Vector;

public class Employe {
public static void main(String[] args) {
	Stack<Integer> stack=new Stack<>();
	stack.push(1);
	stack.push(565);
	stack.push(63);
	System.out.println(stack);
	System.out.println(stack.pop());
	System.out.println(stack);
	System.out.println(stack.peek());
	System.out.println(stack);
}
}

package corejava.collections.queue.priortyqueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class test1 {
	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityBlockingQueue<Integer>();
		queue.add(1);
		queue.add(413);
		queue.add(63);
		queue.add(5345526);
		queue.add(12321);
		queue.add(1);
		queue.add(413);
		queue.add(63);
		queue.add(5345526);
		queue.add(12321);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		
	
Iterator iterator=queue.iterator();
while(iterator.hasNext()) {
Integer i1=(Integer) iterator.next();
System.out.println(i1);
}

	}
}


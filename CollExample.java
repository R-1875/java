package Collections;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollExample {
	
	public void Hash()
	{
		HashSet<String> hset = new HashSet<String>();
		hset.add("Manager");
		hset.add("Engineer");
		hset.add("Data Manager");
		hset.add("Staff");
		
		hset.add("Engineer");
		hset.add(null);
		hset.add(null);
		
		System.out.println(hset);
	}
	
	
	public void Queues()
	{
		PriorityQueue<String> qu = new PriorityQueue<String>();
		qu.add("Amit");
		qu.add("Amey");
		qu.add("Ajay");
		qu.add("Ajit");
		System.out.println("Head "+qu.element());
		System.out.println("Peek "+qu.peek());
		
		java.util.Iterator<String> itr = qu.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("__________");
		
		qu.remove();
		qu.poll();
		System.out.println("After removing elements");
		java.util.Iterator<String> itr2 = qu.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		}
	

}

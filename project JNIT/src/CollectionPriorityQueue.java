import java.util.ArrayDeque;
import java.util.PriorityQueue;
public class CollectionPriorityQueue {

	public static void main(String[] args) {
		ArrayDeque<Integer> aq=new ArrayDeque<>();//the value will come in same order as written
		PriorityQueue<Integer> pq=new PriorityQueue();
		//pq.add(45);
		pq.add(34);
		pq.add(30);
		pq.add(65);
		pq.add(95);
		pq.add(10);
		System.out.println(pq); 
		aq.add(45);
		aq.add(34);
		aq.add(40);
		aq.add(65);
		aq.add(95);
		aq.add(20);
		System.out.println(aq);
		
	}

}

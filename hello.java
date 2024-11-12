import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Hello {

    public static void main(String[] args) {
        
    PriorityQueue<Integer> pq = new PriorityQueue<>();

   pq.add(39);
   pq.add(20);
   pq.add(123);
   pq.add(3);
     

pq.poll();
System.out.println(pq);
System.out.println(pq.peek());
System.out.println(pq.poll());
System.out.println(pq);
    }
}
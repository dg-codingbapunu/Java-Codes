
import java.util.Comparator;
import java.util.PriorityQueue;



public class Hello {

    public static void main(String[] args) {
        
// Priority Queue



PriorityQueue<Integer> pq = new  PriorityQueue<>(Comparator.reverseOrder());

pq.offer(4);
pq.offer(39);
pq.offer(30); 
pq.offer(29);// Min heap Implement Automatically

System.out.println(pq.poll());
System.out.println(pq.peek());

System.out.println(pq);



    }

}





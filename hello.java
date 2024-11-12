import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Hello {

    public static void main(String[] args) {
        
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // max heap 

   pq.add(39);
   pq.add(20);
   pq.add(123);
   pq.add(3);
     
System.out.println(pq);

    }
}
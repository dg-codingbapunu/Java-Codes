import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Hello {

    public static void main(String[] args) {
        
   
        ArrayDeque <Integer> adq = new ArrayDeque<>();
        
        adq.offer(34);
        adq.offerFirst(2);
        adq.offerLast(39);
        adq.offerFirst(3);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());



        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

        System.out.println(adq);

    }
}
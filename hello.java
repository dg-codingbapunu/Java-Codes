import java.util.LinkedList;
import java.util.Queue;

public class Hello {

    public static void main(String[] args) {
        
   
        Queue <Integer> queue = new LinkedList<>();


        queue.offer(12);
        queue.offer(122);
        queue.offer(123);
        queue.offer(132);

        System.out.println("queue:" + queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
       


    }
}
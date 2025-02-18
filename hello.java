
import java.util.LinkedList;
import java.util.Queue;

public class Hello {

    public static void main(String[] args) {
        
Queue<Integer> queue = new LinkedList<>();

queue.offer(3);
queue.offer(9);
queue.offer(93);
queue.offer(7);

System.out.println(queue);
System.out.println(queue.poll());
System.out.println(queue.peek());
System.out.println(queue);




    }

}





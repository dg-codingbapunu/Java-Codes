
import java.util.ArrayDeque;





public class Hello {

    public static void main(String[] args) {
        
// Priority Queue

ArrayDeque <Integer> adq = new ArrayDeque<>();


adq.offerLast(2);
adq.offer(7);
adq.offer(70);
adq.offer(72);
adq.offer(73);
adq.offerFirst(34);

System.out.println(adq.peekLast());
System.out.println(adq.peekFirst());



    }

}





import java.util.ArrayList;
import java.util.List;

public class Hello {

    public static void main(String[] args) {

      
    List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(9);
       list.add(7);
    //    System.out.println(list);
       
list.add(1, 70);
System.out.println(list);
// System.out.println(list.get(0));
   list.remove(2);
   System.out.println(list);

    }
}
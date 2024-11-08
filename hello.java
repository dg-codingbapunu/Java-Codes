import java.util.ArrayList;
import java.util.List;

public class Hello {

    public static void main(String[] args) {

      
    List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(7);
        list.add(90);
        list.add(10);
        list.add(100);
        list.add(890);

     for (int n :list){
        System.out.println(n);
     }

    }
}
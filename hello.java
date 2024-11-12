import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hello {

    public static void main(String[] args) {
        
   // set not allowed duplicate element


   Set<Integer> set = new TreeSet<>();

   set.add(30); 
   set.add(20);  
   set.add(50);  
   set.add(60);  
   set.add(10);  

 System.out.println(set);

 set.remove(30);  
 System.out.println(set.contains(60));
 
 set.clear();
 System.out.println(set.isEmpty());



    }
}
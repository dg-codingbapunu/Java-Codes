import java.util.HashSet;
import java.util.Set;

public class Hello {

    public static void main(String[] args) {
        
   // set not allowed duplicate element


   Set<Integer> set = new HashSet<>();

   set.add(30); 
   set.add(40);  
   set.add(50);  
   set.add(60);  
   set.add(30);  

//  System.out.println(set);

 set.remove(30);  
 System.out.println(set.contains(30));
 
 System.out.println(set);

    }
}
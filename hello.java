
import java.util.Map;
import java.util.TreeMap;

public class Hello {

    public static void main(String[] args) {
        

      Map<String , Integer> numbers = new TreeMap<>();


        numbers.put("one", 1);
       
        numbers.put("three", 3);
        numbers.put("two", 4);
        numbers.put("five", 5);
        numbers.put("alpha", 100);

        numbers.remove("alpha");
  
  System.out.println(numbers);
   
  for (String key: numbers.keySet()) {

    System.out.println(key);
  }


  for (Integer value: numbers.values()) {

    System.out.println(value);
  }
       


    }

 
}
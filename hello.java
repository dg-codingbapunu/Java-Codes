import java.util.HashMap;
import java.util.Map;

public class Hello {

    public static void main(String[] args) {
        

      Map<String , Integer> numbers = new HashMap<>();


        numbers.put("one", 1);
       
        numbers.put("three", 3);
        numbers.put("two", 4);
  if (!numbers.containsKey("one")) {

    numbers.put("one", 2);

  }

   
  for (String key: numbers.keySet()) {

    System.out.println(key);
  }


  for (Integer value: numbers.values()) {

    System.out.println(value);
  }
       


    }

 
}
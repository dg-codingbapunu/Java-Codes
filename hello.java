import java.util.ArrayList;
import java.util.List;


public class Hello
{
  public static void main(String[] args) 
  {

  List <Integer> nums = new ArrayList<>();

  
  nums.add(8);
  nums.add(18);
  nums.add(67);
  nums.add(12);
  nums.add(6);
  nums.add(79);


int result = nums.stream()
              .filter(i -> i%2==0)
              .map(i -> i *2)
              .reduce(0,(p,e) -> p + e);

System.out.println(result);

// you cant print s1 (stream) then one time it gives us copilation error

    
  }
}